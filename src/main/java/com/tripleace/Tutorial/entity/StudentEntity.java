package com.tripleace.Tutorial.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private String studentClass;

    @OneToOne(cascade = {CascadeType.ALL})
    private AddressEntity address;
}
