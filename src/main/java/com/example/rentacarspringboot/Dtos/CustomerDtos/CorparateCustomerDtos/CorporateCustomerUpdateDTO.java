package com.example.rentacarspringboot.Dtos.CustomerDtos.CorparateCustomerDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CorporateCustomerUpdateDTO {
    private Long id;
    private String companyName;
    private int taxNo;

}
