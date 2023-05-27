package com.chatapp.ui.register.Chatroom;

import com.chatapp.database.Database;
import entity.GroupsEntity;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Chatstart extends JFrame{
    private JTable table1;
    private JButton startButton;
    private JPanel startpanel;

    public Database db = new Database();
    private DefaultTableModel tableModel;



    public Chatstart() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(startpanel);
        this.pack();

        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Description"}, 0);
        table1.setModel(tableModel);

        List<GroupsEntity> chatrooms = db.getRooms();

        tableModel.setRowCount(0); // Clear existing data

        for (GroupsEntity chatroom : chatrooms) {
            Object[] rowData = {chatroom.getId(), chatroom.getName(), chatroom.getDescription()};
            tableModel.addRow(rowData);
        }

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
}
}
