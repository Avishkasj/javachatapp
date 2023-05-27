package com.chatapp.database;

import com.chatapp.chat.User;
import entity.GroupsEntity;
import entity.UserEntity;
import jakarta.persistence.*;
import org.hibernate.Session;

public class Database {

    public EntityManagerFactory emf;
    public EntityManager em;
    public EntityTransaction et;
    public Session se;

    public Database() {
        emf = Persistence.createEntityManagerFactory("default");
        em = emf.createEntityManager();
        et = em.getTransaction();
        se = em.unwrap(Session.class);
    }

    public void insert(UserEntity userEntity){
        try {
            et.begin();
            em.persist(userEntity);
            et.commit();
        }finally {
            if (et.isActive()){
                et.rollback();
            }

        }
    }

    public void insertroom(GroupsEntity groupsEntity){
        try {
            et.begin();
            em.persist(groupsEntity);
            et.commit();
        }finally {
            if (et.isActive()){
                et.rollback();
            }

        }
    }

    public UserEntity search(String username) {
        UserEntity user;
        try {
            user = em.find(UserEntity.class, username);


        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }

        return user;

    }

    public UserEntity login(String username){
        UserEntity user;
        try {
            et.begin();

            String sqlQuery = "SELECT * FROM user WHERE username = :username";
            Query query = em.createNativeQuery(sqlQuery, UserEntity.class);
            query.setParameter("username", username);

            user = (UserEntity) query.getSingleResult();

        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }

        return user;
    }

    public UserEntity UserPro(int id) {
        UserEntity user;
        try {
            user = em.find(UserEntity.class, id);
        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }
        return user;
    }

    public int update(UserEntity userEntity) {
        int updated;
        try {
            et.begin();
            updated = em.createQuery("update UserEntity us set us.username = :username, us.nickname = :nickname, us.email = :email, us.password = :password where us.id = :id")
                    .setParameter("username", User.getUsername())
                    .setParameter("nickname",User.getNickname() )
                    .setParameter("email", User.getEmail())
                    .setParameter("password", User.getPassword())
                    .setParameter("id", User.getId())
                    .executeUpdate();



        } finally {
            if (et.isActive()) {
                et.rollback();
            }

        }
        return updated;
    }


    public void close(){
        em.close();
        emf.close();
    }




}
