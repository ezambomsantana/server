package com.santana.mobilab.server.controllers;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santana.mobilab.server.model.Vehicle;
import com.santana.mobilab.server.repository.VehicleRepository;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Inject
    VehicleRepository vehicleRepository;
    
    @RequestMapping(value="/list", headers="Accept=application/json")
    public List<Vehicle> getAllVehicles() {    	
    	return IteratorUtils.toList(vehicleRepository.findAll().iterator());
    }
    
    @RequestMapping("/getById")
    public Vehicle getVehicleById(@RequestParam(value="id") long id) {
    	Vehicle vehicle = vehicleRepository.findOne(id);    	
    	return vehicle;
    }
    
}