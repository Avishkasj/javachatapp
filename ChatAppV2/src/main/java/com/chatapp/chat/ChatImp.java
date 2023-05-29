package com.chatapp.chat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class ChatImp extends UnicastRemoteObject implements Chat {

    private List<Observer> observers = new ArrayList<>();

//--
    private List<Integer>sub=new ArrayList<Integer>();


    public List<Message> newMessage = new ArrayList<>();

    public Message newmsg = new Message();



    public ChatImp() throws RemoteException {
        super();
    }

    @Override
    public void registerObserver(com.chatapp.chat.Observer observer) throws RemoteException {
        observers.add(observer);
        System.out.println("New user added....");
    }

    @Override
    public void removeObserver(com.chatapp.chat.Observer observer) throws RemoteException {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String text) throws RemoteException {
        for (Observer observer : observers) {
            observer.receiveMessage(text);
        }
    }

    @Override
    public void subscribe() throws RemoteException {

    }

    @Override
    public boolean is_subscribe() throws RemoteException {
        return false;
    }

    @Override
    public void sendMessage(Message msg) throws RemoteException {
        newMessage.add(msg);
        newmsg = msg;
        System.out.println(newmsg.getMessage());
    }

    @Override
    public Message broadcast() throws RemoteException {
        return newmsg;


    }

    @Override
    public void saveToFile() throws RemoteException {
        try (FileOutputStream fos = new FileOutputStream("messages.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(newMessage);

            System.out.println("Messages saved to file: messages.ser");

            // Read and print the file contents for verification
            try (FileInputStream fis = new FileInputStream("messages.ser");
                 ObjectInputStream ois = new ObjectInputStream(fis)) {

                List<Message> messages = (List<Message>) ois.readObject();
                System.out.println("Read messages from file:");
                for (Message message : messages) {
                    System.out.println(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String test(String text) throws RemoteException {
        System.out.println(text);
        return text;
    }
}
