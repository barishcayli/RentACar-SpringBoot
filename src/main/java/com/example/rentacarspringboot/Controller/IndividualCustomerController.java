package com.example.rentacarspringboot.Controller;

import com.example.rentacarspringboot.Services.Concretes.CustomerConcretes.IndividualCustomerBusinnes;
import com.example.rentacarspringboot.Dtos.CustomerDtos.IndividualCustomerDtos.IndividualCustomerAddDto;
import com.example.rentacarspringboot.Entities.CustomerEntities.IndividualCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/individual-customers")
public class IndividualCustomerController {

    private final IndividualCustomerBusinnes individualCustomerBusinnes;

    @Autowired
    public IndividualCustomerController(IndividualCustomerBusinnes individualCustomerBusinnes) {
        this.individualCustomerBusinnes = individualCustomerBusinnes;
    }

    @PostMapping("/ekle")
    public ResponseEntity<String> addIndividualCustomer(@RequestBody IndividualCustomerAddDto dto) {
        individualCustomerBusinnes.addIndividualCustomer(dto);
        return ResponseEntity.ok("Bireysel müşteri eklendi.");
    }

    @PutMapping("guncelle")
    public ResponseEntity<String> updateIndividualCustomer(@RequestBody IndividualCustomerAddDto dto) {
        individualCustomerBusinnes.updateIndividualCustomer(dto);
        return ResponseEntity.ok("Bireysel müşteri güncellendi.");
    }

    @GetMapping("/listele")
    public ResponseEntity<List<IndividualCustomer>> getAllIndividualCustomers() {
        List<IndividualCustomer> customers = individualCustomerBusinnes.getAllIndividualCustomers();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{tc}")
    public ResponseEntity<IndividualCustomer> getIndividualCustomerBytc(@PathVariable long tc) {
        IndividualCustomer customer = individualCustomerBusinnes.getIndividualCustomerById(tc);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
