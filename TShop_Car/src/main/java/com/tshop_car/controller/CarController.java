package com.tshop_car.controller;

import com.tshop_car.dto.CarDto;
import com.tshop_car.entity.Car;
import com.tshop_car.form.CarCreateForm;
import com.tshop_car.form.CarUpdateForm;
import com.tshop_car.service.CarService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/car")
@AllArgsConstructor
@Validated
@CrossOrigin("*")
public class CarController {

    private final CarService carService;

    @GetMapping("/findAll")
    public Page<CarDto> findAll(Pageable pageable) {
        return carService.findAll(pageable);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CarDto create(@Valid @RequestBody CarCreateForm form) {
        return carService.create(form);
    }


    @PutMapping("/update")
    public CarDto update(@Valid @RequestBody CarUpdateForm form) {
        return carService.update(form);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@RequestBody Car.PrimaryKey pk){
        carService.deleteById(pk);
    }


}
