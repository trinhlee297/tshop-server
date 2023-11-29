package com.tshop_car.repository;

import com.tshop_car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Car.PrimaryKey> {
}
