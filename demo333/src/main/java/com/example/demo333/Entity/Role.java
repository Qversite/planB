package com.example.demo333.Entity;

public enum Role {
    USERS("Пользователь"),
    ADMIN("АДминистратор");
    private final String name;
    Role(String name){
        this.name=name;
    }
}
