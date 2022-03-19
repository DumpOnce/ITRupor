package com.example.entities;


import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String Name;

    @Column(name = "female")
    private String Female;

    @Column(name = "hash")
    private String hashSum;

    @Column(name = "money")
    private int money;

    @Column(name = "age")
    private int age;

}
