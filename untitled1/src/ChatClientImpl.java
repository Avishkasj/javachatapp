import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ChatClientImpl extends UnicastRemoteObject implements ChatClient {
    private ChatServer server;

    public ChatClientImpl(ChatServer server) throws RemoteException {
        this.server = server;
    }

    @Override
    public void receive(String message) throws RemoteException {
        System.out.println(message);
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        server.broadcast(message);
    }
}
