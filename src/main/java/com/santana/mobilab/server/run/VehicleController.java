package com.santana.mobilab.server.run;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

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
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Iterable<Vehicle> vs = vehicleRepository.findAll();
        for (Vehicle v : vs) {
        	vehicles.add(v);
        }
    	
    	return vehicles;
    }
    
    @RequestMapping("/getById")
    public Vehicle getVehicleById(@RequestParam(value="id") long id) {
    	Vehicle vehicle = vehicleRepository.findOne(id);    	
    	return vehicle;
    }
    
}