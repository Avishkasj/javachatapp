
package fotchat.interfaces;

import java.io.Serializable;


public class chatUser implements Serializable {
    int id;
    String username;
    String nickname;
    String email;

    public chatUser(int id, String username, String nickname, String email) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }
    
}
