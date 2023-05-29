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

    public void runClient(String name, int portid){
        String chat = "";

        int port = 30000+portid;

        try {

            chatClient = (Chat) Naming.lookup("rmi://localhost:"+port+"/"+name);

            //observer
//            Chat chatClient = new ChatImp();
//            Observer user2 = new RemoteUser("User2");
//            chatClient.registerObserver(user2);
//
//            Message msg = new Message();
//            msg.setMessage("User registered succussfully!");
//
//            chatClient.sendMessage(msg);
//            chatClient.notifyObservers();
//               System.out.println(msg);


//            Observer newUser= new RemoteUser(User.getNickname());
////            Observer remoteUser2 = new RemoteUser("User2");
////
//            chatClient.registerObserver(newUser);
            //chatClient.notifyObservers("New User is registered...");
//            chatClient.registerObserver(remoteUser2);
//
  //          Message msg = new Message();
//
//            while (true){
//                System.out.println("Enter the message : ");
//                String ms = input.nextLine();
//                msg.setMessage(ms);
     //        chatClient.notifyObservers(msg);
////                System.out.println(chat);
//            }




        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        new Client().runClient("chat1", 1);

    }

}
