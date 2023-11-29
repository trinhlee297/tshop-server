package com.tshop_car.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AccessoryUpdateForm {
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
}
