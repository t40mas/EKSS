package de.ekss.chat.view;

import de.ekss.chat.model.User;
import de.ekss.chat.services.UserService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by thomas on 29.04.15.
 */

@Named
@RequestScoped
public class RegistrationView {

    @Inject
    UserService userService;

    private String username;
    private String password;

    public String userRegistration(){
        User user = new User(username, password);
        return userService.saveUser(user);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
