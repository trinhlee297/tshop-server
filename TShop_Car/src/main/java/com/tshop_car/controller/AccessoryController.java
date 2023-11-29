package com.tshop_car.controller;

import com.tshop_car.dto.AccessoryDto;
import com.tshop_car.form.AccessoryCreateForm;
import com.tshop_car.form.AccessoryUpdateForm;
import com.tshop_car.service.AccessoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1/accessories")
public class AccessoryController {
    private final AccessoryService accessoryService;

    @GetMapping("/findAll")
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public AccessoryDto findById(@PathVariable("id") Long id) {
        return accessoryService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public AccessoryDto create(@RequestBody @Valid AccessoryCreateForm form) {
        return accessoryService.create(form);
    }

    @PutMapping("/update/{id}")
    public AccessoryDto update(@PathVariable("id") Long id,@RequestBody @Valid AccessoryUpdateForm form){
        return accessoryService.update(id, form);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Long id) {
        accessoryService.deleteById(id);
    }
}
