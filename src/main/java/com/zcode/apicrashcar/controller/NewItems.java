package com.zcode.apicrashcar.controller;

import com.zcode.apicrashcar.entity.*;
import com.zcode.apicrashcar.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crash-car/new")
public class NewItems {
    @Autowired
    RepoUsuarios usuarios;
    @Autowired
    RepoConductor conductores;
    @Autowired
    RepoParte partes;
    @Autowired
    RepoSeguro seguros;
    @Autowired
    RepoVehiculo vehiculos;
    @Autowired
    RepoVehiculoParte vehiculosParte;
    @Autowired
    RepoVehiculoSeguro vehiculosSeguro;
    @Autowired
    RepoAsegurado asegurados;
    @Autowired
    RepoTestigo testigos;

    @PostMapping("/vehiculo")
    VehiculoEntity newItem(@Validated @RequestBody VehiculoEntity item) {
        return vehiculos.save(item);
    }

    @PostMapping("/vehiculo-parte")
    VehiculosParteEntity newItem(@Validated @RequestBody VehiculosParteEntity item) {
        return vehiculosParte.save(item);
    }


    @PostMapping("/vehiculo-seguro")
    VehiculosSeguroEntity newItem(@Validated @RequestBody VehiculosSeguroEntity item) {
        return vehiculosSeguro.save(item);
    }

    @PostMapping("/conductor")
    ConductorEntity newItem(@Validated @RequestBody ConductorEntity item) {
        return conductores.save(item);
    }

    @PostMapping("/parte")
    PartesEntity newItem(@Validated @RequestBody PartesEntity item) {
        return partes.save(item);
    }

    @PostMapping("/seguro")
    SeguroEntity newItem(@Validated @RequestBody SeguroEntity item) {
        return seguros.save(item);
    }

    @PostMapping("/asegurado")
    AseguradoEntity newItem(@Validated @RequestBody AseguradoEntity item) {
        return asegurados.save(item);
    }

    @PostMapping("/testigo")
    TestigosEntity newItem(@Validated @RequestBody TestigosEntity item) {
        return testigos.save(item);
    }
}