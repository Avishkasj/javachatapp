import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatAdminImpl extends UnicastRemoteObject implements ChatAdmin {

    public ChatAdminImpl() throws RemoteException {
        super();
    }

    @Override
    public void createChatRoom(String chatRoomName) throws RemoteException {
        ChatRoom chatRoom = new ChatRoomImpl();
        // Add code here to store the chat room with the given name
        System.out.println("Chat room created: " + chatRoomName);
    }
}
