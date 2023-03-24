import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class ChatRoomImpl extends UnicastRemoteObject implements ChatRoom {
    private List<ChatClient> clients;
    private List<String> chatrooms;

    public ChatRoomImpl() throws RemoteException {
        super();
        clients = new ArrayList<ChatClient>();
        chatrooms = new ArrayList<String>();
    }

    public void subscribe(ChatClient client) throws RemoteException {
        clients.add(client);
        System.out.println("Client subscribed: " + client);
    }

    public void unsubscribe(ChatClient client) throws RemoteException {
        clients.remove(client);
        System.out.println("Client unsubscribed: " + client);
    }

    public void broadcast(String message) throws RemoteException {
        System.out.println("Broadcasting message: " + message);
        for (ChatClient client : clients) {
            client.receive(message);
        }
    }

    public void createChatroom(String chatroomName) throws RemoteException {
        chatrooms.add(chatroomName);
        System.out.println("Chatroom created: " + chatroomName);
    }

    public List<String> getChatrooms() throws RemoteException {
        return chatrooms;
    }

    public static void main(String[] args) throws Exception {
        ChatRoomImpl chatRoom = new ChatRoomImpl();

        JFrame frame = new JFrame("Admin Chatroom Management");
        JPanel panel = new JPanel();
        JTextField chatroomNameField = new JTextField(20);
        JButton createChatroomButton = new JButton("Create Chatroom");
        DefaultListModel<String> chatroomListModel = new DefaultListModel<String>();
        JList<String> chatroomList = new JList<String>(chatroomListModel);
        JScrollPane chatroomListScrollPane = new JScrollPane(chatroomList);

        createChatroomButton.addActionListener(e -> {
            String chatroomName = chatroomNameField.getText();
            if (!chatroomName.isEmpty()) {
                try {
                    chatRoom.createChatroom(chatroomName);
                    chatroomListModel.addElement(chatroomName);
                    chatroomNameField.setText("");
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                }
            }
        });

        panel.add(chatroomNameField);
        panel.add(createChatroomButton);
        panel.add(chatroomListScrollPane);

        chatroomList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
