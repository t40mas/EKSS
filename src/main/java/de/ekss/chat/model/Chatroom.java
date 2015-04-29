package de.ekss.chat.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by thomas on 22.04.15.
 */

@Entity
public class Chatroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "chatroom")
    private List<Nachricht> nachrichtList;

    public String getName() {
        return name;
    }

    public Chatroom setName(String name) {
        this.name = name;
        return this;
    }

    public List<Nachricht> getNachrichtList() {
        return nachrichtList;
    }

    public Chatroom setNachrichtList(List<Nachricht> nachrichtList) {
        this.nachrichtList = nachrichtList;
        return this;
    }
}
