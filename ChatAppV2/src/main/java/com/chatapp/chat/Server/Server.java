package com.chatapp.chat.Server;

import com.chatapp.chat.Chat;
import com.chatapp.chat.ChatImp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, Chat> chatInstances;

    public Server() {
        chatInstances = new HashMap<>();
    }

    public void runServer(String name, int portid) {
        try {
            Chat chat = new ChatImp();

            int port = 30000+portid;

            LocateRegistry.createRegistry(port);

            Naming.rebind("rmi://192.168.8.119:" + port + "/" + name, chat);

            chatInstances.put(name, chat);

            System.out.println("Server '" + name + "' up and running on port : " + port);

        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void stopServer(String name, int portid) {
        int port = 30000+portid;
        try {
            Chat chat = chatInstances.get(name);
            if (chat != null) {
//                String[] bindings = Naming.list("rmi://localhost/");
//                for (String binding : bindings) {
//                    if (binding.contains(name)) {
//                        Naming.unbind(binding);
//                        break;
//                    }
//                }
                Naming.unbind("rmi://192.168.8.119:" + port + "/" + name);
                chatInstances.remove(name);
                System.out.println("Server '" + name + "' stopped.");
            } else {
                System.out.println("Server '" + name + "' is not running.");
            }
        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.runServer("chat1",1);
        server.runServer("chat2",2);



        // Stop server example
        // server.stopServer("chat1");
    }
}
