package com.example.rentacarspringboot.Services.Concretes.CustomerConcretes;

import com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos.CorporateCustomerAddDTO;
import com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos.CorporateCustomerUpdateDTO;
import com.example.rentacarspringboot.Entities.CustomerEntities.CorporateCustomer;
import com.example.rentacarspringboot.Repository.CustomerRepositories.CorporateCustomerRepository;
import com.example.rentacarspringboot.Services.Abstracts.CustomerService.CorporateCustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorporateCustomerBusinnes implements CorporateCustomerService {
    private final CorporateCustomerRepository corporateCustomerRepository;

    public CorporateCustomerBusinnes(CorporateCustomerRepository corporateCustomerRepository) {
        this.corporateCustomerRepository = corporateCustomerRepository;
    }

    @Override
    public void addCorporateCustomer(CorporateCustomerAddDTO dto) {
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName(dto.getCompanyName());
        corporateCustomer.setTaxNo(dto.getTaxNo());
        corporateCustomerRepository.save(corporateCustomer);
    }

    @Override
    public void updateCorporateCustomer(Long id, CorporateCustomerUpdateDTO dto) {
        Optional<CorporateCustomer> existingCustomer = corporateCustomerRepository.findById(id);
        if (existingCustomer.isPresent()) {
            CorporateCustomer corporateCustomer = existingCustomer.get();
            corporateCustomer.setCompanyName(dto.getCompanyName());
            corporateCustomer.setTaxNo(dto.getTaxNo());
            corporateCustomerRepository.save(corporateCustomer);
        }
    }

    @Override
    public List<CorporateCustomer> getAllCorporateCustomers() {
        return corporateCustomerRepository.findAll();
    }

    @Override
    public CorporateCustomer getCorporateCustomerById(Long id) {
        return corporateCustomerRepository.findById(id).orElse(null);
    }


}
