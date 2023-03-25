package fotchat.interfaces;

import fotchat.dbmanager.DBManager;
import fotchat.pogos.Groups;
import fotchat.pogos.User;
import fotchat.services.Chat;
import fotchat.services.ChatService;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Login extends javax.swing.JFrame {

    Registry reg;
    Chat chat;

    static int x, yy;
    static ChatBall chatBall;
    int id;
    chatUser u;

    public Login() {
        initComponents();

        Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screen_size.width - 425, getY());

        //start
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);

        signinDefault();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layered_pane = new javax.swing.JLayeredPane();
        title_panel = new javax.swing.JPanel();
        titlebar = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signin_panel = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        eyeOpenIcon = new javax.swing.JLabel();
        eyeCloseIcon = new javax.swing.JLabel();
        signin_btn = new javax.swing.JLabel();
        signin_error = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JTextField();
        forgotPasswordHover = new javax.swing.JTextField();
        signUpLink = new javax.swing.JTextField();
        signUpLinkHover = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        signup_panel = new javax.swing.JPanel();
        signupProfileIcon = new javax.swing.JLabel();
        signupEmail = new javax.swing.JTextField();
        signupUsername = new javax.swing.JTextField();
        signUpPassword = new javax.swing.JPasswordField();
        signupEyeOpen = new javax.swing.JLabel();
        signupEyeClose = new javax.swing.JLabel();
        signupNickname = new javax.swing.JTextField();
        signup_btn = new javax.swing.JLabel();
        signup_error = new javax.swing.JLabel();
        signinLink = new javax.swing.JTextField();
        signinLinkHover = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        forgot_password_panel = new javax.swing.JPanel();
        fp_logo = new javax.swing.JLabel();
        fp_resend_code = new javax.swing.JLabel();
        fp_description = new javax.swing.JLabel();
        fpRecoveryCode = new javax.swing.JTextField();
        fp_recovery_code_line = new javax.swing.JLabel();
        fp_confirm_btn = new javax.swing.JLabel();
        fp_error = new javax.swing.JLabel();
        fpSigninLink = new javax.swing.JTextField();
        signInLinkHover = new javax.swing.JTextField();
        chat_body_panel = new javax.swing.JPanel();
        chatlist_title2 = new javax.swing.JLabel();
        client_logout2 = new javax.swing.JLabel();
        msgScrollPane = new javax.swing.JScrollPane();
        chatBackground = new javax.swing.JPanel();
        msg_typer = new javax.swing.JTextField();
        send_btn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chat_list_panel = new javax.swing.JPanel();
        chatlist_title = new javax.swing.JLabel();
        chatlist_setting = new javax.swing.JLabel();
        client_logout1 = new javax.swing.JLabel();
        chat_list_scrollPane = new javax.swing.JScrollPane();
        userGroupsPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        setting_panel = new javax.swing.JPanel();
        setting_lable = new javax.swing.JLabel();
        setting_previous = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        update_pwd_panel = new javax.swing.JPanel();
        new_pwd = new javax.swing.JTextField();
        new_pwd2 = new javax.swing.JTextField();
        current_pwd = new javax.swing.JTextField();
        success_msg = new javax.swing.JLabel();
        signin_link_hover1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        admin_panel = new javax.swing.JPanel();
        signup_error1 = new javax.swing.JLabel();
        create_new_chat_btn = new javax.swing.JLabel();
        group_scrollPane = new javax.swing.JScrollPane();
        groupPanel = new javax.swing.JPanel();
        logout1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        group_create_panel = new javax.swing.JPanel();
        g_name_text = new javax.swing.JTextField();
        create_group_btn = new javax.swing.JLabel();
        group_creation_state = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        g_dec_textArea = new javax.swing.JTextArea();
        logout2 = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        update_panel = new javax.swing.JPanel();
        update_profile_pic1 = new javax.swing.JLabel();
        update_email = new javax.swing.JTextField();
        update_nickname = new javax.swing.JTextField();
        success_msg1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        success_update_msg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 640));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layered_pane.setBackground(new java.awt.Color(28, 36, 47));
        layered_pane.setPreferredSize(new java.awt.Dimension(470, 640));

        title_panel.setBackground(new java.awt.Color(28, 36, 47));
        title_panel.setPreferredSize(new java.awt.Dimension(470, 50));
        title_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlebar.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        titlebar.setForeground(new java.awt.Color(111, 117, 124));
        titlebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlebarMouseDragged(evt);
            }
        });
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlebarMousePressed(evt);
            }
        });
        title_panel.add(titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        minimize.setToolTipText("Minimize");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        title_panel.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 40, 40));

        close.setToolTipText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        title_panel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/title.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        title_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 50));

        signin_panel.setBackground(new java.awt.Color(28, 36, 47));
        signin_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        signin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(51, 51, 51));
        username.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setAutoscrolls(false);
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        signin_panel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 210, 30));

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        signin_panel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 210, 30));

        eyeOpenIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        eyeOpenIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eyeOpenIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeOpenIconMouseClicked(evt);
            }
        });
        signin_panel.add(eyeOpenIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 20, 20));

        eyeCloseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        eyeCloseIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eyeCloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeCloseIconMouseClicked(evt);
            }
        });
        signin_panel.add(eyeCloseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 20, 20));

        signin_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_btnMouseClicked(evt);
            }
        });
        signin_panel.add(signin_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 30));

        signin_error.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        signin_error.setForeground(new java.awt.Color(255, 0, 0));
        signin_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_panel.add(signin_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 20));

        forgotPassword.setEditable(false);
        forgotPassword.setBackground(new java.awt.Color(51, 51, 51));
        forgotPassword.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(111, 117, 124));
        forgotPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgotPassword.setText("Forgot Password ?");
        forgotPassword.setBorder(null);
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseEntered(evt);
            }
        });
        signin_panel.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 170, 30));

        forgotPasswordHover.setEditable(false);
        forgotPasswordHover.setBackground(new java.awt.Color(28, 36, 47));
        forgotPasswordHover.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        forgotPasswordHover.setForeground(new java.awt.Color(206, 47, 131));
        forgotPasswordHover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgotPasswordHover.setText("Forgot Password ?");
        forgotPasswordHover.setBorder(null);
        forgotPasswordHover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPasswordHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordHoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordHoverMouseExited(evt);
            }
        });
        forgotPasswordHover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordHoverActionPerformed(evt);
            }
        });
        signin_panel.add(forgotPasswordHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 170, 30));

        signUpLink.setBackground(new java.awt.Color(51, 51, 51));
        signUpLink.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        signUpLink.setForeground(new java.awt.Color(111, 117, 124));
        signUpLink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signUpLink.setText("Sign Up");
        signUpLink.setBorder(null);
        signUpLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpLinkMouseEntered(evt);
            }
        });
        signUpLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpLinkActionPerformed(evt);
            }
        });
        signin_panel.add(signUpLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 90, 30));

        signUpLinkHover.setEditable(false);
        signUpLinkHover.setBackground(new java.awt.Color(51, 51, 51));
        signUpLinkHover.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        signUpLinkHover.setForeground(new java.awt.Color(206, 47, 131));
        signUpLinkHover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signUpLinkHover.setText("Sign Up");
        signUpLinkHover.setBorder(null);
        signUpLinkHover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLinkHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLinkHoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpLinkHoverMouseExited(evt);
            }
        });
        signin_panel.add(signUpLinkHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/login.png"))); // NOI18N
        signin_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/profileChange.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        signin_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        signup_panel.setBackground(new java.awt.Color(28, 36, 47));
        signup_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        signup_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupProfileIcon.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        signupProfileIcon.setForeground(new java.awt.Color(255, 255, 255));
        signupProfileIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupProfileIcon.setText("Profile Picture");
        signupProfileIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupProfileIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupProfileIconMouseClicked(evt);
            }
        });
        signup_panel.add(signupProfileIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, 140));

        signupEmail.setBackground(new java.awt.Color(51, 51, 51));
        signupEmail.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        signupEmail.setForeground(new java.awt.Color(255, 255, 255));
        signupEmail.setText("Email");
        signupEmail.setAutoscrolls(false);
        signupEmail.setBorder(null);
        signupEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupEmailFocusLost(evt);
            }
        });
        signupEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupEmailMouseClicked(evt);
            }
        });
        signup_panel.add(signupEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 200, 20));

        signupUsername.setBackground(new java.awt.Color(51, 51, 51));
        signupUsername.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        signupUsername.setForeground(new java.awt.Color(255, 255, 255));
        signupUsername.setText("Username");
        signupUsername.setAutoscrolls(false);
        signupUsername.setBorder(null);
        signupUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupUsernameFocusLost(evt);
            }
        });
        signupUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupUsernameMouseClicked(evt);
            }
        });
        signup_panel.add(signupUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, 20));

        signUpPassword.setBackground(new java.awt.Color(51, 51, 51));
        signUpPassword.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        signUpPassword.setForeground(new java.awt.Color(255, 255, 255));
        signUpPassword.setText("Password");
        signUpPassword.setBorder(null);
        signUpPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signUpPasswordFocusLost(evt);
            }
        });
        signUpPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpPasswordMouseClicked(evt);
            }
        });
        signup_panel.add(signUpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 30));

        signupEyeOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        signupEyeOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupEyeOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupEyeOpenMouseClicked(evt);
            }
        });
        signup_panel.add(signupEyeOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 20, 20));

        signupEyeClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        signupEyeClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupEyeClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupEyeCloseMouseClicked(evt);
            }
        });
        signup_panel.add(signupEyeClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 20, 20));

        signupNickname.setBackground(new java.awt.Color(51, 51, 51));
        signupNickname.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        signupNickname.setForeground(new java.awt.Color(255, 255, 255));
        signupNickname.setText("Nick name");
        signupNickname.setAutoscrolls(false);
        signupNickname.setBorder(null);
        signupNickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupNicknameFocusLost(evt);
            }
        });
        signupNickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupNicknameMouseClicked(evt);
            }
        });
        signup_panel.add(signupNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 200, 30));

        signup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btnMouseClicked(evt);
            }
        });
        signup_panel.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 30));

        signup_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_error.setForeground(new java.awt.Color(206, 47, 131));
        signup_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_panel.add(signup_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 190, 20));

        signinLink.setBackground(new java.awt.Color(51, 51, 51));
        signinLink.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        signinLink.setForeground(new java.awt.Color(255, 255, 255));
        signinLink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signinLink.setText("Sign In");
        signinLink.setBorder(null);
        signinLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinLinkMouseEntered(evt);
            }
        });
        signinLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinLinkActionPerformed(evt);
            }
        });
        signup_panel.add(signinLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 80, 30));

        signinLinkHover.setEditable(false);
        signinLinkHover.setBackground(new java.awt.Color(51, 51, 51));
        signinLinkHover.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        signinLinkHover.setForeground(new java.awt.Color(206, 47, 131));
        signinLinkHover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signinLinkHover.setText("Sign In");
        signinLinkHover.setBorder(null);
        signinLinkHover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinLinkHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinLinkHoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinLinkHoverMouseExited(evt);
            }
        });
        signup_panel.add(signinLinkHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 60, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/signup.png"))); // NOI18N
        signup_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        jLabel9.setText("jLabel9");
        signup_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        forgot_password_panel.setBackground(new java.awt.Color(28, 36, 47));
        forgot_password_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        forgot_password_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fp_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/chatBall.png"))); // NOI18N
        forgot_password_panel.add(fp_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 100, 110));

        fp_resend_code.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        fp_resend_code.setForeground(new java.awt.Color(206, 47, 131));
        fp_resend_code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_resend_code.setText("resend code.");
        fp_resend_code.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fp_resend_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 120, -1));

        fp_description.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        fp_description.setForeground(new java.awt.Color(111, 117, 124));
        fp_description.setText("<html>We've sent a recovery code to your email.<br>Please enter the code to change your password. If you haven't received any mail, please</html>");
        forgot_password_panel.add(fp_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 260, 160));

        fpRecoveryCode.setBackground(new java.awt.Color(28, 36, 47));
        fpRecoveryCode.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        fpRecoveryCode.setForeground(new java.awt.Color(255, 255, 255));
        fpRecoveryCode.setText("Recovery code");
        fpRecoveryCode.setAutoscrolls(false);
        fpRecoveryCode.setBorder(null);
        fpRecoveryCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fpRecoveryCodeFocusLost(evt);
            }
        });
        fpRecoveryCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpRecoveryCodeMouseClicked(evt);
            }
        });
        forgot_password_panel.add(fpRecoveryCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 240, 20));

        fp_recovery_code_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        fp_recovery_code_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        forgot_password_panel.add(fp_recovery_code_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, 10));

        fp_confirm_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/confirm_pink.png"))); // NOI18N
        fp_confirm_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fp_confirm_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 200, 30));

        fp_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_error.setForeground(new java.awt.Color(206, 47, 131));
        fp_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_error.setText("username and password are required");
        forgot_password_panel.add(fp_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 310, -1));

        fpSigninLink.setBackground(new java.awt.Color(28, 36, 47));
        fpSigninLink.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        fpSigninLink.setForeground(new java.awt.Color(255, 255, 255));
        fpSigninLink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fpSigninLink.setText("Sign In");
        fpSigninLink.setBorder(null);
        fpSigninLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fpSigninLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpSigninLinkMouseEntered(evt);
            }
        });
        forgot_password_panel.add(fpSigninLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 90, 30));

        signInLinkHover.setEditable(false);
        signInLinkHover.setBackground(new java.awt.Color(28, 36, 47));
        signInLinkHover.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        signInLinkHover.setForeground(new java.awt.Color(206, 47, 131));
        signInLinkHover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signInLinkHover.setText("Sign In");
        signInLinkHover.setBorder(null);
        signInLinkHover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInLinkHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLinkHoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInLinkHoverMouseExited(evt);
            }
        });
        forgot_password_panel.add(signInLinkHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 70, 30));

        chat_body_panel.setBackground(new java.awt.Color(28, 36, 47));
        chat_body_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        chat_body_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title2.setForeground(new java.awt.Color(111, 117, 124));
        chat_body_panel.add(chatlist_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        client_logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout2MouseClicked(evt);
            }
        });
        chat_body_panel.add(client_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 30));

        chatBackground.setBackground(new java.awt.Color(28, 36, 47));
        chatBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        msgScrollPane.setViewportView(chatBackground);

        chat_body_panel.add(msgScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 390, 420));

        msg_typer.setBackground(new java.awt.Color(51, 51, 51));
        msg_typer.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        msg_typer.setForeground(new java.awt.Color(255, 255, 255));
        msg_typer.setBorder(null);
        msg_typer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msg_typerKeyPressed(evt);
            }
        });
        chat_body_panel.add(msg_typer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 310, 40));

        send_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                send_btnMouseEntered(evt);
            }
        });
        chat_body_panel.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 50, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrlinelong.png"))); // NOI18N
        chat_body_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 290, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/chatBody.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        chat_body_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        chat_list_panel.setBackground(new java.awt.Color(28, 36, 47));
        chat_list_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        chat_list_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title.setForeground(new java.awt.Color(111, 117, 124));
        chat_list_panel.add(chatlist_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        chatlist_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_pink.png"))); // NOI18N
        chatlist_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatlist_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatlist_settingMouseClicked(evt);
            }
        });
        chat_list_panel.add(chatlist_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 30, 30));

        client_logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout1MouseClicked(evt);
            }
        });
        chat_list_panel.add(client_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 30));

        chat_list_scrollPane.setBackground(new java.awt.Color(28, 36, 47));

        userGroupsPanel.setBackground(new java.awt.Color(28, 36, 47));
        userGroupsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chat_list_scrollPane.setViewportView(userGroupsPanel);

        chat_list_panel.add(chat_list_scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 390, 460));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/chatListBack.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        chat_list_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        setting_panel.setBackground(new java.awt.Color(28, 36, 47));
        setting_panel.setPreferredSize(new java.awt.Dimension(470, 86));
        setting_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setting_lable.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        setting_lable.setForeground(new java.awt.Color(111, 117, 124));
        setting_lable.setText("  Setting");
        setting_panel.add(setting_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        setting_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_pink.png"))); // NOI18N
        setting_previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_previousMouseClicked(evt);
            }
        });
        setting_panel.add(setting_previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, 30));

        jLabel11.setFont(new java.awt.Font("0KDBOLIDDA", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("      Admin");
        setting_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, -1));

        update_pwd_panel.setBackground(new java.awt.Color(28, 36, 47));
        update_pwd_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        update_pwd_panel.setRequestFocusEnabled(false);
        update_pwd_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_pwd.setBackground(new java.awt.Color(51, 51, 51));
        new_pwd.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        new_pwd.setForeground(new java.awt.Color(255, 255, 255));
        new_pwd.setText("New Passowrd");
        new_pwd.setAutoscrolls(false);
        new_pwd.setBorder(null);
        new_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_pwdFocusLost(evt);
            }
        });
        new_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(new_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 200, 30));

        new_pwd2.setBackground(new java.awt.Color(51, 51, 51));
        new_pwd2.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        new_pwd2.setForeground(new java.awt.Color(255, 255, 255));
        new_pwd2.setText("New Corfirm Password");
        new_pwd2.setAutoscrolls(false);
        new_pwd2.setBorder(null);
        new_pwd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_pwd2FocusLost(evt);
            }
        });
        new_pwd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_pwd2MouseClicked(evt);
            }
        });
        update_pwd_panel.add(new_pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        current_pwd.setBackground(new java.awt.Color(51, 51, 51));
        current_pwd.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        current_pwd.setForeground(new java.awt.Color(255, 255, 255));
        current_pwd.setText("Current Password");
        current_pwd.setAutoscrolls(false);
        current_pwd.setBorder(null);
        current_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                current_pwdFocusLost(evt);
            }
        });
        current_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                current_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(current_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, 30));

        success_msg.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        success_msg.setForeground(new java.awt.Color(0, 204, 0));
        success_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_pwd_panel.add(success_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 280, 20));

        signin_link_hover1.setEditable(false);
        signin_link_hover1.setBackground(new java.awt.Color(51, 51, 51));
        signin_link_hover1.setFont(new java.awt.Font("0KDBOLIDDA", 1, 24)); // NOI18N
        signin_link_hover1.setForeground(new java.awt.Color(206, 47, 131));
        signin_link_hover1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signin_link_hover1.setText("Home");
        signin_link_hover1.setBorder(null);
        signin_link_hover1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_link_hover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_link_hover1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_link_hover1MouseExited(evt);
            }
        });
        signin_link_hover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_link_hover1ActionPerformed(evt);
            }
        });
        update_pwd_panel.add(signin_link_hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 100, 40));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        update_pwd_panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 290, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/changepassword.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        update_pwd_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        admin_panel.setBackground(new java.awt.Color(28, 36, 47));
        admin_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        admin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_error1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_error1.setForeground(new java.awt.Color(206, 47, 131));
        signup_error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_panel.add(signup_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 310, 20));

        create_new_chat_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_new_chat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_new_chat_btnMouseClicked(evt);
            }
        });
        admin_panel.add(create_new_chat_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 260, 40));

        group_scrollPane.setBorder(null);

        groupPanel.setBackground(new java.awt.Color(51, 51, 51));
        groupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        group_scrollPane.setViewportView(groupPanel);

        admin_panel.add(group_scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 370, 370));

        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        admin_panel.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 70, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/adminPanel.png"))); // NOI18N
        admin_panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        group_create_panel.setBackground(new java.awt.Color(28, 36, 47));
        group_create_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        group_create_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g_name_text.setBackground(new java.awt.Color(51, 51, 51));
        g_name_text.setFont(new java.awt.Font("0KDBOLIDDA", 0, 18)); // NOI18N
        g_name_text.setForeground(new java.awt.Color(255, 255, 255));
        g_name_text.setAutoscrolls(false);
        g_name_text.setBorder(null);
        g_name_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                g_name_textFocusLost(evt);
            }
        });
        g_name_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g_name_textMouseClicked(evt);
            }
        });
        group_create_panel.add(g_name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 260, 40));

        create_group_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_group_btnMouseClicked(evt);
            }
        });
        group_create_panel.add(create_group_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 140, 40));

        group_creation_state.setForeground(new java.awt.Color(255, 0, 102));
        group_creation_state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        group_create_panel.add(group_creation_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 220, 10));

        g_dec_textArea.setBackground(new java.awt.Color(51, 51, 51));
        g_dec_textArea.setColumns(20);
        g_dec_textArea.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        g_dec_textArea.setForeground(new java.awt.Color(255, 255, 255));
        g_dec_textArea.setRows(5);
        jScrollPane1.setViewportView(g_dec_textArea);

        group_create_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 270, 90));

        logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });
        group_create_panel.add(logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 30));

        back1.setForeground(new java.awt.Color(255, 0, 102));
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        group_create_panel.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 90, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/groupCreate.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        group_create_panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        update_panel.setBackground(new java.awt.Color(28, 36, 47));
        update_panel.setPreferredSize(new java.awt.Dimension(470, 590));
        update_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_profile_pic1.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        update_profile_pic1.setForeground(new java.awt.Color(255, 255, 255));
        update_profile_pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_profile_pic1.setText("Profile Picture");
        update_profile_pic1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_profile_pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_profile_pic1MouseClicked(evt);
            }
        });
        update_panel.add(update_profile_pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, 130));

        update_email.setBackground(new java.awt.Color(51, 51, 51));
        update_email.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        update_email.setForeground(new java.awt.Color(255, 255, 255));
        update_email.setText("Email");
        update_email.setAutoscrolls(false);
        update_email.setBorder(null);
        update_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                update_emailFocusLost(evt);
            }
        });
        update_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_emailMouseClicked(evt);
            }
        });
        update_panel.add(update_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 30));

        update_nickname.setBackground(new java.awt.Color(51, 51, 51));
        update_nickname.setFont(new java.awt.Font("0KDBOLIDDA", 1, 14)); // NOI18N
        update_nickname.setForeground(new java.awt.Color(255, 255, 255));
        update_nickname.setText("Nick name");
        update_nickname.setAutoscrolls(false);
        update_nickname.setBorder(null);
        update_nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                update_nicknameFocusLost(evt);
            }
        });
        update_nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_nicknameMouseClicked(evt);
            }
        });
        update_panel.add(update_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 200, 30));

        success_msg1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        success_msg1.setForeground(new java.awt.Color(206, 47, 131));
        success_msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 280, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        update_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 90, 20));

        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        update_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 210, 20));

        success_update_msg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        success_update_msg.setForeground(new java.awt.Color(0, 204, 0));
        success_update_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_update_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 210, 20));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        update_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/profileChange.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        update_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        layered_pane.setLayer(title_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signup_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(forgot_password_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_body_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_list_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(setting_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_pwd_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(admin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(group_create_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layered_paneLayout = new javax.swing.GroupLayout(layered_pane);
        layered_pane.setLayout(layered_paneLayout);
        layered_paneLayout.setHorizontalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layered_paneLayout.createSequentialGroup()
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(setting_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(admin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(group_create_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layered_paneLayout.setVerticalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                .addComponent(title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 170, Short.MAX_VALUE)
                    .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(admin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(group_create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(layered_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        ChatBall chat_ball1 = new ChatBall(this);
        chat_ball1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_minimizeMouseClicked

    private void forgotPasswordHoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordHoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPasswordHoverActionPerformed

    private void forgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseEntered
        forgotPassword.setVisible(false);
        forgotPasswordHover.setVisible(true);
    }//GEN-LAST:event_forgotPasswordMouseEntered

    private void forgotPasswordHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordHoverMouseExited
        forgotPasswordHover.setVisible(false);
        forgotPassword.setVisible(true);
    }//GEN-LAST:event_forgotPasswordHoverMouseExited

    private void signUpLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLinkMouseEntered
        signUpLink.setVisible(false);
        signUpLinkHover.setVisible(true);
    }//GEN-LAST:event_signUpLinkMouseEntered

    private void signUpLinkHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLinkHoverMouseExited
        signUpLinkHover.setVisible(false);
        signUpLink.setVisible(true);
    }//GEN-LAST:event_signUpLinkHoverMouseExited

    private void eyeOpenIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeOpenIconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            eyeCloseIcon.setVisible(true);
            eyeOpenIcon.setVisible(false);
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_eyeOpenIconMouseClicked

    private void eyeCloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeCloseIconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            eyeOpenIcon.setVisible(true);
            eyeCloseIcon.setVisible(false);
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_eyeCloseIconMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        if (username.getText().trim().equalsIgnoreCase("username")) {
            username.setText(null);
        }
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if (username.getText().trim().equalsIgnoreCase("")) {
            username.setText("Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().trim().equalsIgnoreCase("")) {
            password.setText("Password");
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {
            password.setText(null);
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordMouseClicked

    private void signupUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupUsernameFocusLost
        if (signupUsername.getText().trim().equalsIgnoreCase("")) {
            signupUsername.setText("Username");
        }
    }//GEN-LAST:event_signupUsernameFocusLost

    private void signupUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupUsernameMouseClicked
        if (signupUsername.getText().trim().equalsIgnoreCase("username")) {
            signupUsername.setText(null);
        }
    }//GEN-LAST:event_signupUsernameMouseClicked

    private void signUpPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signUpPasswordFocusLost
        if (signUpPassword.getText().trim().equalsIgnoreCase("")) {
            signUpPassword.setText("Password");
            signUpPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signUpPasswordFocusLost

    private void signUpPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpPasswordMouseClicked
        if (signUpPassword.getText().trim().equalsIgnoreCase("password")) {
            signUpPassword.setText(null);
            signUpPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_signUpPasswordMouseClicked

    private void signupEyeOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupEyeOpenMouseClicked
        if (signUpPassword.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signupEyeClose.setVisible(true);
            signupEyeOpen.setVisible(false);
            signUpPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signupEyeOpenMouseClicked

    private void signupEyeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupEyeCloseMouseClicked
        if (signUpPassword.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signupEyeOpen.setVisible(true);
            signupEyeClose.setVisible(false);
            signUpPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_signupEyeCloseMouseClicked

    private void signinLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLinkMouseEntered
        signinLink.setVisible(false);
        signinLinkHover.setVisible(true);
    }//GEN-LAST:event_signinLinkMouseEntered

    private void signinLinkHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLinkHoverMouseExited
        signinLinkHover.setVisible(false);
        signinLink.setVisible(true);
    }//GEN-LAST:event_signinLinkHoverMouseExited

    private void signinLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signinLinkActionPerformed

    private void signUpLinkHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLinkHoverMouseClicked
        signupDefault();
    }//GEN-LAST:event_signUpLinkHoverMouseClicked

    private void signupEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupEmailFocusLost
        if (signupEmail.getText().trim().equalsIgnoreCase("")) {
            signupEmail.setText("Email");
        }
    }//GEN-LAST:event_signupEmailFocusLost

    private void signupEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupEmailMouseClicked
        if (signupEmail.getText().trim().equalsIgnoreCase("email")) {
            signupEmail.setText(null);
        }
    }//GEN-LAST:event_signupEmailMouseClicked

    private void signupNicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupNicknameFocusLost
        if (signupNickname.getText().trim().equalsIgnoreCase("")) {
            signupNickname.setText("Nick name");
        }
    }//GEN-LAST:event_signupNicknameFocusLost

    private void signupNicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupNicknameMouseClicked
        if (signupNickname.getText().trim().equalsIgnoreCase("nick name")) {
            signupNickname.setText(null);
        }
    }//GEN-LAST:event_signupNicknameMouseClicked

    private void signinLinkHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLinkHoverMouseClicked
        signinDefault();
    }//GEN-LAST:event_signinLinkHoverMouseClicked

    private void signupProfileIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupProfileIconMouseClicked
        JFileChooser chooser = new JFileChooser(); //image file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); //set image type
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) { 
            
            File file = chooser.getSelectedFile();
            String strfilepath = file.getAbsolutePath();
            
            try {
                ImageIcon icon = new ImageIcon(strfilepath);
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
                signupProfileIcon.setText(null);
                signupProfileIcon.setIcon(iconresized);

            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_signupProfileIconMouseClicked

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        x = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_titlebarMousePressed


    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - Login.x, y - yy);
    }//GEN-LAST:event_titlebarMouseDragged

    private void fpSigninLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpSigninLinkMouseEntered
        fpSigninLink.setVisible(false);
        signInLinkHover.setVisible(true);
    }//GEN-LAST:event_fpSigninLinkMouseEntered

    private void signInLinkHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLinkHoverMouseClicked
        signinDefault();
    }//GEN-LAST:event_signInLinkHoverMouseClicked

    private void signInLinkHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLinkHoverMouseExited
        signInLinkHover.setVisible(false);
        fpSigninLink.setVisible(true);
    }//GEN-LAST:event_signInLinkHoverMouseExited

    private void fpRecoveryCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fpRecoveryCodeFocusLost
        if (fpRecoveryCode.getText().trim().equalsIgnoreCase("")) {
            fpRecoveryCode.setText("Recovery code");
        }
    }//GEN-LAST:event_fpRecoveryCodeFocusLost

    private void fpRecoveryCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpRecoveryCodeMouseClicked
        if (fpRecoveryCode.getText().trim().equalsIgnoreCase("recovery code")) {
            fpRecoveryCode.setText(null);
        }
    }//GEN-LAST:event_fpRecoveryCodeMouseClicked

    private void forgotPasswordHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordHoverMouseClicked
        forgotPasswordDefault();
    }//GEN-LAST:event_forgotPasswordHoverMouseClicked

    private void new_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdFocusLost

    private void new_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdMouseClicked

    private void new_pwd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pwd2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwd2FocusLost

    private void new_pwd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_pwd2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwd2MouseClicked

    private void current_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_current_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_current_pwdFocusLost

    private void current_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_current_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_current_pwdMouseClicked

    private void signin_link_hover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hover1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_link_hover1MouseClicked

    private void signin_link_hover1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hover1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_link_hover1MouseExited

    int y = 13;

    public void loadGroup(boolean isSignin) {
        y = 13;
        List groups = DBManager.getDBM().getChats();

        groupPanel.removeAll();

        for (Iterator iterator = groups.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            if (isSignin) {
                DBManager.getDBM().putOffline(next.getId());
            }

            JPanel group = new javax.swing.JPanel();
            group.setBackground(new java.awt.Color(44, 47, 62));
            group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            JLabel groupAction = new javax.swing.JLabel();

            if (DBManager.getDBM().isOnline(next.getId())) {
                groupAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/end.png")));
            } else {
                groupAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/start.png")));
            }

            groupAction.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    groupAction(next.getId(), groupAction);

                }
            });

            JLabel groupDesc = new javax.swing.JLabel();
            groupDesc.setForeground(new java.awt.Color(255, 255, 255));
            groupDesc.setText("<html>" + next.getDescription() + "</html>");

            JLabel groupName = new javax.swing.JLabel();
            groupName.setFont(new java.awt.Font("Tahoma", 1, 13));
            groupName.setForeground(new java.awt.Color(255, 255, 255));
            groupName.setText(next.getName());
            group.add(groupAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 29));
            group.add(groupDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 163, 33));
            group.add(groupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            groupPanel.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y, 325, 90));

            y += 110;
        }

    }

    public void groupAction(int chatId, JLabel gAction) {

        File btnIcon = new File("");
        String abspath = btnIcon.getAbsolutePath();

        if (DBManager.getDBM().isOnline(chatId)) {
            DBManager.getDBM().putOffline(chatId);
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\start.png");
            gAction.setIcon(icon);
        } else if (DBManager.getDBM().putOnline(chatId)) {
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\end.png");
            gAction.setIcon(icon);
            
            startServer(chatId); //start chat server and nofify observers

        }
    }

    int y1 = 13;

    public void loadClientGroups() {

        List chats = DBManager.getDBM().getChats();

        userGroupsPanel.removeAll();

        for (Iterator iterator = chats.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            JPanel userGroupPanel = new javax.swing.JPanel();
            userGroupPanel.setBackground(new java.awt.Color(39, 51, 67));
            userGroupPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            userGroupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            userGroupPanel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    enterToChat(next.getId());

                }
            });

            boolean is_sub = false;

            JLabel subscribe = new javax.swing.JLabel();

            if (is_sub) {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/unsubscribe.png")));
            } else {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/subscribe.png")));
            }

            if (next.getStatus() == "1") {
                subscribe.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        subscribe_action(next.getId(), subscribe);

                    }
                });

            } else {
                subscribe.setEnabled(false);
                subscribe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            JLabel grpDesc = new javax.swing.JLabel();
            grpDesc.setForeground(new java.awt.Color(255, 255, 255));
            grpDesc.setText(next.getDescription());

            JLabel statusTxt = new javax.swing.JLabel();
            statusTxt.setBackground(new java.awt.Color(28, 36, 47));
            statusTxt.setForeground(new java.awt.Color(255, 255, 255));

            JLabel statuts_icon = new javax.swing.JLabel();

            if (next.getStatus() == "1") {
                statusTxt.setText("online");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/online.png")));
            } else {
                statusTxt.setText("offline");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/offline.png")));
            }

            JLabel grpName = new javax.swing.JLabel();
            grpName.setFont(new java.awt.Font("Tahoma", 1, 13));
            grpName.setForeground(new java.awt.Color(255, 255, 255));
            grpName.setText(next.getName());

            userGroupPanel.add(subscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 42, 99, 35));
            userGroupPanel.add(grpDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 160, 35));
            userGroupPanel.add(statusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 13, 51, -1));
            userGroupPanel.add(statuts_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 13, 18, 16));
            userGroupPanel.add(grpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            userGroupsPanel.add(userGroupPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y1, 325, 96));

            y1 += 110;

        }

    }

    public void subscribe_action(int grp_id, JLabel sub_btn) {
        try {
            File btn_icon = new File("");
            String abspath = btn_icon.getAbsolutePath();
            if (chat.is_subscribed(u.getId())) {
                chat.unsubscribre(grp_id, u);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\subscribe.png");
                sub_btn.setIcon(icon);
            } else {
                chat.subscribre(grp_id, u);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\unsubscribe.png");
                sub_btn.setIcon(icon);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static int enterd_grup_id;
    public void enterToChat(int grup_id) {
        try {
            if (chat.is_subscribed(u.getId())) {
                chatBodyDefault();
                enterd_grup_id = grup_id;
                retrivemsg.start();
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void signin_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_btnMouseClicked

        String user_name = username.getText();
        String user_pwd = password.getText();

        ArrayList<String> error = validatelogin(user_name, user_pwd);

        if (error.isEmpty() == false) {
            signin_error.setText(error.get(0));
        } else {

            List data = DBManager.getDBM().login(user_name, user_pwd);
            Iterator i = data.iterator();
            if (i.hasNext()) {
                User user = (User) i.next();
                if (user.getRoleId() == 1) {
                    //admin
                    System.out.println(user.getUsername());

                    loadGroup(true);
                    adminDefault();

                } else {
                    //
                    chatListDefault();

                    u = new chatUser(user.getId(), user.getUsername(), user.getNickname(), user.getEmail());

                    loadClientGroups();
                    this.start_client();
                }

                this.id = user.getId();
                update_nickname.setText(user.getNickname());
                update_email.setText(user.getEmail());

            } else {
                System.out.println("Username or Password Incorrect");
                signin_error.setText("Username or Password Incorrect");
            }

        }


    }//GEN-LAST:event_signin_btnMouseClicked


    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked
        signupDefault();

        //get data from text boxes
        String email = signupEmail.getText();
        String username = signupUsername.getText();
        String nickname = signupNickname.getText();
        String password = signUpPassword.getText();

        //error array
        ArrayList<String> error = validateform(email, username, nickname, password);

        if (error.isEmpty() == false) {
            signup_error.setText(error.get(0));
        } else {
            signup_error.setText(null);
            //intsert details
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) signupProfileIcon.getIcon();
            if (avatar != null) {
                try {
                    BufferedImage bImage = ImageIconToBufferedImage(avatar);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ImageIO.write(bImage, "jpg", bos);
                    img = bos.toByteArray();

                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (DBManager.getDBM().insert(img, email, username, nickname, password)) {
                signinDefault();
                signup_error.setText("User created!");
            }

        }


    }//GEN-LAST:event_signup_btnMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void setting_previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_previousMouseClicked
        updateDefault();
    }//GEN-LAST:event_setting_previousMouseClicked

    private void chatlist_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatlist_settingMouseClicked
        updateDefault();
    }//GEN-LAST:event_chatlist_settingMouseClicked

    private void signin_link_hover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_link_hover1ActionPerformed

    }//GEN-LAST:event_signin_link_hover1ActionPerformed

    private void update_profile_pic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_profile_pic1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_profile_pic1MouseClicked

    private void update_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_emailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_update_emailFocusLost

    private void update_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_emailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_emailMouseClicked

    private void update_nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_nicknameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_update_nicknameFocusLost

    private void update_nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_nicknameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_nicknameMouseClicked

    private void signinLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLinkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinLinkMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        chatlistDefault();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        changePasswordDefault();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String email = update_email.getText().trim();
        String nickname = update_nickname.getText().trim();
        byte[] update_img = null;

        DBManager.getDBM().update(update_img, email, nickname, id);
        success_update_msg.setText("Successful update!");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void create_new_chat_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_new_chat_btnMouseClicked
        groupCreateDefault();
    }//GEN-LAST:event_create_new_chat_btnMouseClicked

    private void g_name_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_g_name_textFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_g_name_textFocusLost

    private void g_name_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_name_textMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_g_name_textMouseClicked

    private void create_group_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_group_btnMouseClicked
        String gname = g_name_text.getText();
        String gdec = g_dec_textArea.getText();

        if (DBManager.getDBM().createChat(gname, gdec)) {
            group_creation_state.setText("Chat Group created!");
        } else {
            group_creation_state.setText("Could not create!");
        }


    }//GEN-LAST:event_create_group_btnMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        signinDefault();
    }//GEN-LAST:event_logout1MouseClicked

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
        signinDefault();
    }//GEN-LAST:event_logout2MouseClicked

    private void client_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout1MouseClicked
        signinDefault();
    }//GEN-LAST:event_client_logout1MouseClicked

    private void client_logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout2MouseClicked
        signinDefault();
    }//GEN-LAST:event_client_logout2MouseClicked

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        loadGroup(false);
        adminDefault();
    }//GEN-LAST:event_back1MouseClicked

    private void send_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseClicked
        this.sender();

    }//GEN-LAST:event_send_btnMouseClicked

    private void msg_typerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msg_typerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.sender();
        }

    }//GEN-LAST:event_msg_typerKeyPressed

    private void send_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_send_btnMouseEntered

    private void signUpLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpLinkActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String current_password = current_pwd.getText().trim();
        DBManager.getDBM().changpwd(current_password);
    }//GEN-LAST:event_jLabel15MouseClicked

    public void sender() {
        String m = msg_typer.getText();
        if (m.equalsIgnoreCase("bye")) {
            signinDefault();
        } else {

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time_now = myDateObj.format(myFormatObj);

            Message msg = new Message();
            msg.setGroup_id(enterd_grup_id);
            msg.setMsgid(msg.hashCode());
            msg.setUserid(u.getId());
            msg.setName(u.getUsername());
            msg.setMessage(m);
            msg.setDate_time(time_now);

            try {
                chat.send_message(msg);
            } catch (RemoteException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            msg_typer.setText("");
        }

    }

    public void signinDefault() {
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);

        password.setEchoChar((char) 0);
        eyeOpenIcon.setVisible(true);
        eyeCloseIcon.setVisible(false);

    }

    public void signupDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(true);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);

        signUpPassword.setEchoChar((char) 0);
        signupEyeOpen.setVisible(true);
        signupEyeClose.setVisible(false);

    }

    public void forgotPasswordDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        forgot_password_panel.setVisible(true);
    }

    public void changePasswordDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        update_pwd_panel.setVisible(true);
    }

    public void chatListDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_list_panel.setVisible(true);
    }

    public void chatBodyDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_body_panel.setVisible(true);
    }

    public void updateDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        update_panel.setVisible(true);
    }

    public void chatlistDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        chat_list_panel.setVisible(true);
    }

    public void adminDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        admin_panel.setVisible(true);
    }

    public void groupCreateDefault() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        group_create_panel.setVisible(true);
    }

    public ArrayList<String> validateform(String email, String username, String nickname, String password) {

        ArrayList<String> errors = new ArrayList<String>();

        if (email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$") == false) {
            errors.add("Invalid email");
        }

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        if (password.length() < 7) {
            errors.add("Password must contain more than 8 characters");
        }

        if ("Nick name".equals(nickname) || "".equals(nickname)) {
            errors.add("Nickname is requird");
        }

        return errors;
    }

    public ArrayList<String> validatelogin(String username, String password) {
        ArrayList<String> errors = new ArrayList<String>();

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        return errors;
    }

    public BufferedImage ImageIconToBufferedImage(ImageIcon icon) {
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        return bi;
    }

    public ImageIcon toImageIcon(byte[] img) {
        BufferedImage Imgavatar;
        ImageIcon avatar = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(img);
            Imgavatar = ImageIO.read(bis);
            if (Imgavatar != null) {
                avatar = new ImageIcon(Imgavatar);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return avatar;
    }

    public void start_client() {

        try {
            reg = LocateRegistry.getRegistry("localhost", 2123);
            chat = (Chat) reg.lookup("ChatAdmin");

        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex);
        }

    }

    int y2 = 210;

    public void recieveMsgHandle(Message msg) {

        chatBackground.repaint();
        chatBackground.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13));
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(28, 36, 47));

        List data = DBManager.getDBM().getAvatar(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msgLayer = new javax.swing.JPanel();

        msgLayer.setBackground(new java.awt.Color(54, 63, 77));
        msgLayer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msgLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgLayer.add(msg_content,new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msgLayer.add(msg_time,new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, -1));
        msgLayer.add(msg_name,new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, -1));
        msgLayer.add(msg_dp,new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 35, 35));

        chatBackground.add(msgLayer,new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 325, 110));

        chatBackground.repaint();
        chatBackground.revalidate();

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        y2 += 120;

    }

    public void sendMsgHandle(Message msg) {

        chatBackground.repaint();
        chatBackground.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13));
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(54, 63, 77));

        List data = DBManager.getDBM().getAvatar(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msgLayer = new javax.swing.JPanel();
        msgLayer.setBackground(new java.awt.Color(42, 50, 61));
        msgLayer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msgLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgLayer.add(msg_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msgLayer.add(msg_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));
        msgLayer.add(msg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));
        msgLayer.add(msg_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 35, 35));

        chatBackground.add(msgLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 325, 110));

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        chatBackground.repaint();
        chatBackground.revalidate();

        y2 += 120;
    }

    Thread retrivemsg = new Thread() {
        public void run() {

            int preiv = 0;

            while (true) {
                try {

                    Message nmsg = chat.broadcast();
                    if (nmsg != null) {
                        if (preiv != nmsg.getMsgid()) {

                            System.out.println(nmsg.getMsgid() + "-" + u.getId());
                            if (nmsg.getUserid() == u.getId()) {
                                sendMsgHandle(nmsg);
                            } else {
                                recieveMsgHandle(nmsg);
                            }

                            preiv = nmsg.getMsgid();
                        }
                    }

                    Thread.sleep(100);
                } catch (NullPointerException ex) {
                    System.out.println(ex);
                } catch (InterruptedException ex) {

                } catch (RemoteException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    };

    public void startServer(int g_id) {
        try {
            Chat chat = new ChatService(g_id);
            Registry reg = LocateRegistry.createRegistry(2123);
            reg.bind("ChatAdmin", chat);

            System.out.println("Chat server is running.!");

        } catch (RemoteException e) {
            System.out.println("Exception ocured : " + e.getMessage());
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin_panel;
    private javax.swing.JLabel back1;
    private javax.swing.JPanel chatBackground;
    private javax.swing.JPanel chat_body_panel;
    private javax.swing.JPanel chat_list_panel;
    private javax.swing.JScrollPane chat_list_scrollPane;
    private javax.swing.JLabel chatlist_setting;
    private javax.swing.JLabel chatlist_title;
    private javax.swing.JLabel chatlist_title2;
    private javax.swing.JLabel client_logout1;
    private javax.swing.JLabel client_logout2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel create_group_btn;
    private javax.swing.JLabel create_new_chat_btn;
    private javax.swing.JTextField current_pwd;
    private javax.swing.JLabel eyeCloseIcon;
    private javax.swing.JLabel eyeOpenIcon;
    private javax.swing.JTextField forgotPassword;
    private javax.swing.JTextField forgotPasswordHover;
    private javax.swing.JPanel forgot_password_panel;
    private javax.swing.JTextField fpRecoveryCode;
    private javax.swing.JTextField fpSigninLink;
    private javax.swing.JLabel fp_confirm_btn;
    private javax.swing.JLabel fp_description;
    private javax.swing.JLabel fp_error;
    private javax.swing.JLabel fp_logo;
    private javax.swing.JLabel fp_recovery_code_line;
    private javax.swing.JLabel fp_resend_code;
    private javax.swing.JTextArea g_dec_textArea;
    private javax.swing.JTextField g_name_text;
    private javax.swing.JPanel groupPanel;
    private javax.swing.JPanel group_create_panel;
    private javax.swing.JLabel group_creation_state;
    private javax.swing.JScrollPane group_scrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layered_pane;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel minimize;
    private javax.swing.JScrollPane msgScrollPane;
    private javax.swing.JTextField msg_typer;
    private javax.swing.JTextField new_pwd;
    private javax.swing.JTextField new_pwd2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel send_btn;
    private javax.swing.JLabel setting_lable;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel setting_previous;
    private javax.swing.JTextField signInLinkHover;
    private javax.swing.JTextField signUpLink;
    private javax.swing.JTextField signUpLinkHover;
    private javax.swing.JPasswordField signUpPassword;
    private javax.swing.JTextField signinLink;
    private javax.swing.JTextField signinLinkHover;
    private javax.swing.JLabel signin_btn;
    private javax.swing.JLabel signin_error;
    private javax.swing.JTextField signin_link_hover1;
    private javax.swing.JPanel signin_panel;
    private javax.swing.JTextField signupEmail;
    private javax.swing.JLabel signupEyeClose;
    private javax.swing.JLabel signupEyeOpen;
    private javax.swing.JTextField signupNickname;
    private javax.swing.JLabel signupProfileIcon;
    private javax.swing.JTextField signupUsername;
    private javax.swing.JLabel signup_btn;
    private javax.swing.JLabel signup_error;
    private javax.swing.JLabel signup_error1;
    private javax.swing.JPanel signup_panel;
    private javax.swing.JLabel success_msg;
    private javax.swing.JLabel success_msg1;
    private javax.swing.JLabel success_update_msg;
    private javax.swing.JPanel title_panel;
    private javax.swing.JLabel titlebar;
    private javax.swing.JTextField update_email;
    private javax.swing.JTextField update_nickname;
    private javax.swing.JPanel update_panel;
    private javax.swing.JLabel update_profile_pic1;
    private javax.swing.JPanel update_pwd_panel;
    private javax.swing.JPanel userGroupsPanel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
