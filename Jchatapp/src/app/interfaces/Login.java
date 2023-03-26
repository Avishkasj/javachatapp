package app.interfaces;

import app.dbmanager.DBManager;
import app.pojos.Groups;
import app.pojos.User;
import app.services.Chat;
import app.services.ChatService;
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

    static int xx, yy;
    static Chat_ball chat_ball;
    int id;
    ChatClient me;

    public Login() {
        initComponents();

        Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screen_size.width - 425, getY());

        //when app on
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);

        signin_default();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layered_pane = new javax.swing.JLayeredPane();
        title_panel = new javax.swing.JPanel();
        titlebar = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        signin_panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        username_icon = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        username_line = new javax.swing.JLabel();
        password_icon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        password_line = new javax.swing.JLabel();
        eye_open_icon = new javax.swing.JLabel();
        eye_close_icon = new javax.swing.JLabel();
        signin_btn = new javax.swing.JLabel();
        signin_error = new javax.swing.JLabel();
        forgot_password = new javax.swing.JTextField();
        forgot_password_hover = new javax.swing.JTextField();
        sign_up_link = new javax.swing.JTextField();
        sign_up_link_hover = new javax.swing.JTextField();
        signin_copyrights = new javax.swing.JLabel();
        signin_footer = new javax.swing.JLabel();
        signup_panel = new javax.swing.JPanel();
        signup_profile_pic = new javax.swing.JLabel();
        signup_email = new javax.swing.JTextField();
        signup_email_line = new javax.swing.JLabel();
        signup_username = new javax.swing.JTextField();
        signup_username_line = new javax.swing.JLabel();
        signup_password = new javax.swing.JPasswordField();
        signup_eye_open_icon = new javax.swing.JLabel();
        signup_eye_close_icon = new javax.swing.JLabel();
        signup_password_line = new javax.swing.JLabel();
        signup_nickname_line = new javax.swing.JLabel();
        signup_nickname = new javax.swing.JTextField();
        signup_btn = new javax.swing.JLabel();
        signup_error = new javax.swing.JLabel();
        signin_link = new javax.swing.JTextField();
        signin_link_hover = new javax.swing.JTextField();
        signup_copyrights = new javax.swing.JLabel();
        signup_footer = new javax.swing.JLabel();
        forgot_password_panel = new javax.swing.JPanel();
        fp_logo = new javax.swing.JLabel();
        fp_resend_code = new javax.swing.JLabel();
        fp_description = new javax.swing.JLabel();
        fp_recovery_code = new javax.swing.JTextField();
        fp_recovery_code_line = new javax.swing.JLabel();
        fp_confirm_btn = new javax.swing.JLabel();
        fp_error = new javax.swing.JLabel();
        fp_signin_link = new javax.swing.JTextField();
        fp_signin_link_hover = new javax.swing.JTextField();
        fp_copyrights = new javax.swing.JLabel();
        fp_footer = new javax.swing.JLabel();
        chat_body_panel = new javax.swing.JPanel();
        chatlist_title2 = new javax.swing.JLabel();
        chatlist_setting2 = new javax.swing.JLabel();
        client_logout2 = new javax.swing.JLabel();
        msgScrollPane = new javax.swing.JScrollPane();
        chat_background = new javax.swing.JPanel();
        msg_typer = new javax.swing.JTextField();
        send_btn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chat_list_panel = new javax.swing.JPanel();
        chatlist_title = new javax.swing.JLabel();
        chatlist_setting = new javax.swing.JLabel();
        client_logout1 = new javax.swing.JLabel();
        chat_list_scrollPane = new javax.swing.JScrollPane();
        client_groups_panel = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        setting_lable = new javax.swing.JLabel();
        setting_previous = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        update_pwd_panel = new javax.swing.JPanel();
        new_pwd = new javax.swing.JTextField();
        signup_email_line1 = new javax.swing.JLabel();
        new_pwd2 = new javax.swing.JTextField();
        signup_username_line1 = new javax.swing.JLabel();
        signup_nickname_line1 = new javax.swing.JLabel();
        current_pwd = new javax.swing.JTextField();
        success_msg = new javax.swing.JLabel();
        signin_link_hover1 = new javax.swing.JTextField();
        signup_copyrights1 = new javax.swing.JLabel();
        signup_footer1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        update_panel = new javax.swing.JPanel();
        update_profile_pic1 = new javax.swing.JLabel();
        update_email = new javax.swing.JTextField();
        signup_email_line2 = new javax.swing.JLabel();
        signup_username_line2 = new javax.swing.JLabel();
        update_nickname = new javax.swing.JTextField();
        success_msg1 = new javax.swing.JLabel();
        signup_copyrights2 = new javax.swing.JLabel();
        signup_footer2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        success_update_msg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admin_panel = new javax.swing.JPanel();
        signup_error1 = new javax.swing.JLabel();
        signup_copyrights3 = new javax.swing.JLabel();
        signup_footer3 = new javax.swing.JLabel();
        create_new_chat_btn = new javax.swing.JLabel();
        group_scrollPane = new javax.swing.JScrollPane();
        group_panel = new javax.swing.JPanel();
        logout1 = new javax.swing.JLabel();
        group_create_panel = new javax.swing.JPanel();
        g_name_text = new javax.swing.JTextField();
        username_line1 = new javax.swing.JLabel();
        create_group_btn = new javax.swing.JLabel();
        signin_copyrights1 = new javax.swing.JLabel();
        signin_footer1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        group_creation_state = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        g_dec_textArea = new javax.swing.JTextArea();
        logout2 = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layered_pane.setBackground(new java.awt.Color(28, 36, 47));

        title_panel.setBackground(new java.awt.Color(28, 36, 47));

        titlebar.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        titlebar.setForeground(new java.awt.Color(111, 117, 124));
        titlebar.setText("  Chat App");
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

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/minimize.png"))); // NOI18N
        minimize.setToolTipText("Minimize");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/close.png"))); // NOI18N
        close.setToolTipText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_panelLayout = new javax.swing.GroupLayout(title_panel);
        title_panel.setLayout(title_panelLayout);
        title_panelLayout.setHorizontalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_panelLayout.createSequentialGroup()
                .addComponent(titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(minimize)
                .addGap(0, 0, 0)
                .addComponent(close))
        );
        title_panelLayout.setVerticalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        signin_panel.setBackground(new java.awt.Color(28, 36, 47));
        signin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logo_pink.png"))); // NOI18N
        signin_panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 120, 120));

        username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/username.png"))); // NOI18N
        signin_panel.add(username_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, 20));

        username.setBackground(new java.awt.Color(28, 36, 47));
        username.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        username.setForeground(new java.awt.Color(111, 117, 124));
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
        signin_panel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 240, 20));

        username_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        username_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signin_panel.add(username_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 10));

        password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/password.png"))); // NOI18N
        signin_panel.add(password_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 20, 20));

        password.setBackground(new java.awt.Color(28, 36, 47));
        password.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        password.setForeground(new java.awt.Color(111, 117, 124));
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
        signin_panel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 20));

        password_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        password_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signin_panel.add(password_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 10));

        eye_open_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        eye_open_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye_open_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye_open_iconMouseClicked(evt);
            }
        });
        signin_panel.add(eye_open_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 20, 20));

        eye_close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        eye_close_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye_close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye_close_iconMouseClicked(evt);
            }
        });
        signin_panel.add(eye_close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 20, 20));

        signin_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/signin_pink.png"))); // NOI18N
        signin_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_btnMouseClicked(evt);
            }
        });
        signin_panel.add(signin_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 30));

        signin_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signin_error.setForeground(new java.awt.Color(206, 47, 131));
        signin_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_panel.add(signin_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 20));

        forgot_password.setEditable(false);
        forgot_password.setBackground(new java.awt.Color(28, 36, 47));
        forgot_password.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        forgot_password.setForeground(new java.awt.Color(111, 117, 124));
        forgot_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgot_password.setText("Forgot Password ?");
        forgot_password.setBorder(null);
        forgot_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgot_passwordMouseEntered(evt);
            }
        });
        signin_panel.add(forgot_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 20));

        forgot_password_hover.setEditable(false);
        forgot_password_hover.setBackground(new java.awt.Color(28, 36, 47));
        forgot_password_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        forgot_password_hover.setForeground(new java.awt.Color(206, 47, 131));
        forgot_password_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgot_password_hover.setText("Forgot Password ?");
        forgot_password_hover.setBorder(null);
        forgot_password_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_password_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgot_password_hoverMouseExited(evt);
            }
        });
        forgot_password_hover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_password_hoverActionPerformed(evt);
            }
        });
        signin_panel.add(forgot_password_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 20));

        sign_up_link.setBackground(new java.awt.Color(28, 36, 47));
        sign_up_link.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        sign_up_link.setForeground(new java.awt.Color(111, 117, 124));
        sign_up_link.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_up_link.setText("Sign Up");
        sign_up_link.setBorder(null);
        sign_up_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign_up_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_up_linkMouseEntered(evt);
            }
        });
        sign_up_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_linkActionPerformed(evt);
            }
        });
        signin_panel.add(sign_up_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 50, 20));

        sign_up_link_hover.setEditable(false);
        sign_up_link_hover.setBackground(new java.awt.Color(28, 36, 47));
        sign_up_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        sign_up_link_hover.setForeground(new java.awt.Color(206, 47, 131));
        sign_up_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_up_link_hover.setText("Sign Up");
        sign_up_link_hover.setBorder(null);
        sign_up_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign_up_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_up_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sign_up_link_hoverMouseExited(evt);
            }
        });
        signin_panel.add(sign_up_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 50, 20));

        signin_copyrights.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signin_copyrights.setForeground(new java.awt.Color(255, 255, 255));
        signin_copyrights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_copyrights.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        signin_panel.add(signin_copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signin_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        signin_panel.add(signin_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        signup_panel.setBackground(new java.awt.Color(28, 36, 47));
        signup_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_profile_pic.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_profile_pic.setForeground(new java.awt.Color(111, 117, 124));
        signup_profile_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_profile_pic.setText("Profile Picture");
        signup_profile_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        signup_profile_pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_profile_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_profile_picMouseClicked(evt);
            }
        });
        signup_panel.add(signup_profile_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 120));

        signup_email.setBackground(new java.awt.Color(28, 36, 47));
        signup_email.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_email.setForeground(new java.awt.Color(111, 117, 124));
        signup_email.setText("Email");
        signup_email.setAutoscrolls(false);
        signup_email.setBorder(null);
        signup_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_emailFocusLost(evt);
            }
        });
        signup_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_emailMouseClicked(evt);
            }
        });
        signup_panel.add(signup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, 20));

        signup_email_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_email_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 10));

        signup_username.setBackground(new java.awt.Color(28, 36, 47));
        signup_username.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_username.setForeground(new java.awt.Color(111, 117, 124));
        signup_username.setText("Username");
        signup_username.setAutoscrolls(false);
        signup_username.setBorder(null);
        signup_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_usernameFocusLost(evt);
            }
        });
        signup_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_usernameMouseClicked(evt);
            }
        });
        signup_panel.add(signup_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 20));

        signup_username_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_username_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_username_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 10));

        signup_password.setBackground(new java.awt.Color(28, 36, 47));
        signup_password.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_password.setForeground(new java.awt.Color(111, 117, 124));
        signup_password.setText("Password");
        signup_password.setBorder(null);
        signup_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_passwordFocusLost(evt);
            }
        });
        signup_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_passwordMouseClicked(evt);
            }
        });
        signup_panel.add(signup_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, 20));

        signup_eye_open_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        signup_eye_open_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_eye_open_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_eye_open_iconMouseClicked(evt);
            }
        });
        signup_panel.add(signup_eye_open_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 20, 20));

        signup_eye_close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        signup_eye_close_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_eye_close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_eye_close_iconMouseClicked(evt);
            }
        });
        signup_panel.add(signup_eye_close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 20, 20));

        signup_password_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_password_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_password_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 10));

        signup_nickname_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_nickname_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_nickname_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 10));

        signup_nickname.setBackground(new java.awt.Color(28, 36, 47));
        signup_nickname.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_nickname.setForeground(new java.awt.Color(111, 117, 124));
        signup_nickname.setText("Nick name");
        signup_nickname.setAutoscrolls(false);
        signup_nickname.setBorder(null);
        signup_nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_nicknameFocusLost(evt);
            }
        });
        signup_nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_nicknameMouseClicked(evt);
            }
        });
        signup_panel.add(signup_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 20));

        signup_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/signup_pink.png"))); // NOI18N
        signup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btnMouseClicked(evt);
            }
        });
        signup_panel.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 200, 30));

        signup_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_error.setForeground(new java.awt.Color(206, 47, 131));
        signup_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_panel.add(signup_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 310, 20));

        signin_link.setBackground(new java.awt.Color(28, 36, 47));
        signin_link.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signin_link.setForeground(new java.awt.Color(111, 117, 124));
        signin_link.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signin_link.setText("Sign In");
        signin_link.setBorder(null);
        signin_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_linkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signin_linkMouseEntered(evt);
            }
        });
        signin_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_linkActionPerformed(evt);
            }
        });
        signup_panel.add(signin_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 50, 20));

        signin_link_hover.setEditable(false);
        signin_link_hover.setBackground(new java.awt.Color(28, 36, 47));
        signin_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signin_link_hover.setForeground(new java.awt.Color(206, 47, 131));
        signin_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signin_link_hover.setText("Sign In");
        signin_link_hover.setBorder(null);
        signin_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_link_hoverMouseExited(evt);
            }
        });
        signup_panel.add(signin_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 50, 20));

        signup_copyrights.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signup_copyrights.setForeground(new java.awt.Color(255, 255, 255));
        signup_copyrights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_copyrights.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        signup_panel.add(signup_copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signup_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        signup_panel.add(signup_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        forgot_password_panel.setBackground(new java.awt.Color(28, 36, 47));
        forgot_password_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fp_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logo_pink.png"))); // NOI18N
        forgot_password_panel.add(fp_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 120, 120));

        fp_resend_code.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        fp_resend_code.setForeground(new java.awt.Color(206, 47, 131));
        fp_resend_code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_resend_code.setText("resend code.");
        fp_resend_code.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fp_resend_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, -1));

        fp_description.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        fp_description.setForeground(new java.awt.Color(111, 117, 124));
        fp_description.setText("<html>We've sent a recovery code to your email.<br>Please enter the code to change your password. If you haven't received any mail, please</html>");
        forgot_password_panel.add(fp_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, 70));

        fp_recovery_code.setBackground(new java.awt.Color(28, 36, 47));
        fp_recovery_code.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        fp_recovery_code.setForeground(new java.awt.Color(111, 117, 124));
        fp_recovery_code.setText("Recovery code");
        fp_recovery_code.setAutoscrolls(false);
        fp_recovery_code.setBorder(null);
        fp_recovery_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fp_recovery_codeFocusLost(evt);
            }
        });
        fp_recovery_code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fp_recovery_codeMouseClicked(evt);
            }
        });
        forgot_password_panel.add(fp_recovery_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 240, 20));

        fp_recovery_code_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        fp_recovery_code_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        forgot_password_panel.add(fp_recovery_code_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 10));

        fp_confirm_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/confirm_pink.png"))); // NOI18N
        fp_confirm_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fp_confirm_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 200, 30));

        fp_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_error.setForeground(new java.awt.Color(206, 47, 131));
        fp_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_error.setText("username and password are required");
        forgot_password_panel.add(fp_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 310, -1));

        fp_signin_link.setBackground(new java.awt.Color(28, 36, 47));
        fp_signin_link.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_signin_link.setForeground(new java.awt.Color(111, 117, 124));
        fp_signin_link.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fp_signin_link.setText("Sign In");
        fp_signin_link.setBorder(null);
        fp_signin_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fp_signin_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fp_signin_linkMouseEntered(evt);
            }
        });
        forgot_password_panel.add(fp_signin_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 50, 20));

        fp_signin_link_hover.setEditable(false);
        fp_signin_link_hover.setBackground(new java.awt.Color(28, 36, 47));
        fp_signin_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_signin_link_hover.setForeground(new java.awt.Color(206, 47, 131));
        fp_signin_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fp_signin_link_hover.setText("Sign In");
        fp_signin_link_hover.setBorder(null);
        fp_signin_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fp_signin_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fp_signin_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fp_signin_link_hoverMouseExited(evt);
            }
        });
        forgot_password_panel.add(fp_signin_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 50, 20));

        fp_copyrights.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        fp_copyrights.setForeground(new java.awt.Color(255, 255, 255));
        fp_copyrights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_copyrights.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        forgot_password_panel.add(fp_copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        fp_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        forgot_password_panel.add(fp_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        chat_body_panel.setBackground(new java.awt.Color(28, 36, 47));
        chat_body_panel.setPreferredSize(new java.awt.Dimension(375, 500));
        chat_body_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title2.setForeground(new java.awt.Color(111, 117, 124));
        chatlist_title2.setText("  Chats");
        chat_body_panel.add(chatlist_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        chatlist_setting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_pink.png"))); // NOI18N
        chatlist_setting2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatlist_setting2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatlist_setting2MouseClicked(evt);
            }
        });
        chat_body_panel.add(chatlist_setting2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        client_logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/client_logout.png"))); // NOI18N
        client_logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout2MouseClicked(evt);
            }
        });
        chat_body_panel.add(client_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        chat_background.setBackground(new java.awt.Color(28, 36, 47));
        chat_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        msgScrollPane.setViewportView(chat_background);

        chat_body_panel.add(msgScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 78, 340, 350));

        msg_typer.setBackground(new java.awt.Color(28, 36, 47));
        msg_typer.setForeground(new java.awt.Color(255, 255, 255));
        msg_typer.setBorder(null);
        msg_typer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msg_typerKeyPressed(evt);
            }
        });
        chat_body_panel.add(msg_typer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 30));

        send_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/send.png"))); // NOI18N
        send_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                send_btnMouseEntered(evt);
            }
        });
        chat_body_panel.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrlinelong.png"))); // NOI18N
        chat_body_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 290, 10));

        chat_list_panel.setBackground(new java.awt.Color(28, 36, 47));
        chat_list_panel.setPreferredSize(new java.awt.Dimension(375, 500));
        chat_list_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title.setForeground(new java.awt.Color(111, 117, 124));
        chatlist_title.setText("  Chats");
        chat_list_panel.add(chatlist_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        chatlist_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_pink.png"))); // NOI18N
        chatlist_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatlist_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatlist_settingMouseClicked(evt);
            }
        });
        chat_list_panel.add(chatlist_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        client_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/client_logout.png"))); // NOI18N
        client_logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout1MouseClicked(evt);
            }
        });
        chat_list_panel.add(client_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        chat_list_scrollPane.setBackground(new java.awt.Color(28, 36, 47));

        client_groups_panel.setBackground(new java.awt.Color(28, 36, 47));
        client_groups_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chat_list_scrollPane.setViewportView(client_groups_panel);

        chat_list_panel.add(chat_list_scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 410));

        setting_panel.setBackground(new java.awt.Color(28, 36, 47));
        setting_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setting_lable.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        setting_lable.setForeground(new java.awt.Color(111, 117, 124));
        setting_lable.setText("  Setting");
        setting_panel.add(setting_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        setting_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_pink.png"))); // NOI18N
        setting_previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_previousMouseClicked(evt);
            }
        });
        setting_panel.add(setting_previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Admin");
        setting_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        update_pwd_panel.setBackground(new java.awt.Color(28, 36, 47));
        update_pwd_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_pwd.setBackground(new java.awt.Color(28, 36, 47));
        new_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        new_pwd.setForeground(new java.awt.Color(111, 117, 124));
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
        update_pwd_panel.add(new_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 20));

        signup_email_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_email_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 10));

        new_pwd2.setBackground(new java.awt.Color(28, 36, 47));
        new_pwd2.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        new_pwd2.setForeground(new java.awt.Color(111, 117, 124));
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
        update_pwd_panel.add(new_pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, 20));

        signup_username_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_username_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_username_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 10));

        signup_nickname_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_nickname_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_nickname_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 10));

        current_pwd.setBackground(new java.awt.Color(28, 36, 47));
        current_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        current_pwd.setForeground(new java.awt.Color(111, 117, 124));
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
        update_pwd_panel.add(current_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 240, 20));

        success_msg.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        success_msg.setForeground(new java.awt.Color(206, 47, 131));
        success_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_pwd_panel.add(success_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 280, -1));

        signin_link_hover1.setEditable(false);
        signin_link_hover1.setBackground(new java.awt.Color(28, 36, 47));
        signin_link_hover1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
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
        update_pwd_panel.add(signin_link_hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, 20));

        signup_copyrights1.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signup_copyrights1.setForeground(new java.awt.Color(255, 255, 255));
        signup_copyrights1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_copyrights1.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        update_pwd_panel.add(signup_copyrights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signup_footer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        update_pwd_panel.add(signup_footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        jButton3.setText("change password");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        update_pwd_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        update_panel.setBackground(new java.awt.Color(28, 36, 47));
        update_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_profile_pic1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        update_profile_pic1.setForeground(new java.awt.Color(111, 117, 124));
        update_profile_pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_profile_pic1.setText("Profile Picture");
        update_profile_pic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        update_profile_pic1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_profile_pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_profile_pic1MouseClicked(evt);
            }
        });
        update_panel.add(update_profile_pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, 120));

        update_email.setBackground(new java.awt.Color(28, 36, 47));
        update_email.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        update_email.setForeground(new java.awt.Color(111, 117, 124));
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
        update_panel.add(update_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 240, 20));

        signup_email_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_panel.add(signup_email_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 10));

        signup_username_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_username_line2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_panel.add(signup_username_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 10));

        update_nickname.setBackground(new java.awt.Color(28, 36, 47));
        update_nickname.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        update_nickname.setForeground(new java.awt.Color(111, 117, 124));
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
        update_panel.add(update_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, 20));

        success_msg1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        success_msg1.setForeground(new java.awt.Color(206, 47, 131));
        success_msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 280, -1));

        signup_copyrights2.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signup_copyrights2.setForeground(new java.awt.Color(255, 255, 255));
        signup_copyrights2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_copyrights2.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        update_panel.add(signup_copyrights2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signup_footer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        update_panel.add(signup_footer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Home");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        update_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("Change Password");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        update_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        success_update_msg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        success_update_msg.setForeground(new java.awt.Color(204, 0, 102));
        success_update_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_update_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 210, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/update.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        update_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, 30));

        admin_panel.setBackground(new java.awt.Color(28, 36, 47));
        admin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_error1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_error1.setForeground(new java.awt.Color(206, 47, 131));
        signup_error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_panel.add(signup_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 310, 20));

        signup_copyrights3.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signup_copyrights3.setForeground(new java.awt.Color(255, 255, 255));
        signup_copyrights3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_copyrights3.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        admin_panel.add(signup_copyrights3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signup_footer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        admin_panel.add(signup_footer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        create_new_chat_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/create new.png"))); // NOI18N
        create_new_chat_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_new_chat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_new_chat_btnMouseClicked(evt);
            }
        });
        admin_panel.add(create_new_chat_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 30));

        group_scrollPane.setBorder(null);

        group_panel.setBackground(new java.awt.Color(28, 36, 47));
        group_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        group_scrollPane.setViewportView(group_panel);

        admin_panel.add(group_scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, 290));

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logout.png"))); // NOI18N
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        admin_panel.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 30));

        group_create_panel.setBackground(new java.awt.Color(28, 36, 47));
        group_create_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g_name_text.setBackground(new java.awt.Color(28, 36, 47));
        g_name_text.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        g_name_text.setForeground(new java.awt.Color(111, 117, 124));
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
        group_create_panel.add(g_name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 240, 20));

        username_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        username_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        group_create_panel.add(username_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 10));

        create_group_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/create.png"))); // NOI18N
        create_group_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_group_btnMouseClicked(evt);
            }
        });
        group_create_panel.add(create_group_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, 30));

        signin_copyrights1.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signin_copyrights1.setForeground(new java.awt.Color(255, 255, 255));
        signin_copyrights1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_copyrights1.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        group_create_panel.add(signin_copyrights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signin_footer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/footer.gif"))); // NOI18N
        group_create_panel.add(signin_footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Group Description");
        group_create_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        group_creation_state.setForeground(new java.awt.Color(255, 0, 102));
        group_creation_state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        group_create_panel.add(group_creation_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 220, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Group name");
        group_create_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        g_dec_textArea.setBackground(new java.awt.Color(28, 36, 47));
        g_dec_textArea.setColumns(20);
        g_dec_textArea.setForeground(new java.awt.Color(255, 255, 255));
        g_dec_textArea.setRows(5);
        jScrollPane1.setViewportView(g_dec_textArea);

        group_create_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 240, 60));

        logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logout.png"))); // NOI18N
        logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });
        group_create_panel.add(logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 30));

        back1.setForeground(new java.awt.Color(255, 0, 102));
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setText("back");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        group_create_panel.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 40, -1));

        layered_pane.setLayer(title_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signup_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(forgot_password_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_body_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_list_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(setting_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_pwd_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(admin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(group_create_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layered_paneLayout = new javax.swing.GroupLayout(layered_pane);
        layered_pane.setLayout(layered_paneLayout);
        layered_paneLayout.setHorizontalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layered_paneLayout.createSequentialGroup()
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(setting_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layered_paneLayout.setVerticalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                .addComponent(title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(admin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(group_create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(layered_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 525));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        Chat_ball chat_ball1 = new Chat_ball(this);
        chat_ball1.setVisible(true);
        this.setVisible(false);
        //this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void forgot_password_hoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_password_hoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgot_password_hoverActionPerformed

    private void forgot_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_passwordMouseEntered
        forgot_password.setVisible(false);
        forgot_password_hover.setVisible(true);
    }//GEN-LAST:event_forgot_passwordMouseEntered

    private void forgot_password_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_hoverMouseExited
        forgot_password_hover.setVisible(false);
        forgot_password.setVisible(true);
    }//GEN-LAST:event_forgot_password_hoverMouseExited

    private void sign_up_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_up_linkMouseEntered
        sign_up_link.setVisible(false);
        sign_up_link_hover.setVisible(true);
    }//GEN-LAST:event_sign_up_linkMouseEntered

    private void sign_up_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_up_link_hoverMouseExited
        sign_up_link_hover.setVisible(false);
        sign_up_link.setVisible(true);
    }//GEN-LAST:event_sign_up_link_hoverMouseExited

    private void eye_open_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye_open_iconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            eye_close_icon.setVisible(true);
            eye_open_icon.setVisible(false);
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_eye_open_iconMouseClicked

    private void eye_close_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye_close_iconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            eye_open_icon.setVisible(true);
            eye_close_icon.setVisible(false);
            password.setEchoChar('●');
        }
    }//GEN-LAST:event_eye_close_iconMouseClicked

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
            password.setEchoChar('●');
        }
    }//GEN-LAST:event_passwordMouseClicked

    private void signup_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_usernameFocusLost
        if (signup_username.getText().trim().equalsIgnoreCase("")) {
            signup_username.setText("Username");
        }
    }//GEN-LAST:event_signup_usernameFocusLost

    private void signup_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_usernameMouseClicked
        if (signup_username.getText().trim().equalsIgnoreCase("username")) {
            signup_username.setText(null);
        }
    }//GEN-LAST:event_signup_usernameMouseClicked

    private void signup_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_passwordFocusLost
        if (signup_password.getText().trim().equalsIgnoreCase("")) {
            signup_password.setText("Password");
            signup_password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signup_passwordFocusLost

    private void signup_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_passwordMouseClicked
        if (signup_password.getText().trim().equalsIgnoreCase("password")) {
            signup_password.setText(null);
            signup_password.setEchoChar('●');
        }
    }//GEN-LAST:event_signup_passwordMouseClicked

    private void signup_eye_open_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_eye_open_iconMouseClicked
        if (signup_password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signup_eye_close_icon.setVisible(true);
            signup_eye_open_icon.setVisible(false);
            signup_password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signup_eye_open_iconMouseClicked

    private void signup_eye_close_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_eye_close_iconMouseClicked
        if (signup_password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signup_eye_open_icon.setVisible(true);
            signup_eye_close_icon.setVisible(false);
            signup_password.setEchoChar('●');
        }
    }//GEN-LAST:event_signup_eye_close_iconMouseClicked

    private void signin_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_linkMouseEntered
        signin_link.setVisible(false);
        signin_link_hover.setVisible(true);
    }//GEN-LAST:event_signin_linkMouseEntered

    private void signin_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hoverMouseExited
        signin_link_hover.setVisible(false);
        signin_link.setVisible(true);
    }//GEN-LAST:event_signin_link_hoverMouseExited

    private void signin_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_linkActionPerformed

    private void sign_up_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_up_link_hoverMouseClicked
        signup_default();
    }//GEN-LAST:event_sign_up_link_hoverMouseClicked

    private void signup_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_emailFocusLost
        if (signup_email.getText().trim().equalsIgnoreCase("")) {
            signup_email.setText("Email");
        }
    }//GEN-LAST:event_signup_emailFocusLost

    private void signup_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_emailMouseClicked
        if (signup_email.getText().trim().equalsIgnoreCase("email")) {
            signup_email.setText(null);
        }
    }//GEN-LAST:event_signup_emailMouseClicked

    private void signup_nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_nicknameFocusLost
        if (signup_nickname.getText().trim().equalsIgnoreCase("")) {
            signup_nickname.setText("Nick name");
        }
    }//GEN-LAST:event_signup_nicknameFocusLost

    private void signup_nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_nicknameMouseClicked
        if (signup_nickname.getText().trim().equalsIgnoreCase("nick name")) {
            signup_nickname.setText(null);
        }
    }//GEN-LAST:event_signup_nicknameMouseClicked

    private void signin_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hoverMouseClicked
        signin_default();
    }//GEN-LAST:event_signin_link_hoverMouseClicked

    private void signup_profile_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_profile_picMouseClicked
        JFileChooser chooser = new JFileChooser(); //open image file file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); //set image type filter
        chooser.setFileFilter(filter); //filter
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { //if image selected
            File file = chooser.getSelectedFile(); //get selected file
            String strfilepath = file.getAbsolutePath(); //get abs path
//            System.out.println(strfilepath);
            try {
                ImageIcon icon = new ImageIcon(strfilepath); //string image path open as a image icon
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)); //resize image icon fit for profile icon label
                signup_profile_pic.setText(null); // remove label text
                signup_profile_pic.setIcon(iconresized); //set seleted image to profile icon label 

