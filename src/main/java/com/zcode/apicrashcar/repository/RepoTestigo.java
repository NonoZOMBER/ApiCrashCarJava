package com.zcode.apicrashcar.repository;

import com.zcode.apicrashcar.entity.TestigosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoTestigo extends CrudRepository<TestigosEntity, Integer> {
}
