package com.santana.mobilab.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santana.mobilab.server.model.ActualRoute;

@Repository
public interface ActualRouteRepository extends CrudRepository<ActualRoute, Long> {
       
}