//               String img = this.encodeToString(this.ImageIconToBufferedImage(iconresized),"jpg"); 
//               BufferedImage bimg = this.decodeToImage(img);
//               
//               signup_profile_pic.setIcon(new ImageIcon(bimg));
            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_signup_profile_picMouseClicked

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_titlebarMousePressed


    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_titlebarMouseDragged

    private void fp_signin_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_signin_linkMouseEntered
        fp_signin_link.setVisible(false);
        fp_signin_link_hover.setVisible(true);
    }//GEN-LAST:event_fp_signin_linkMouseEntered

    private void fp_signin_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_signin_link_hoverMouseClicked
        signin_default();
    }//GEN-LAST:event_fp_signin_link_hoverMouseClicked

    private void fp_signin_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_signin_link_hoverMouseExited
        fp_signin_link_hover.setVisible(false);
        fp_signin_link.setVisible(true);
    }//GEN-LAST:event_fp_signin_link_hoverMouseExited

    private void fp_recovery_codeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fp_recovery_codeFocusLost
        if (fp_recovery_code.getText().trim().equalsIgnoreCase("")) {
            fp_recovery_code.setText("Recovery code");
        }
    }//GEN-LAST:event_fp_recovery_codeFocusLost

    private void fp_recovery_codeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_recovery_codeMouseClicked
        if (fp_recovery_code.getText().trim().equalsIgnoreCase("recovery code")) {
            fp_recovery_code.setText(null);
        }
    }//GEN-LAST:event_fp_recovery_codeMouseClicked

    private void forgot_password_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_hoverMouseClicked
        forgot_password_default();
    }//GEN-LAST:event_forgot_password_hoverMouseClicked

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

    public void load_group(boolean is_called_signin) {
        y = 13;
        List groups = DBManager.getDBM().get_chats();

        group_panel.removeAll();
        //group_panel.repaint();
        //group_panel.revalidate();

        for (Iterator iterator = groups.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            if (is_called_signin) {
                //put all chats offline before login admin
                DBManager.getDBM().put_offline(next.getId());
            }

            JPanel group = new javax.swing.JPanel();
            group.setBackground(new java.awt.Color(44, 47, 62));
            group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            JLabel g_action = new javax.swing.JLabel();

            if (DBManager.getDBM().is_online(next.getId())) {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/end.png"))); // NOI18N
            } else {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/start.png"))); // NOI18N
            }

            g_action.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    group_action(next.getId(), g_action);

                }
            });

            JLabel g_des = new javax.swing.JLabel();
            g_des.setForeground(new java.awt.Color(255, 255, 255));
            g_des.setText("<html>" + next.getDescription() + "</html>");

            JLabel g_name = new javax.swing.JLabel();
            g_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            g_name.setForeground(new java.awt.Color(255, 255, 255));
            g_name.setText(next.getName());
            group.add(g_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 29));
            group.add(g_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 163, 33));
            group.add(g_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            group_panel.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y, 294, 90));

            y += 110;
        }

    }

    public void group_action(int chat_id, JLabel g_action) {

        File btn_icon = new File("");
        String abspath = btn_icon.getAbsolutePath();

        if (DBManager.getDBM().is_online(chat_id)) {
            DBManager.getDBM().put_offline(chat_id);
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\start.png");
            g_action.setIcon(icon);
        } else if (DBManager.getDBM().put_online(chat_id)) {
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\end.png");
            g_action.setIcon(icon);

            //start chat server and nofify observers
            start_server(chat_id);

        }
    }

    int y1 = 13;

    public void load_client_groups() {

        List chats = DBManager.getDBM().get_chats();

        client_groups_panel.removeAll();

        for (Iterator iterator = chats.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            JPanel client_grp_panel = new javax.swing.JPanel();
            client_grp_panel.setBackground(new java.awt.Color(39, 51, 67));
            client_grp_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            client_grp_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            client_grp_panel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    enter_to_chat(next.getId());

                }
            });

            boolean is_sub = false;
