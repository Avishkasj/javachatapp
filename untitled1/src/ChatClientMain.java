import java.rmi.Naming;

public class ChatClientMain {
    public static void main(String[] args) {
        try {
            ChatServer server = (ChatServer) Naming.lookup("rmi://localhost/chatServer");
            ChatClient client = new ChatClientImpl(server);
            server.register(client);
            System.out.println("Chat client ready");
            while (true) {
                // Read input from the user and send it to the server
                String message = System.console().readLine();
                client.sendMessage(message);
            }
        } catch (Exception e) {
            System.err.println("Chat client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
