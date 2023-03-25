import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ChatRoom extends Remote {
    void subscribe(ChatClient client) throws RemoteException;
    void unsubscribe(ChatClient client) throws RemoteException;
    void broadcast(String message) throws RemoteException;
    void createChatroom(String chatroomName) throws RemoteException;
    List<String> getChatrooms() throws RemoteException;
}
