package com.example.rentacarspringboot.Controller;

import com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos.CorporateCustomerAddDTO;
import com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos.CorporateCustomerUpdateDTO;
import com.example.rentacarspringboot.Entities.CustomerEntities.CorporateCustomer;
import com.example.rentacarspringboot.Services.Abstracts.CustomerService.CorporateCustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corporate-customers")
public class CorporateCustomerController {
    private final CorporateCustomerService corporateCustomerService;

    public CorporateCustomerController(CorporateCustomerService corporateCustomerService) {
        this.corporateCustomerService = corporateCustomerService;
    }

    @PostMapping("/ekle")
    public ResponseEntity<String> addCorporateCustomer(@RequestBody CorporateCustomerAddDTO dto) {
        corporateCustomerService.addCorporateCustomer(dto);
         return ResponseEntity.ok("Kurumsal müşteri eklendi.");
    }

    @PutMapping("/guncelle")
    public ResponseEntity<String> updateCorporateCustomer(@RequestBody CorporateCustomerUpdateDTO dto) {
        corporateCustomerService.updateCorporateCustomer(dto.getId(), dto);
        return ResponseEntity.ok("Kurumsal müşteri guncellendi.");
    }

    @GetMapping("listele")
    public ResponseEntity<List<CorporateCustomer>> getAllCorporateCustomers() {
        List<CorporateCustomer> customers = corporateCustomerService.getAllCorporateCustomers();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CorporateCustomer> getCorporateCustomerById(@PathVariable Long id) {
        CorporateCustomer customer = corporateCustomerService.getCorporateCustomerById(id);
        return customer != null ? ResponseEntity.ok(customer) : ResponseEntity.notFound().build(); // Not Found
    }

}
