package de.ekss.chat.model;

import javax.persistence.*;

/**
 * Created by thomas on 15.04.15.
 */

@Entity(name = "_user")
@NamedQueries({
        @NamedQuery(name = "User.findAllUser", query = "select u from _user u"),
        @NamedQuery(name = "User.findUser", query = "select u from _user u where u.name like ?1")
}
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique=true, nullable=false)
    private String name;

    @Column(nullable=false)
    private String password;

    public User(){}

    public User(String name, String password){
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
