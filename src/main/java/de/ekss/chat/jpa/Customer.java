package de.ekss.chat.jpa;

import javax.persistence.*;

/**
 * Created by thomas on 15.04.15.
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique=true, nullable=false)
    private String name;

    @Column(nullable=false)
    private String password;

    public Customer(){}

    public Customer(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
