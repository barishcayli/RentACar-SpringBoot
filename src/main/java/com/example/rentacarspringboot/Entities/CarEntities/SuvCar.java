package com.example.rentacarspringboot.Entities.CarEntities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;

@Entity
@Table(name="suvcar")
@Getter
@Setter
public class SuvCar{
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
    private int rentaldays;




}
