package de.ekss.chat.ejb;

import de.ekss.chat.jpa.Customer;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by thomas on 15.04.15.
 */

@Named
@Stateless
public class TestJSF implements Serializable{

    @PersistenceContext
    EntityManager em;

    public void saveCustomer(){
        Customer customer = new Customer("test", "neu");
        em.persist(customer);

    }
}
