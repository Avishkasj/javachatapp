import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatServerImpl extends UnicastRemoteObject implements ChatServer {
    private List<ChatClient> clients;

    public ChatServerImpl() throws RemoteException {
        super();
        clients = new ArrayList<ChatClient>();
    }
    
    public void register(ChatClient client) throws RemoteException {
        clients.add(client);
        System.out.println("Client registered: " + client);
    }

    public void broadcast(String message) throws RemoteException {
        System.out.println("Broadcasting message: " + message);
        for (ChatClient client : clients) {
            client.receive(message);
        }
    }
}
