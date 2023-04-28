package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.PartesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoParte extends CrudRepository<PartesEntity, Integer> {
}
