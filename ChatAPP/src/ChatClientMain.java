import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.rmi.Naming;

public class ChatClientMain {
    public static void main(String[] args) {
        new ChatClientMain();
    }
    private JTextArea chatArea;
    private ChatClientImpl client;

    public ChatClientMain() {
        try {
            ChatServer server = (ChatServer) Naming.lookup("rmi://localhost/chatServer");
            client = new ChatClientImpl(server, this);
            server.register(client);
            System.out.println("Chat client ready");
        } catch (Exception e) {
            System.err.println("Chat client exception: " + e.getMessage());
            e.printStackTrace();
        }

        // Create the UI
        JFrame frame = new JFrame("Multi-User Chat");
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Start the message loop
        while (true) {
            // Get input from the user using a dialog box
            String message = JOptionPane.showInputDialog(frame, "Enter a message:");

            // Send the message to the server
            try {
                client.sendMessage(message);
            } catch (Exception e) {
                System.err.println("Error sending message: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void displayMessage(String message) {
        chatArea.append(message + "\n");
    }
}


