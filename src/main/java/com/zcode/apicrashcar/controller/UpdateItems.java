package com.zcode.apicrashcar.controller;

import com.zcode.apicrashcar.entity.*;
import com.zcode.apicrashcar.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crash-car/update")
public class UpdateItems {
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

    @PutMapping("/user/{id}")
    ResponseEntity<UsuariosEntity> updateItem(@PathVariable("id") String id, @Validated @RequestBody UsuariosEntity item) {
        if (usuarios.existsById(id)) {
            usuarios.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/vehiculo/{id}")
    ResponseEntity<VehiculoEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody VehiculoEntity item) {
        if (vehiculos.existsById(id)) {
            vehiculos.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/vehiculo-seguro/{id}")
    ResponseEntity<VehiculosSeguroEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody VehiculosSeguroEntity item) {
        if (vehiculosSeguro.existsById(id)) {
            vehiculosSeguro.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/vehiculo-parte/{id}")
    ResponseEntity<VehiculosParteEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody VehiculosParteEntity item) {
        if (vehiculosParte.existsById(id)) {
            vehiculosParte.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/conductor/{id}")
    ResponseEntity<ConductorEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody ConductorEntity item) {
        if (conductores.existsById(id)) {
            conductores.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/parte/{id}")
    ResponseEntity<PartesEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody PartesEntity item) {
        if (partes.existsById(id)) {
            partes.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/seguro/{id}")
    ResponseEntity<SeguroEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody SeguroEntity item) {
        if (seguros.existsById(id)) {
            seguros.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/testigo/{id}")
    ResponseEntity<TestigosEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody TestigosEntity item) {
        if (testigos.existsById(id)) {
            testigos.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/asegurado/{id}")
    ResponseEntity<AseguradoEntity> updateItem(@PathVariable("id") Integer id, @Validated @RequestBody AseguradoEntity item) {
        if (asegurados.existsById(id)) {
            asegurados.save(item);
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

