package de.ekss.chat.ejb;

import de.ekss.chat.jpa.Customer;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by thomas on 15.04.15.
 */

@ApplicationScoped
public class TestPersist {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        Customer user = new Customer("thomas", "egal");
        em.persist(user);
    }

}
