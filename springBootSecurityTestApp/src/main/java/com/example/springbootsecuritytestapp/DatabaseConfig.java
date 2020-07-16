package com.example.springbootsecuritytestapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DatabaseConfig {
    @Id
    long Id;
    String UserName, password;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
