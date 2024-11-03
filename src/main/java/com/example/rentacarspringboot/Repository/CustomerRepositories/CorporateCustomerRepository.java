package com.example.rentacarspringboot.Repository.CustomerRepositories;

import com.example.rentacarspringboot.Entities.CustomerEntities.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer, Long> {
}
