import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ChatServerImpl extends UnicastRemoteObject implements ChatServer {
    private List<ChatClient> clients;
    private Map<String, ChatRoom> chatRooms;


    public ChatServerImpl() throws RemoteException {
        super();
        clients = new ArrayList<ChatClient>();
        chatRooms = new HashMap<String, ChatRoom>();
        clients = new ArrayList<ChatClient>();
    }

    public void broadcast(String message) throws RemoteException {
        System.out.println("Broadcasting message: " + message);
        for (ChatClient client : clients) {
            client.receive(message);
        }
    }


    public void register(ChatClient client) throws RemoteException {
        clients.add(client);
        System.out.println("Client registered: " + client);
    }

    public void createChatRoom(String name) throws RemoteException {
        ChatRoom chatRoom = new ChatRoomImpl();
        chatRooms.put(name, chatRoom);
        System.out.println("Chat room created: " + name);
    }

    public void deleteChatRoom(String name) throws RemoteException {
        chatRooms.remove(name);
        System.out.println("Chat room deleted: " + name);
    }

    public ChatRoom getChatRoom(String name) throws RemoteException {
        return chatRooms.get(name);
    }
}
