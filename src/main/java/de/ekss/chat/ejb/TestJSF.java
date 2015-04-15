package de.ekss.chat.ejb;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by thomas on 15.04.15.
 */

@Named
@SessionScoped
public class TestJSF implements Serializable{

    private String name = "test";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
