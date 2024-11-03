package com.example.rentacarspringboot.Services.Abstracts.CustomerService;

import com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos.CorporateCustomerAddDTO;
import com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos.CorporateCustomerUpdateDTO;
import com.example.rentacarspringboot.Entities.CustomerEntities.CorporateCustomer;

import java.util.List;

public interface CorporateCustomerService
{
    void addCorporateCustomer(CorporateCustomerAddDTO corporateCustomerDTO);
    CorporateCustomer getCorporateCustomerById(Long id);
    List<CorporateCustomer> getAllCorporateCustomers();
    void updateCorporateCustomer(Long id, CorporateCustomerUpdateDTO corporateCustomerDTO);
}
