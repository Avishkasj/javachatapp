import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatRoom extends Remote {
    void subscribe(ChatClient client) throws RemoteException;
    void unsubscribe(ChatClient client) throws RemoteException;
    void broadcast(String message) throws RemoteException;
}
