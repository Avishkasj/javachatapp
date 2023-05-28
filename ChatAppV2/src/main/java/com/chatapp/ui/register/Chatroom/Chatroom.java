package com.chatapp.ui.register.Chatroom;

import com.chatapp.chat.User;
import com.chatapp.database.Database;
import com.chatapp.ui.register.UserDashboard;
import com.chatapp.ui.register.UserProfile;
import entity.GroupsEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Chatroom extends JFrame {
    private JTextField textField1;
    private JButton createButton;
    private JPanel roompanel;
    private JTextArea textArea1;
    private JButton availableRoomsButton;

    public Database db = new Database();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chatroom");
        frame.setContentPane(new Chatroom().roompanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Chatroom() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(roompanel);
        this.pack();

        System.out.println(User.getNickname());

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomname = textField1.getText().trim();
                String discription = textArea1.getText();
                LocalDate currentDate = LocalDate.now();
                LocalTime currentTime = LocalTime.now();
                String currentTimeString = currentTime.toString();


                GroupsEntity grope = new GroupsEntity();
                grope.setName(roomname);
                grope.setDescription(discription);
                grope.setIcon(null);
                grope.setStatus(0);
                grope.setIsDeleted(0);
                grope.setCreatedDate(Date.valueOf(currentDate));
                grope.setCreatedTime(String.valueOf(currentDate));


                db.insertroom(grope); // Close the session

                System.out.println("Room added successfully");

                textArea1.setText("");
                textField1.setText("");
            }
        });


        availableRoomsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chatroom.super.dispose();
                JFrame frame8 = new Chatstart();
                frame8.setVisible(true);
                frame8.setSize(400, 500);
            }
        });
    }
}
