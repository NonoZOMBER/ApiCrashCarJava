package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.VehiculoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoVehiculo extends CrudRepository<VehiculoEntity, Integer> {
}
