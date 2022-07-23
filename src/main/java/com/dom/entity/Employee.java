package com.dom.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String role;


    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", role=" + role + "]";
    }

}