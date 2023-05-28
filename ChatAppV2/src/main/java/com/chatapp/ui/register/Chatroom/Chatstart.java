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
    private JButton stopButton;

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
            if(chatroom.getStatus()==1){
                System.out.println(chatroom.getStatus());
                Object[] rowData = {chatroom.getId(), chatroom.getName(), chatroom.getDescription()};
                tableModel.addRow(rowData);
            }

        }


        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //get selected valuve
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

//                    Server sc = new Server();
//                    sc.runServer();

//                    new Server().runServer(selectedName);

                } else {
                    System.out.println("No row selected.");
                }

            }
        });
    }
}
