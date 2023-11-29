package com.tshop_car.service;

import com.tshop_car.dto.CarDto;
import com.tshop_car.entity.Car;
import com.tshop_car.form.CarCreateForm;
import com.tshop_car.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);


}
