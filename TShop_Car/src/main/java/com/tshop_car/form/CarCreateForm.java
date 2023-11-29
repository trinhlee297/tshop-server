package com.tshop_car.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
public class CarCreateForm {

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 30)
    private String licensePlate;

    @NotNull
    @PastOrPresent
    private LocalDate repairDate;

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String customerName;

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String catalog;

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String carMaker;
}
