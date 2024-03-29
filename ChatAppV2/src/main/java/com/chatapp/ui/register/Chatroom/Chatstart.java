package com.chatapp.ui.register.Chatroom;

import com.chatapp.chat.Chat;
import com.chatapp.chat.Server.Client;
import com.chatapp.chat.Server.Server;
import com.chatapp.chat.User;
import com.chatapp.database.Database;
import entity.GroupsEntity;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Chatstart extends JFrame{
    private JTable table1;
    private JButton startButton;
    private JPanel startpanel;
    private JButton stopButton;
    private JButton button1;
    private JButton saveButton;

    public Database db = new Database();
    private DefaultTableModel tableModel;




    public Chatstart() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(startpanel);
        this.pack();

        tableModel = new DefaultTableModel(new Object[]{"id","Name", "Description", "Status"}, 0);
        table1.setModel(tableModel);

        List<GroupsEntity> chatrooms = db.getRooms();

        tableModel.setRowCount(0); // Clear existing data

        for (GroupsEntity chatroom : chatrooms) {
            String status;
            if (chatroom.getStatus() == 1) {
                status = "Running";
            } else {
                status = "Stopped";
            }
            Object[] rowData = {chatroom.getId(),chatroom.getName(), chatroom.getDescription(), status};
            tableModel.addRow(rowData);
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


                    GroupsEntity ge = new GroupsEntity();
                    ge.setId(selectedId);
                    ge.setStatus(1);



                    Server sc = new Server();
                    sc.runServer(selectedName,selectedId);

                    int online = db.setOnline(ge);

                    System.out.println(online);

//                    new Server().runServer(selectedName);

                } else {
                    System.out.println("No row selected.");
                }

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User.logout();
                Chatstart.super.dispose();
            }
        });
        stopButton.addActionListener(new ActionListener() {
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


                    GroupsEntity ge = new GroupsEntity();
                    ge.setId(selectedId);
                    ge.setStatus(0);



                    Server sc = new Server();
                    sc.stopServer(selectedName,selectedId);

                    int online = db.setOnline(ge);

                    System.out.println(online);

//                    new Server().runServer(selectedName);

                } else {
                    System.out.println("No row selected.");
                }
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Client client = new Client();
                Chat chatClient = null;

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

                    client.runClient(selectedName, selectedId);
                    chatClient = client.chatClient;
                    try {
                        chatClient.saveToFile();
                    } catch (RemoteException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
    }
}
