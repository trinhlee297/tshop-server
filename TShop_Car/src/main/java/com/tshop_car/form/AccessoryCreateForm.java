package com.tshop_car.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
public class AccessoryCreateForm {


    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String name;

    @NotNull(message = "Can't null, please check it!")
    @PositiveOrZero
    private Long price;

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String statusDamaged;

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String repairStatus;

    @NotBlank(message = "Can't blank, please check it!")
    @Length(max = 255)
    private String licensePlate;

    @NotNull(message = "Can't null, please check it!")
    @PastOrPresent
    private LocalDate repairDate;

    // ben create form ko can co tien to Pk nua
}
