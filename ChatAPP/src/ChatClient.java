import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClient extends Remote {
    String mame = null;
    String age = null;
    void receive(String message) throws RemoteException;

    void sendMessage(String message) throws RemoteException;
}
