package com.example.rentacarspringboot.Entities.CarEntities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;

@Entity
@Table(name="sedancar")
@Getter
@Setter
public class SedanCar
{
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
