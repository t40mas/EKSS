package de.ekss.chat.jpa;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by thomas on 22.04.15.
 */

@Entity
public class Nachricht {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date date;

    @ManyToOne
    private Customer user;

    @ManyToOne
    private Chatroom chatroom;

    private String text;

    public Date getDate() {
        return date;
    }

    public Nachricht setDate(Date date) {
        this.date = date;
        return this;
    }

    public Customer getUser() {
        return user;
    }

    public Nachricht setUser(Customer user) {
        this.user = user;
        return this;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public Nachricht setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
        return this;
    }

    public String getText() {
        return text;
    }

    public Nachricht setText(String text) {
        this.text = text;
        return this;
    }
}
