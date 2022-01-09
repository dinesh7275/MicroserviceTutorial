package com.tripleace.Tutorial.models;

import lombok.Data;

@Data
public class Student {

    private int id;

    private String firstName;

    private String lastName;

    private String studentClass;

    private Address address;

}
