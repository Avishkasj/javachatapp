package com.chatapp.chat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteUser extends UnicastRemoteObject implements Observer {
    private String username;

    public RemoteUser(String username) throws RemoteException {
        this.username = username;
    }

    @Override
    public void receiveMessage(String text) throws RemoteException {

        System.out.println(username + " received message: " + text);
    }


}