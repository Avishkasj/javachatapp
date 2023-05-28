package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.GroupsEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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


    }

}
