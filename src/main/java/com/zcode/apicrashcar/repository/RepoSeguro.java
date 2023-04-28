package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.SeguroEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoSeguro extends CrudRepository<SeguroEntity, Integer> {

}
