import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin extends JFrame{
    Admin(){
        this.setContentPane(this.pp);
        this.setVisible(true);
        this.setSize(800,500);
        del1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    JPanel pp;
    private JButton addButton;
    private JButton removeButton;
    private JButton addButton1;
    private JButton removeButton1;
    private JButton addButton2;
    private JButton removeButton2;
    private JButton addButton3;
    private JButton removeButton3;
    private JButton createNewChatButton;
    private JLabel del1;
    private JLabel del2;
    private JLabel exit;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    //    private JPanel pp;

}

