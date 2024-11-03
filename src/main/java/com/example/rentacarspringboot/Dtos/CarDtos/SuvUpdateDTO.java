package com.example.rentacarspringboot.Dtos.CarDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuvUpdateDTO {
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
