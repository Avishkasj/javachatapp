
package fotchat.services;

import fotchat.interfaces.chatUser;
import fotchat.interfaces.Message;
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Chat extends Remote{
    
    public void send_message(Message msg) throws RemoteException;

    public Message broadcast() throws RemoteException;
    
    public void subscribre(int group_id,chatUser c) throws RemoteException;
    
    public void unsubscribre(int group_id,chatUser c) throws RemoteException;
    
    public boolean is_subscribed(int client_id) throws RemoteException;
}
