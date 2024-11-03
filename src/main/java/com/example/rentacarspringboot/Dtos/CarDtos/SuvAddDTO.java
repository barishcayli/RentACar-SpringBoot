package com.example.rentacarspringboot.Dtos.CarDtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuvAddDTO {
    private String brand;
    private String model;
    private String color;
    private String segment;
    private String gearType;
    private int year;
    private int price;
    private int rentaldays;


    }

