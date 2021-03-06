package com.example.security.pojo;

import lombok.Data;

/**
 * FileName:com.example.security.domain
 * Author:70968
 * Date:2021-04-11 11:29
 * History
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User() {
    }
}
