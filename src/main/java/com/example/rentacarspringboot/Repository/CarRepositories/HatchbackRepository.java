package com.example.rentacarspringboot.Repository.CarRepositories;

import com.example.rentacarspringboot.Entities.CarEntities.HatchbackCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HatchbackRepository extends JpaRepository<HatchbackCar, Long> {
}
