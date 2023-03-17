import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatClientImpl extends UnicastRemoteObject implements ChatClient {
    private ChatServer server;
    private ChatClientMain ui;

    public ChatClientImpl(ChatServer server, ChatClientMain ui) throws RemoteException {
        this.server = server;
        this.ui = ui;
    }

    public void receive(String message) throws RemoteException {
        ui.displayMessage(message);
    }

    public void sendMessage(String message) throws RemoteException {
        server.broadcast(message);
    }
}
