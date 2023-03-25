/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotchat.dbmanager;

/**
 *
 * @author Dilum Sadeepa
 */

import fotchat.dbmanager.HibernateUtil;
import fotchat.pogos.Files;
import fotchat.pogos.Groups;
import fotchat.pogos.User;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DBManager {
    
    private static DBManager dbm;

    private DBManager() {
    }

    static {
        dbm = new DBManager();
    }

    public static DBManager getDBM() {
        return dbm;
    }

    public boolean insert(byte[] avatarImage, String email, String username, String nickname, String password) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        User user = new User();

        if (avatarImage != null) {
            user.setAvatar(avatarImage);
        }
        user.setEmail(email);
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setRoleId(2);
        user.setIsDeleted(0);

        s.save(user);
        t.commit();
        s.close();
        return true;

    }

    public List login(String username, String password) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM User WHERE username='" + username + "' AND password='" + password + "'";
        Query query = s.createQuery(sql);
        List User = query.list();
        return User;
    }

    public void update(byte[] img, String email, String nickname, int id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();

        User user = (User) s.load(User.class, id);
        user.setEmail(email);
        user.setNickname(nickname);

        s.update(user);
        t.commit();
        System.out.println("Update success!");
        s.close();
    }

    

    public boolean createChat(String chatname, String chatdes) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Groups groups = new Groups();

        Time time = Time.valueOf(LocalTime.now());
        Date date = Date.valueOf(LocalDate.now());

        groups.setName(chatname);
        groups.setDescription(chatdes);
        groups.setCreatedDate(date);
        groups.setCreatedTime(time);
        groups.setStatus("0");
        groups.setIsDeleted(0);

        try {
            s.save(groups);
            t.commit();
            System.out.println("Group chat successful!");
            s.close();
            
            this.initMsgFile(chatname);
            
            return true;
        } catch (HibernateException e) {
            return false;
        }

    }

    public void initMsgFile(String chatName) {

        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE name='" + chatName + "'";
        Query qu = s.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        int chatId = 0;
        if (i.hasNext()) {
            Groups g = (Groups) i.next();
            chatId = g.getId();
        }


        Transaction t = s.beginTransaction();
        Files files = new Files();

        files.setChatId(chatId);
        files.setLink("chatLog/"+chatId + ".ser");
        files.setIsDeleted(0);

        s.save(files);
        t.commit();
        s.close();

    }

    public List getChats() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE is_deleted=0";
        Query qu = s.createQuery(sql);
        List Group = qu.list();
        return Group;
    }

    public boolean isOnline(int chatId) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE status=1 AND id=" + chatId;
        Query qu = s.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        if (i.hasNext()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAllOffline() {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE status=1";
        Query qu = sess.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        if (i.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean putOnline(int chat_id) {

        if (checkAllOffline()) {

            Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction tran = s.beginTransaction();

            Groups group = (Groups) s.load(Groups.class, chat_id);
            group.setStatus("1");

            s.update(group);
            tran.commit();
            System.out.println(chat_id + "online..!");
            s.close();

            return true;
        } else {
            return false;
        }
    }

    public void putOffline(int id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();

        Groups groups = (Groups) s.load(Groups.class, id);
        groups.setStatus("0");

        s.update(groups);
        t.commit();
        System.out.println(id + "Offline..!");
        s.close();
    }

    public List getAvatar(int userId) {

        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM User WHERE id='" + userId + "' AND is_deleted=0";
        Query qu = s.createQuery(sql);
        List User = qu.list();
        return User;
    }
    
}
