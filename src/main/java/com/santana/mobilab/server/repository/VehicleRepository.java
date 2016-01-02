package com.santana.mobilab.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santana.mobilab.server.model.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
       
}
