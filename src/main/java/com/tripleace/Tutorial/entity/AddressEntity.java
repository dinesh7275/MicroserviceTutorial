package com.tripleace.Tutorial.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Data
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String address1;

    private String address2;

    private String state;

    private String country;
}
