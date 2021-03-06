package com.epam.race.entity;



import java.math.BigDecimal;


public class User implements Entity{
    private int userId;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;
    private UserType userType;

    public User() {
    }

    public User(int userId, String name, String surname, String login,
                String password, String email, UserType userType) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public User(String name, String surname, String login,
                String password, String email, UserType userType, BigDecimal account) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }


    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
