package com.example.rentacarspringboot.Entities.CustomerEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="bireyselmusteri")
public class IndividualCustomer {
    @Id
    @Column(name="tc")
    private Long tc;

    @Column(name="name")
    private String name;

    @Column(name="number")
    private long number;

    public IndividualCustomer(long tc, String name, long number) {
        this.tc = tc;
        this.name = name;
        this.number = number;
    }

    public IndividualCustomer() {

    }
}
