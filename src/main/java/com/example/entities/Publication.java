package com.example.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PublicationTable")
@Entity
public class Publication {

    @Id
    private int publcationId;

}
