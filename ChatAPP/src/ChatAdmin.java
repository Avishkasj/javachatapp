import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatAdmin extends Remote {
    void createChatRoom(String chatRoomName) throws RemoteException;
}
