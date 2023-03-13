import javax.swing.JOptionPane;
import java.rmi.Naming;

public class ChatClientMain {
    public static void main(String[] args) {
        try {
            ChatServer server = (ChatServer) Naming.lookup("rmi://localhost/chatServer");
            ChatClient client = new ChatClientImpl(server);
            server.register(client);
            System.out.println("Chat client ready");
            while (true) {
                // Get input from the user using a dialog box
                String message = JOptionPane.showInputDialog("Enter a message:");

                // Send the message to the server
                client.sendMessage(message);
            }
        } catch (Exception e) {
            System.err.println("Chat client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
