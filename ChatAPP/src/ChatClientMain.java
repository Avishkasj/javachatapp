import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.rmi.Naming;

public class ChatClientMain {
    private JTextPane chatArea;
    private ChatClient client;


    public ChatClientMain() {
        // Create the UI
        JFrame frame = new JFrame("Multi-User Chat");
        chatArea = new JTextPane();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a panel for the text input field and submit button
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        inputPanel.add(textField, BorderLayout.CENTER);
        JButton submitButton = new JButton("Submit");
        inputPanel.add(submitButton, BorderLayout.EAST);
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

        textField.addActionListener(e -> submitMessage(textField.getText().trim()));
        submitButton.addActionListener(e -> submitMessage(textField.getText().trim()));
    }

    private void submitMessage(String message) {
        if (!message.isEmpty()) {
            try {
                client.sendMessage(message);
                addMessage("You: " + message, true);
            } catch (Exception ex) {
                System.err.println("Error sending message: " + ex.getMessage());
                ex.printStackTrace();
            }
            JTextComponent textField = (JTextComponent) chatArea.getParent().getComponent(1);
            textField.setText("");
        }
    }

    public void displayMessage(String message) {
        addMessage("Other: " + message, false);
    }

    private void addMessage(String message, boolean isRightAligned) {
        StyledDocument doc = chatArea.getStyledDocument();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setForeground(attributeSet, Color.BLACK);
        StyleConstants.setBackground(attributeSet, Color.WHITE);
        StyleConstants.setSpaceAbove(attributeSet, 5);
        StyleConstants.setSpaceBelow(attributeSet, 5);
        StyleConstants.setFontSize(attributeSet, 14);
        StyleConstants.setFontFamily(attributeSet, "Arial");
        StyleConstants.setBold(attributeSet, false);

        StyleConstants.setAlignment(attributeSet, isRightAligned ? StyleConstants.ALIGN_RIGHT : StyleConstants.ALIGN_LEFT);
        StyleConstants.setForeground(attributeSet, isRightAligned ? Color.BLUE : Color.BLACK);

        try {
            doc.insertString(doc.getLength(), message + "\n", attributeSet);
        } catch (Exception ex) {
            System.err.println("Error adding message: " + ex.getMessage());
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ChatClientMain();

    }
}
