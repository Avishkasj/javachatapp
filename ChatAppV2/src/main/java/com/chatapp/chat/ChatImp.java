package com.chatapp.chat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class ChatImp extends UnicastRemoteObject implements Chat {

    private List<Observer> observers = new ArrayList<>();

    public List<Message> newMessage = new ArrayList<>();

    public Message newmsg = new Message();



    public ChatImp() throws RemoteException {
        super();
    }

    @Override
    public void registerObserver(com.chatapp.chat.Observer observer) throws RemoteException {
        observers.add(observer);
    }

    @Override
    public void removeObserver(com.chatapp.chat.Observer observer) throws RemoteException {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) throws RemoteException {
        for (Observer observer : observers) {
            observer.receiveMessage(message);
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
        System.out.println(newmsg.getMessage());
        return newmsg;


    }

    @Override
    public void saveToFile() throws RemoteException {

    }

    @Override
    public String test(String text) throws RemoteException {
        System.out.println(text);
        return text;
    }
}
