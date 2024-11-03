package com.example.rentacarspringboot.Services.Abstracts.CarService;

import com.example.rentacarspringboot.Dtos.CarDtos.SuvAddDTO;
import com.example.rentacarspringboot.Dtos.CarDtos.SuvUpdateDTO;
import com.example.rentacarspringboot.Entities.CarEntities.SuvCar;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SuvService {

    void addSuv(SuvAddDTO dto);

    void updateSuv(SuvUpdateDTO dto);

    SuvCar GetByIdSuvCar(Long id);

    void rentaSuv(long id, int rentalDays, long customerId);

    List<SuvCar> getAllSuvCars();
}
