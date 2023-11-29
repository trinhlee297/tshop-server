package com.tshop_car.service;


import com.tshop_car.dto.AccessoryDto;
import com.tshop_car.form.AccessoryCreateForm;
import com.tshop_car.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto findById(Long id);
    AccessoryDto create(AccessoryCreateForm form);
    AccessoryDto update(Long id, AccessoryUpdateForm form);
    void deleteById(Long id);
}
