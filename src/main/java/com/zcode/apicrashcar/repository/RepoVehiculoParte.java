package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.VehiculosParteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoVehiculoParte extends CrudRepository<VehiculosParteEntity, Integer> {
}
