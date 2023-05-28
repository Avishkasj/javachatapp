package com.chatapp.chat.Server;

import com.chatapp.chat.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {

    public Chat chatClient = null;
    Scanner input = new Scanner(System.in);

    public void runClient(){
        String chat = "";

        try {

            chatClient = (Chat) Naming.lookup("rmi://192.168.8.119:3000/chat");

//

        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        new Client().runClient();

    }

}
