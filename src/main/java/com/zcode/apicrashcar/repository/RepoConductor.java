package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.ConductorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoConductor extends CrudRepository<ConductorEntity, Integer> {
}
