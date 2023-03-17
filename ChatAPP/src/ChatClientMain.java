import javax.swing.*;
import java.awt.*;
import java.rmi.Naming;


public class ChatClientMain {
    private JTextArea chatArea;
    private ChatClient client;

    public ChatClientMain() {
        // Create the UI
        JFrame frame = new JFrame("Multi-User Chat");
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a panel for the text input field
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        JTextField textField = new JTextField();
        inputPanel.add(textField);
        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Start the message loop
        try {
            ChatServer server = (ChatServer) Naming.lookup("rmi://localhost/chatServer");
            client = new ChatClientImpl(server, this);
            server.register(client);
            System.out.println("Chat client ready");
        } catch (Exception e) {
            System.err.println("Chat client exception: " + e.getMessage());
            e.printStackTrace();
        }

        textField.addActionListener(e -> {
            String message = textField.getText().trim();
            if (!message.isEmpty()) {
                try {
                    client.sendMessage(message);
                    textField.setText("");
                } catch (Exception ex) {
                    System.err.println("Error sending message: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
    }

    public void displayMessage(String message) {
        chatArea.append(message + "\n");
    }

    public static void main(String[] args) {
        new ChatClientMain();
    }
}
