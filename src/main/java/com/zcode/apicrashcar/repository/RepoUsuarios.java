package com.zcode.apicrashcar.repository;


import com.zcode.apicrashcar.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface RepoUsuarios extends CrudRepository<UsuariosEntity, String> {
}

