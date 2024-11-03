package com.example.rentacarspringboot.Entities.CustomerEntities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;


@Entity
@Getter
@Setter
@Table(name="kurumsalmusteri")
public class CorporateCustomer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private String companyName;

    private int taxNo;

}
