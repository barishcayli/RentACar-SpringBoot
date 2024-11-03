package com.example.rentacarspringboot.Repository.CarRepositories;


import com.example.rentacarspringboot.Entities.CarEntities.SuvCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SuvRepository extends JpaRepository<SuvCar,Long> {

}
