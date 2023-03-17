import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClient extends Remote {

    void receive(String message) throws RemoteException;

    void sendMessage(String message) throws RemoteException;
}
