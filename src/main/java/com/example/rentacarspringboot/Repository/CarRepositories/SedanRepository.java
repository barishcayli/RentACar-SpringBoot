package com.example.rentacarspringboot.Repository.CarRepositories;

import com.example.rentacarspringboot.Entities.CarEntities.SedanCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedanRepository extends JpaRepository<SedanCar, Long> {
}
