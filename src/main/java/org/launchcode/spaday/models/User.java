package org.launchcode.spaday.models;

public class User {

    private String username;
    private String email;
    private String password;
    private String passwordVerified;

    public User(String username, String email, String password, String passwordVerified) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordVerified = passwordVerified;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordVerified() {
        return passwordVerified;
    }

    public void setPasswordVerified(String passwordVerified) {
        this.passwordVerified = passwordVerified;
    }
}
