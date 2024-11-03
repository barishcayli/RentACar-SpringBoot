package com.example.rentacarspringboot.Services.Concretes.CarConcretes;

import com.example.rentacarspringboot.Dtos.CarDtos.SuvAddDTO;
import com.example.rentacarspringboot.Dtos.CarDtos.SuvUpdateDTO;
import com.example.rentacarspringboot.Entities.CarEntities.SuvCar;
import com.example.rentacarspringboot.Entities.CustomerEntities.CorporateCustomer;
import com.example.rentacarspringboot.Entities.CustomerEntities.IndividualCustomer;
import com.example.rentacarspringboot.Repository.CarRepositories.SuvRepository;
import com.example.rentacarspringboot.Repository.CustomerRepositories.CorporateCustomerRepository;
import com.example.rentacarspringboot.Repository.CustomerRepositories.IndividualCustomerRepository;
import com.example.rentacarspringboot.Services.Abstracts.CarService.SuvService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SuvConcretes implements SuvService {
    private final SuvRepository suvRepository;
    private final CorporateCustomerRepository corporateCustomerRepository;
    private final IndividualCustomerRepository individualCustomerRepository;
    private ModelMapper modelMapper;
    public SuvConcretes(SuvRepository suvRepository, CorporateCustomerRepository corporateCustomerRepository, IndividualCustomerRepository individualCustomerRepository) {
        this.suvRepository = suvRepository;
        this.corporateCustomerRepository = corporateCustomerRepository;
        this.individualCustomerRepository=individualCustomerRepository;

    }
      @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }





    @Override
public void addSuv(SuvAddDTO dto) {
    try {
        SuvCar suv = modelMapper.map(dto, SuvCar.class);
        suvRepository.save(suv);
    } catch (Exception e) {
        System.err.println("Hata: " + e.getMessage());
        e.printStackTrace();
        throw new RuntimeException("SUV eklenirken bir hata oluştu", e);
    }
}

    @Override
  public void updateSuv(SuvUpdateDTO dto) {
    Optional<SuvCar> optionalSuv = suvRepository.findById((long) dto.getId());
    if (optionalSuv.isPresent()) {
        SuvCar existingSuv = optionalSuv.get();
        modelMapper.map(dto, existingSuv);
        suvRepository.save(existingSuv);
    } else {
        throw new EntityNotFoundException("Bu id ile araç bulunamadı: " + dto.getId());
    }
}
@Override
 public SuvCar GetByIdSuvCar(Long id) {
        return suvRepository.findById(id).orElse(null);
    }
        public List<SuvCar> getAllSuvCars() {
        return suvRepository.findAll();
    }
    @Override
    public void rentaSuv(long id, int rentalDays, long customerId) {
         Optional<SuvCar> optionalSuv = suvRepository.findById(id);
         Optional<CorporateCustomer> corporateCustomer = corporateCustomerRepository.findById(id);
         Optional<IndividualCustomer> individualCustomer = individualCustomerRepository.findById(id);

         if(corporateCustomer.isPresent() && individualCustomer.isEmpty()) {
             if (optionalSuv.isPresent()) {
         SuvCar existingSuv = optionalSuv.get();
            if (existingSuv.getRentaldays()==0){
                existingSuv.setRentaldays(rentalDays);
                suvRepository.save(existingSuv);

             }
            else{
                 throw new EntityNotFoundException("Bu araç"+ existingSuv.getRentaldays() +" gün kirada: ");
            }
         }


    } else if (corporateCustomer.isEmpty()&& individualCustomer.isPresent()) {
              throw new EntityNotFoundException("Bu araç bireysel müşteriye kiralanamaz ");
              }
         else{
              throw new EntityNotFoundException("Müşteri bulunamadı");
         }


    }
}
