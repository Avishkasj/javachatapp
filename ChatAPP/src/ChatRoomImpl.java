import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl extends UnicastRemoteObject implements ChatRoom {
    private List<ChatClient> clients;

    public ChatRoomImpl() throws RemoteException {
        super();
        clients = new ArrayList<ChatClient>();
    }

    public void subscribe(ChatClient client) throws RemoteException {
        clients.add(client);
        System.out.println("Client subscribed: " + client);
    }

    public void unsubscribe(ChatClient client) throws RemoteException {
        clients.remove(client);
        System.out.println("Client unsubscribed: " + client);
    }

    public void broadcast(String message) throws RemoteException {
        System.out.println("Broadcasting message: " + message);
        for (ChatClient client : clients) {
            client.receive(message);
        }
    }
}
