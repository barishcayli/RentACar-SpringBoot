package com.example.rentacarspringboot.Services.Abstracts.CustomerService;

import com.example.rentacarspringboot.Dtos.CustomerDtos.IndividualCustomerDtos.IndividualCustomerAddDto;
import com.example.rentacarspringboot.Entities.CustomerEntities.IndividualCustomer;

import java.util.List;


public interface IndividualCustomerService {

    void addIndividualCustomer(IndividualCustomerAddDto individualCustomerAddDto);
    void updateIndividualCustomer(IndividualCustomerAddDto individualCustomerAddDto);
    List<IndividualCustomer> getAllIndividualCustomers();
    IndividualCustomer getIndividualCustomerById(long id);





}
