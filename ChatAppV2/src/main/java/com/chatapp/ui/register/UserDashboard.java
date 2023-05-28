package com.chatapp.ui.register;

import com.chatapp.chat.ChatUser;
import com.chatapp.chat.Server.Client;
import com.chatapp.chat.Server.Server;
import com.chatapp.chat.User;
import com.chatapp.database.Database;
import entity.GroupsEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class UserDashboard extends JFrame {
    private JButton profileButton;
    private JPanel dashpanel;

    //view chats
    private JButton SubBtn;
    private JPanel SubPanel;
    private JTable table1;

    public Database db = new Database();
    private DefaultTableModel tableModel;


    public UserDashboard() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(dashpanel);
        this.pack();


        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Description"}, 0);
        table1.setModel(tableModel);

        List<GroupsEntity> chatrooms = db.getRooms();

        tableModel.setRowCount(0); // Clear existing data

        for (GroupsEntity chatroom : chatrooms) {
            Object[] rowData = {chatroom.getId(), chatroom.getName(), chatroom.getDescription()};
            tableModel.addRow(rowData);
        }

    
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserDashboard.super.dispose();
                JFrame frame6 = new UserProfile();
                frame6.setVisible(true);
                frame6.setSize(400, 500);
            }
        });


        SubBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //get selected table value
                int selectedRow = table1.getSelectedRow();

                if (selectedRow != -1) {
                    // Get the data from the selected row
                    Object id = tableModel.getValueAt(selectedRow, 0);
                    Object name = tableModel.getValueAt(selectedRow, 1);
                    Object description = tableModel.getValueAt(selectedRow, 2);

                    // Assign the values to variables
                    int selectedId = Integer.parseInt(id.toString());
                    String selectedName = name.toString(); // Assuming Name is of type String
                    String selectedDescription = description.toString(); // Assuming Description is of type String

                    // Use the variables as needed
                    System.out.println("Selected ID: " + selectedId);
                    System.out.println("Selected Name: " + selectedName);
                    System.out.println("Selected Description: " + selectedDescription);
                    File file = new File("/Users/avishkasupun/Documents/Untitled/ChatAppV2/src/main/java/com/chatapp/image/user.png");
                    byte[] imageData;
                    try {
                        imageData = Files.readAllBytes(file.toPath());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }



                    String umane = User.getUsername();
                    String nicname = User.getNickname();
                    System.out.println("Nurrent user: - "+ umane);


//                    ChatUser cu = new ChatUser(umane,11,nicname, "imageData".getBytes());
                    SwingUtilities.invokeLater(UserChat::new);



                } else {
                    System.out.println("No row selected.");
                }


            }
        });
    }

}
