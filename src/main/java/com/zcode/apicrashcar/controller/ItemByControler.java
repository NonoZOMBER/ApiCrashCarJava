package com.zcode.apicrashcar.controller;

import com.zcode.apicrashcar.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zcode.apicrashcar.repository.*;

import java.util.Optional;

@RestController
@RequestMapping("/crash-car/id")
public class ItemByControler {
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

    @GetMapping("/user/{dni}")
    ResponseEntity<UsuariosEntity> getUser(@PathVariable(value = "dni") String dni) {
        Optional<UsuariosEntity> user = usuarios.findById(dni);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/seguro/{id}")
    ResponseEntity<SeguroEntity> getSecure(@PathVariable("id") Integer id) {
        Optional<SeguroEntity> secure = seguros.findById(id);
        return secure.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/parte/{id}")
    ResponseEntity<PartesEntity> getPart(@PathVariable("id") Integer id) {
        Optional<PartesEntity> part = partes.findById(id);
        return part.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/conductor/{id}")
    ResponseEntity<ConductorEntity> getDriver(@PathVariable("id") Integer id) {
        Optional<ConductorEntity> driver = conductores.findById(id);
        return driver.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/vehiculo/{id}")
    ResponseEntity<VehiculoEntity> getVehicle(@PathVariable("id") Integer id) {
        Optional<VehiculoEntity> vehiculo = vehiculos.findById(id);
        return vehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/vehiculo-seguro/{id}")
    ResponseEntity<VehiculosSeguroEntity> getSecureVehicle(@PathVariable("id") Integer id) {
        Optional<VehiculosSeguroEntity> vehiculo = vehiculosSeguro.findById(id);
        return vehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/vehiculo-parte/{id}")
    ResponseEntity<VehiculosParteEntity> getVehiclePart(@PathVariable("id") Integer id) {
        Optional<VehiculosParteEntity> vehiculo = vehiculosParte.findById(id);
        return vehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping("/testigo/{id}")
    ResponseEntity<TestigosEntity> getTestigo(@PathVariable("id") Integer id) {
        Optional<TestigosEntity> testigo = testigos.findById(id);
        return testigo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/asegurado/{id}")
    ResponseEntity<AseguradoEntity> getAsegurado(@PathVariable("id") Integer id) {
        Optional<AseguradoEntity> asegurado = asegurados.findById(id);
        return asegurado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
