package com.jlingel.beararms.controller;

import com.jlingel.beararms.models.Firearm;
import com.jlingel.beararms.persistance.service.FirearmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/firearms")
    class FirearmController {

    @Autowired
    private FirearmService service;

    @GetMapping
    public List findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Firearm findById(@PathVariable("id") Long id) {
        return (Firearm) RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Firearm create(@RequestBody Firearm resource) {
        return service.create(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Firearm update(@PathVariable( "id" ) Long id, @RequestBody Firearm resource) {
        return service.update(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
