package com.tshop_car.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "accessory")
public class Accessory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "status_damaged", nullable = false)
    private String statusDamaged;

    @Column(name = "repair_status", nullable = false)
    private String repairStatus;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "license_plate", referencedColumnName = "license_plate"),
            @JoinColumn(name = "repair_date", referencedColumnName = "repair_date")
    })
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Car car;
}
