package com.chatapp.chat.Server;

import com.chatapp.chat.Chat;
import com.chatapp.chat.ChatImp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public void runServer(String name){
        try {
            Chat chat = new ChatImp();

            LocateRegistry.createRegistry(3000);

            Naming.rebind("rmi://192.168.8.119:3000/"+name, chat);

            System.out.println("Server up and running");

        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Server().runServer("chat");
    }


}
