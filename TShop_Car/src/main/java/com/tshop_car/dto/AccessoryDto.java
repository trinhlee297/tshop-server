package com.tshop_car.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AccessoryDto {
    private Long id;

    private String name;

    private Long price;

    private String statusDamaged;

    private String repairStatus;

    @JsonProperty("licensePlate")
    private String carPkLicensePlate;

    @JsonProperty("repairDate")// khi hien thi
    private LocalDate carPkRepairDate;// khi lay du lieu tu class khac
}
