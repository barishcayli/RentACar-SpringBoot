package com.example.rentacarspringboot.Repository.CustomerRepositories;

import com.example.rentacarspringboot.Entities.CustomerEntities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer, Long> {
    void findAllBytc(long tc);
}
