import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChatBall extends JFrame {
    private static final long serialVersionUID = 1L;
    static int y;

    public ChatBall() {
        initComponents();
    }

    public ChatBall(login lg) {
        initComponents();
        this.login = lg;
    }

    login login;

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel jLabel1 = new JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/chatBall.png")));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        panel.add(jLabel1);
        add(panel);

        setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screen_size.width-80, 150);
    }

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {
        y = evt.getY();
    }

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {
        Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();

        int y = evt.getYOnScreen();

        if (evt.getYOnScreen() >= 100 && evt.getYOnScreen() <= (screen_size.height-100)) {
            this.setLocation(screen_size.width-80, y-ChatBall.y);
        }
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        login.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatBall().setVisible(true);
            }
        });
    }
}
