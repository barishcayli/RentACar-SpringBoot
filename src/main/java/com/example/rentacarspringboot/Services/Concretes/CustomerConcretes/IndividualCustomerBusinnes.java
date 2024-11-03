package com.example.rentacarspringboot.Services.Concretes.CustomerConcretes;

import com.example.rentacarspringboot.Dtos.CustomerDtos.IndividualCustomerDtos.IndividualCustomerAddDto;
import com.example.rentacarspringboot.Entities.CustomerEntities.IndividualCustomer;
import com.example.rentacarspringboot.Repository.CustomerRepositories.IndividualCustomerRepository;
import com.example.rentacarspringboot.Services.Abstracts.CustomerService.IndividualCustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndividualCustomerBusinnes implements IndividualCustomerService {
    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomerBusinnes(IndividualCustomerRepository individualCustomerRepository) {
        this.individualCustomerRepository = individualCustomerRepository;
    }

    @Override
    public void addIndividualCustomer(IndividualCustomerAddDto dto) {
        IndividualCustomer individualCustomer = new IndividualCustomer(dto.getTc(), dto.getName(), dto.getNumber());
        individualCustomerRepository.save(individualCustomer);
    }

    @Override
    public void updateIndividualCustomer(IndividualCustomerAddDto dto) {
        Optional<IndividualCustomer> existingCustomer = individualCustomerRepository.findById(dto.getTc());
        if (existingCustomer.isPresent()) {
            IndividualCustomer individualCustomer = existingCustomer.get();
            individualCustomer.setName(dto.getName());
            individualCustomer.setNumber(dto.getNumber());
            individualCustomerRepository.save(individualCustomer);
        }
    }

    @Override
    public List<IndividualCustomer> getAllIndividualCustomers() {
        return individualCustomerRepository.findAll();
    }

    public IndividualCustomer getIndividualCustomerById(long id) {
        return individualCustomerRepository.findById(id).orElse(null);
    }
}
