import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatServerImpl extends UnicastRemoteObject implements ChatServer {
    private List<ChatClient> clients;

    public ChatServerImpl() throws RemoteException {
        clients = new ArrayList<>();
    }

    @Override
    public void register(ChatClient client) throws RemoteException {
        clients.add(client);
    }

    @Override
    public void broadcast(String message) throws RemoteException {
        for (ChatClient client : clients) {
            client.receive(message);
        }
    }
}
