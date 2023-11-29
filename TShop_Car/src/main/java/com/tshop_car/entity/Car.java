package com.tshop_car.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "car")
public class Car {
    @EmbeddedId // khi có 2 khoá chính phải dùng @EmbeddedId
    private PrimaryKey pk;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "catalog", nullable = false)
    private String catalog;

    @Column(name = "car_maker", nullable = false)
    private String carMaker;

    @OneToMany(mappedBy = "car")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Accessory> accessories;


    @Data
    @EqualsAndHashCode
    @Embeddable
    public static class PrimaryKey {

        @Column(name = "license_plate", nullable = false, unique = true)
        private String licensePlate;

        @Column(name = "repair_date", unique = true, nullable = false)
        private LocalDate repairDate;
    }
}
