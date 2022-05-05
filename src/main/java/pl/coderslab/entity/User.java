package pl.coderslab.entity;

import org.mindrot.jbcrypt.BCrypt;

public class User {


    @Override
    public String toString() {
        return id +" "+ userName + " " + email + " " + password;
    }

    private int id;
    private String userName;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}