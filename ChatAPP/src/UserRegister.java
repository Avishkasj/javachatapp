import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class UserRegister extends JFrame implements ActionListener {
    private JLabel titleLabel, emailLabel, usernameLabel, passwordLabel, nickNameLabel, profilePictureLabel;
    private JTextField emailField, usernameField, passwordField, nickNameField;
    private JButton chooseImageButton, registerButton;
    private JFileChooser fileChooser;
    private File profilePicture;

    public UserRegister() {
        super("User Registration Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        titleLabel = new JLabel("User Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        emailLabel = new JLabel("Email:");
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        nickNameLabel = new JLabel("Nick Name:");
        profilePictureLabel = new JLabel("Profile Picture:");
        emailField = new JTextField(20);
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        nickNameField = new JTextField(20);
        chooseImageButton = new JButton("Choose Image");
        registerButton = new JButton("Register");
        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Add components to layout
        setLayout(new GridLayout(7, 2, 10, 10));
        add(titleLabel);
        add(new JLabel(""));
        add(emailLabel);
        add(emailField);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(nickNameLabel);
        add(nickNameField);
        add(profilePictureLabel);
        add(chooseImageButton);
        add(new JLabel(""));
        add(registerButton);

        // Add action listeners
        chooseImageButton.addActionListener(this);
        registerButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseImageButton) {
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                profilePicture = fileChooser.getSelectedFile();
                profilePictureLabel.setText("Profile Picture: " + profilePicture.getName());
            }
        } else if (e.getSource() == registerButton) {
            String email = emailField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getText());
            String nickName = nickNameField.getText();

            // Validate input
            if (email.isEmpty() || username.isEmpty() || password.isEmpty() || nickName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (profilePicture == null) {
                JOptionPane.showMessageDialog(this, "Please choose a profile picture.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // TODO: Implement user registration logic here

            JOptionPane.showMessageDialog(this, "User registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        UserRegister form = new UserRegister();
        form.setVisible(true);
    }
}
