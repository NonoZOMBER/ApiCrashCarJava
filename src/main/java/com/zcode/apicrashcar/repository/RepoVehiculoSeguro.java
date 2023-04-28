package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.VehiculosSeguroEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoVehiculoSeguro extends CrudRepository<VehiculosSeguroEntity, Integer> {
}
