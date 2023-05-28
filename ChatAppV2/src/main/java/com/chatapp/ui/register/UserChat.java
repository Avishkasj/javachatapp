package com.chatapp.ui.register;

import com.chatapp.chat.Chat;
import com.chatapp.chat.Message;
import com.chatapp.chat.Server.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

public class UserChat {
    private JPanel uchat;

    Client client = new Client();
    Chat chatClient = null;

    private String lastms = "";

    JFrame frame = new JFrame("uchat");
    JList<Message> list = new JList<>();
    DefaultListModel<Message> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JTextField textField = new JTextField(20);
    JButton button = new JButton("Send");

    public UserChat() {
        client.runClient();

        try {
            chatClient = client.chatClient;

            list.setModel(model);
            list.setCellRenderer(new MessageListRenderer());

            panel.setLayout(new BorderLayout());
            panel.add(label, BorderLayout.NORTH);
            panel.add(textField, BorderLayout.CENTER);
            panel.add(button, BorderLayout.EAST);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String messagebox = textField.getText();
                    Message message = new Message();
                    message.setMessage(textField.getText());
                    try {
                        chatClient.sendMessage(message);
                    } catch (RemoteException ex) {
                        ex.printStackTrace();
                    }
                    textField.setText("");
                }
            });

            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.add(new JScrollPane(list), BorderLayout.CENTER);
            frame.add(panel, BorderLayout.SOUTH);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            Thread updateMessagesThread = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Message message = chatClient.broadcast();
                            if (lastms.equals(message.getMessage())){
                                SwingUtilities.invokeLater(() -> model.addElement(message));
                            }else {
                                break;
                            }
                            Thread.sleep(100);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
            updateMessagesThread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserChat::new);
    }

    private class MessageListRenderer extends JLabel implements ListCellRenderer<Message> {
        public MessageListRenderer() {
            setOpaque(true);
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        public Component getListCellRendererComponent(JList<? extends Message> list, Message message, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            setText(message.getMessage());
            return this;
        }
    }
}
