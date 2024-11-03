package com.example.rentacarspringboot.Controller.CarController;

import com.example.rentacarspringboot.Dtos.CarDtos.SuvAddDTO;
import com.example.rentacarspringboot.Dtos.CarDtos.SuvUpdateDTO;
import com.example.rentacarspringboot.Entities.CarEntities.SuvCar;
import com.example.rentacarspringboot.Services.Abstracts.CarService.SuvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suvcars")
public class SuvController {

    private final SuvService suvService;

    @Autowired
    public SuvController(SuvService suvService) {
        this.suvService = suvService;
    }

    @GetMapping("/listele")
    public List<SuvCar> getAllSuvCars() {
        return suvService.getAllSuvCars();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SuvCar> getSuvCarById(@PathVariable Long id) {
        SuvCar suvCar = suvService.GetByIdSuvCar(id);
        if (suvCar != null) {
            return ResponseEntity.ok(suvCar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("ekle")
    public ResponseEntity<Void> addSuv(@RequestBody SuvAddDTO dto) {
        suvService.addSuv(dto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateSuv(@PathVariable Long id, @RequestBody SuvUpdateDTO dto) {
        dto.setId(id);
        suvService.updateSuv(dto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/kirala")
    public ResponseEntity<Void> rentSuv(@PathVariable Long id, @RequestParam int rentalDays, @RequestParam long customerId) {
        suvService.rentaSuv(id, rentalDays, customerId);
        return ResponseEntity.ok().build();
    }
}
