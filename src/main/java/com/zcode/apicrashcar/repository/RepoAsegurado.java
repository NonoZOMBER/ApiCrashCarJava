package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.AseguradoEntity;
import com.zcode.apicrashcar.entity.TestigosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAsegurado extends CrudRepository<AseguradoEntity, Integer> {
}
