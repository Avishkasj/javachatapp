import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatServer extends Remote {
    void register(ChatClient client) throws RemoteException;
    void broadcast(String message) throws RemoteException;


    void createChatRoom(String name) throws RemoteException;
    void deleteChatRoom(String name) throws RemoteException;
    ChatRoom getChatRoom(String name) throws RemoteException;
}