//            try {
//                is_sub = chat.is_subscribed(me.getId());
//                System.out.println(is_sub);
//            } catch (RemoteException ex) {
//                System.out.println(ex);
//            }

            JLabel subscribe = new javax.swing.JLabel();

            if (is_sub) {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/unsubscribe.png"))); // NOI18N
            } else {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/subscribe.png"))); // NOI18N
            }

            if (next.getStatus() == 1) {
                subscribe.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        subscribe_action(next.getId(), subscribe);

                    }
                });

            } else {
                subscribe.setEnabled(false);
                subscribe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            JLabel grp_dec = new javax.swing.JLabel();
            grp_dec.setForeground(new java.awt.Color(255, 255, 255));
            grp_dec.setText(next.getDescription());

            JLabel statuts_txt = new javax.swing.JLabel();
            statuts_txt.setBackground(new java.awt.Color(28, 36, 47));
            statuts_txt.setForeground(new java.awt.Color(255, 255, 255));

            JLabel statuts_icon = new javax.swing.JLabel();

            if (next.getStatus() == 1) {
                statuts_txt.setText("online");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/online.png")));
            } else {
                statuts_txt.setText("offline");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/offline.png")));
            }

            JLabel grp_name = new javax.swing.JLabel();
            grp_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            grp_name.setForeground(new java.awt.Color(255, 255, 255));
            grp_name.setText(next.getName());

            client_grp_panel.add(subscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 42, 99, 35));
            client_grp_panel.add(grp_dec, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 160, 35));
            client_grp_panel.add(statuts_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 13, 51, -1));
            client_grp_panel.add(statuts_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 13, 18, 16));
            client_grp_panel.add(grp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            client_groups_panel.add(client_grp_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y1, 299, 96));

            y1 += 110;

        }

    }

    public void subscribe_action(int grp_id, JLabel sub_btn) {
        try {
            File btn_icon = new File("");
            String abspath = btn_icon.getAbsolutePath();

            if (chat.is_subscribed(me.getId())) {
                chat.unsubscribre(grp_id, me);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\subscribe.png");
                sub_btn.setIcon(icon);
            } else {
                chat.subscribre(grp_id, me);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\unsubscribe.png");
                sub_btn.setIcon(icon);
            }

        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }

    static int enterd_grup_id;
    public void enter_to_chat(int grup_id) {
        try {
            if (chat.is_subscribed(me.getId())) {
                chat_body_default();
                enterd_grup_id = grup_id;
                retrivemsg.start();
            }

        } catch (RemoteException ex) {
            System.out.println(ex);
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
                    //setting_default();

                    load_group(true);
                    admin_default();

                } else {
                    //client
                    chat_list_default();

                    //read client image
//                BufferedImage Imgavatar;
//                ImageIcon avatar = null;
//
//                try {
//                    ByteArrayInputStream bis = new ByteArrayInputStream(user.getAvatar());
//                    Imgavatar = ImageIO.read(bis);
//                    if (Imgavatar!= null) {
//                        avatar = new ImageIcon(Imgavatar);
//                    }
//                } catch (IOException ex) {
//                    System.out.println(ex);
//                }
                    me = new ChatClient(user.getId(), user.getUsername(), user.getNickname(), user.getEmail());
                    //start client
                    load_client_groups();
                    this.start_client();
                }

                this.id = user.getId();
                update_nickname.setText(user.getNickname());
                update_email.setText(user.getEmail());
//           update_profile_pic.setText(user.getAvatar());

            } else {
                System.out.println("Username or Password Incorrect");
                signin_error.setText("Username or Password Incorrect");
            }

        }


    }//GEN-LAST:event_signin_btnMouseClicked


    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked
        signup_default();

        //get data from text boxes
        String email = signup_email.getText();
        String username = signup_username.getText();
        String nickname = signup_nickname.getText();
        String password = signup_password.getText();

        //error array
        ArrayList<String> error = validateform(email, username, nickname, password);

        if (error.isEmpty() == false) {
            signup_error.setText(error.get(0));
        } else {
            signup_error.setText(null);
            //intsert details
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) signup_profile_pic.getIcon();
            if (avatar != null) {
                try {
                    //                img = this.encodeToString(this.ImageIconToBufferedImage(avatar),"jpg");
                    BufferedImage bImage = ImageIconToBufferedImage(avatar);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ImageIO.write(bImage, "jpg", bos);
                    img = bos.toByteArray();

                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (DBManager.getDBM().insert(img, email, username, nickname, password)) {
                signin_default();
                signup_error.setText("User created!");
            }

        }


    }//GEN-LAST:event_signup_btnMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void setting_previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_previousMouseClicked
        update_default();
    }//GEN-LAST:event_setting_previousMouseClicked

    private void chatlist_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatlist_settingMouseClicked
        update_default();
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

    private void signin_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_linkMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        chatlist_default();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        chang_password_default();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String current_password = current_pwd.getText().trim();
        DBManager.getDBM().chang_pwd(current_password);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String email = update_email.getText().trim();
        String nickname = update_nickname.getText().trim();
        byte[] update_img = null;

        DBManager.getDBM().update(update_img, email, nickname, id);
        success_update_msg.setText("Successful update!");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void create_new_chat_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_new_chat_btnMouseClicked
        group_create_default();
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

        if (DBManager.getDBM().create_chat(gname, gdec)) {
            group_creation_state.setText("Chat Group created!");
        } else {
            group_creation_state.setText("Could not create!");
        }


    }//GEN-LAST:event_create_group_btnMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        signin_default();
    }//GEN-LAST:event_logout1MouseClicked

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
        signin_default();
    }//GEN-LAST:event_logout2MouseClicked

    private void client_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout1MouseClicked
        signin_default();
    }//GEN-LAST:event_client_logout1MouseClicked

    private void chatlist_setting2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatlist_setting2MouseClicked
        signin_default();
    }//GEN-LAST:event_chatlist_setting2MouseClicked

    private void client_logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout2MouseClicked
        signin_default();
    }//GEN-LAST:event_client_logout2MouseClicked

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        load_group(false);
        admin_default();
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

    private void sign_up_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_up_linkActionPerformed

    public void sender() {
        String m = msg_typer.getText();
        if (m.equalsIgnoreCase("bye")) {
            signin_default();
        } else {

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time_now = myDateObj.format(myFormatObj);

            Message msg = new Message();
            msg.setGroup_id(enterd_grup_id);
            msg.setMsgid(msg.hashCode());
            msg.setUserid(me.getId());
            msg.setName(me.getUsername());
            msg.setMessage(m);
            msg.setDate_time(time_now);

            try {
                chat.send_message(msg);
                msg_typer.setText("");
            } catch (RemoteException ex) {
                System.out.println(ex);
            }
        }

    }

    public void signin_default() {
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
        eye_open_icon.setVisible(true);
        eye_close_icon.setVisible(false);

    }

    public void signup_default() {
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

        signup_password.setEchoChar((char) 0);
        signup_eye_open_icon.setVisible(true);
        signup_eye_close_icon.setVisible(false);

    }

    public void forgot_password_default() {
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

    public void chang_password_default() {
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

    public void chat_list_default() {
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

    public void chat_body_default() {
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

//    public void setting_default() {
//        signin_panel.setVisible(false);
//        signup_panel.setVisible(false);
//        forgot_password_panel.setVisible(false);
//        chat_list_panel.setVisible(false);
//        chat_body_panel.setVisible(false);
//        update_pwd_panel.setVisible(false);
//        update_panel.setVisible(false);
//        admin_panel.setVisible(false);
//        setting_panel.setVisible(true);
//    }
    public void update_default() {
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

    public void chatlist_default() {
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

    public void admin_default() {
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

    public void group_create_default() {
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
        // paint the Icon to the BufferedImage.
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

    public void recive_msg_handler(Message msg) {

        chat_background.repaint();
        chat_background.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(28, 36, 47));

        List data = DBManager.getDBM().get_avatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();

        msg_layer.setBackground(
                new java.awt.Color(54, 63, 77));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(
                new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, -1));
        msg_layer.add(msg_name,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, -1));
        msg_layer.add(msg_dp,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 35, 35));

//        chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 110));
        chat_background.add(msg_layer,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        chat_background.repaint();
        chat_background.revalidate();

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        y2 += 120;

    }

    public void send_msg_handler(Message msg) {

        chat_background.repaint();
        chat_background.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(54, 63, 77));

        List data = DBManager.getDBM().get_avatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();
        msg_layer.setBackground(new java.awt.Color(42, 50, 61));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));
        msg_layer.add(msg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));
        msg_layer.add(msg_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 35, 35));

        //chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 110));
        chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        chat_background.repaint();
        chat_background.revalidate();

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
                            //System.out.println(nmsg.getDate_time() + "\t" + nmsg.getName() + " : " + nmsg.getMessage() + "\n");

                            System.out.println(nmsg.getMsgid() + "-" + me.getId());
                            if (nmsg.getUserid() == me.getId()) {
                                send_msg_handler(nmsg);
                            } else {
                                recive_msg_handler(nmsg);
                            }

                            preiv = nmsg.getMsgid();
                        }
                    }

