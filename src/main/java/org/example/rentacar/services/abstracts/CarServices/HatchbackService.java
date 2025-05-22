package org.example.rentacar.services.abstracts.CarServices;

import org.example.rentacar.entites.CarsEntites.HatchbackCar;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HatchbackService {

    List<HatchbackCar> getAllHatcbackCars();
    HatchbackCar getByIdHatcbackCar(Long id);
    void deleteByIdHatcbackCar(Long id);
    HatchbackCar createHatcbackCar(HatchbackCar newCar);
    HatchbackCar updateHatcbackCar(Long id, HatchbackCar newCar);
    void rentHatcback(Long id, HatchbackCar hatchbackCar) throws Exception;
}
