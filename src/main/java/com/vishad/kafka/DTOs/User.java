package com.vishad.kafka.DTOs;

import lombok.Data;

@Data
public class User {
    private String name;

    public User(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String age;
    private String gender;
}
