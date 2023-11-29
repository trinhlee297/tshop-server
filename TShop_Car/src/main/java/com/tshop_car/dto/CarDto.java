package com.tshop_car.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CarDto {

    @JsonProperty("licensePlate")
    private String pkLicensePlate;

    @JsonProperty("repairDate")
    private LocalDate pkRepairDate;

    private String customerName;

    private String catalog;

    private String carMaker;
}
