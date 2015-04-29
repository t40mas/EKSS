package de.ekss.chat.services;

import de.ekss.chat.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by thomas on 29.04.15.
 */

@Stateless
public class UserService {

    @PersistenceContext
    EntityManager em;

    public String saveUser(User user){
        em.persist(user);
        return "index.jsf?faces-redirect=true";
    }

    public String editUser(User user, String name, String password){
        user.setName(name);
        user.setPassword(password);
        em.merge(user);
        return "index.jsf?faces-redirect=true";
    }

    public List<User> userList(){
        return em.createNamedQuery("User.findAllUser").getResultList();
    }

    public User getUser(String name){
        return em.createNamedQuery("User.findUser", User.class).setParameter(1, name).getSingleResult();
    }

    public void deleteUser(User user){
        em.remove(em.merge(user));
    }
}
