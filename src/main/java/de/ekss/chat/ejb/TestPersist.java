package de.ekss.chat.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by thomas on 15.04.15.
 */

@ApplicationScoped
@Startup
public class TestPersist {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){

    }

}
