package com.example.rentacarspringboot.Entities.CarEntities;
import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="hatchbackcar")
@Getter
@Setter

public class HatchbackCar{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String brand;
    private String model;
    private String color;
    private String segment;
    private String gearType;
    private int year;
    private int price;
    private int rentalDays;



    }