//                    if(newmsg!=preiv){
//                        System.out.println(chat.broadcast().getMessage());
//                        preiv = newmsg;
//                    }
                    Thread.sleep(100);
                } catch (RemoteException | NullPointerException ex) {
                    System.out.println(ex);
                } catch (InterruptedException ex) {

                }
            }

        }
    };

    public void start_server(int g_id) {
        try {
            Chat chat = new ChatService(g_id);
            Registry reg = LocateRegistry.createRegistry(2123);
            reg.bind("ChatAdmin", chat);

            System.out.println("Chat server is running...");

        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Exception ocured : " + e.getMessage());
        }
    }

//    public static String encodeToString(BufferedImage image, String type) {
//        String imageString = null;
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//
//        try {
//            ImageIO.write(image, type, bos);
//            byte[] imageBytes = bos.toByteArray();
//
//            BASE64Encoder encoder = new BASE64Encoder();
//            imageString = encoder.encode(imageBytes);
//
//            bos.close();
//        } catch (IOException e) {
//
//        }
//        return imageString;
//    }
//    public static BufferedImage decodeToImage(String imageString) {
//
//        BufferedImage image = null;
//        byte[] imageByte;
//        try {
//            BASE64Decoder decoder = new BASE64Decoder();
//            imageByte = decoder.decodeBuffer(imageString);
//            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
//            image = ImageIO.read(bis);
//            bis.close();
//        } catch (Exception e) {
//
//        }
//        return image;
//    }
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
    private javax.swing.JPanel chat_background;
    private javax.swing.JPanel chat_body_panel;
    private javax.swing.JPanel chat_list_panel;
    private javax.swing.JScrollPane chat_list_scrollPane;
    private javax.swing.JLabel chatlist_setting;
    private javax.swing.JLabel chatlist_setting2;
    private javax.swing.JLabel chatlist_title;
    private javax.swing.JLabel chatlist_title2;
    private javax.swing.JPanel client_groups_panel;
    private javax.swing.JLabel client_logout1;
    private javax.swing.JLabel client_logout2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel create_group_btn;
    private javax.swing.JLabel create_new_chat_btn;
    private javax.swing.JTextField current_pwd;
    private javax.swing.JLabel eye_close_icon;
    private javax.swing.JLabel eye_open_icon;
    private javax.swing.JTextField forgot_password;
    private javax.swing.JTextField forgot_password_hover;
    private javax.swing.JPanel forgot_password_panel;
    private javax.swing.JLabel fp_confirm_btn;
    private javax.swing.JLabel fp_copyrights;
    private javax.swing.JLabel fp_description;
    private javax.swing.JLabel fp_error;
    private javax.swing.JLabel fp_footer;
    private javax.swing.JLabel fp_logo;
    private javax.swing.JTextField fp_recovery_code;
    private javax.swing.JLabel fp_recovery_code_line;
    private javax.swing.JLabel fp_resend_code;
    private javax.swing.JTextField fp_signin_link;
    private javax.swing.JTextField fp_signin_link_hover;
    private javax.swing.JTextArea g_dec_textArea;
    private javax.swing.JTextField g_name_text;
    private javax.swing.JPanel group_create_panel;
    private javax.swing.JLabel group_creation_state;
    private javax.swing.JPanel group_panel;
    private javax.swing.JScrollPane group_scrollPane;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layered_pane;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel minimize;
    private javax.swing.JScrollPane msgScrollPane;
    private javax.swing.JTextField msg_typer;
    private javax.swing.JTextField new_pwd;
    private javax.swing.JTextField new_pwd2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_icon;
    private javax.swing.JLabel password_line;
    private javax.swing.JLabel send_btn;
    private javax.swing.JLabel setting_lable;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel setting_previous;
    private javax.swing.JTextField sign_up_link;
    private javax.swing.JTextField sign_up_link_hover;
    private javax.swing.JLabel signin_btn;
    private javax.swing.JLabel signin_copyrights;
    private javax.swing.JLabel signin_copyrights1;
    private javax.swing.JLabel signin_error;
    private javax.swing.JLabel signin_footer;
    private javax.swing.JLabel signin_footer1;
    private javax.swing.JTextField signin_link;
    private javax.swing.JTextField signin_link_hover;
    private javax.swing.JTextField signin_link_hover1;
    private javax.swing.JPanel signin_panel;
    private javax.swing.JLabel signup_btn;
    private javax.swing.JLabel signup_copyrights;
    private javax.swing.JLabel signup_copyrights1;
    private javax.swing.JLabel signup_copyrights2;
    private javax.swing.JLabel signup_copyrights3;
    private javax.swing.JTextField signup_email;
    private javax.swing.JLabel signup_email_line;
    private javax.swing.JLabel signup_email_line1;
    private javax.swing.JLabel signup_email_line2;
    private javax.swing.JLabel signup_error;
    private javax.swing.JLabel signup_error1;
    private javax.swing.JLabel signup_eye_close_icon;
    private javax.swing.JLabel signup_eye_open_icon;
    private javax.swing.JLabel signup_footer;
    private javax.swing.JLabel signup_footer1;
    private javax.swing.JLabel signup_footer2;
    private javax.swing.JLabel signup_footer3;
    private javax.swing.JTextField signup_nickname;
    private javax.swing.JLabel signup_nickname_line;
    private javax.swing.JLabel signup_nickname_line1;
    private javax.swing.JPanel signup_panel;
    private javax.swing.JPasswordField signup_password;
    private javax.swing.JLabel signup_password_line;
    private javax.swing.JLabel signup_profile_pic;
    private javax.swing.JTextField signup_username;
    private javax.swing.JLabel signup_username_line;
    private javax.swing.JLabel signup_username_line1;
    private javax.swing.JLabel signup_username_line2;
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
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_icon;
    private javax.swing.JLabel username_line;
    private javax.swing.JLabel username_line1;
    // End of variables declaration//GEN-END:variables
}
