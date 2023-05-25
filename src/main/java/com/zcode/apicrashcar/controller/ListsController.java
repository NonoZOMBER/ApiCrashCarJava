package com.zcode.apicrashcar.controller;


import com.zcode.apicrashcar.entity.PartesEntity;
import com.zcode.apicrashcar.entity.SeguroEntity;
import com.zcode.apicrashcar.entity.VehiculoEntity;
import com.zcode.apicrashcar.repository.RepoParte;
import com.zcode.apicrashcar.repository.RepoSeguro;
import com.zcode.apicrashcar.repository.RepoVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/crash-car/list")
public class ListsController {
    @Autowired
    RepoParte partes;
    @Autowired
    RepoSeguro seguros;
    @Autowired
    RepoVehiculo vehiculos;

    @GetMapping("/vehiculo/{id}")
    List<VehiculoEntity> getVehicles(@PathVariable("id") String id) {
        Iterable<VehiculoEntity> listVehiculos = vehiculos.findAll();
        ArrayList<VehiculoEntity> listVehiculoById = new ArrayList<>();

        for (VehiculoEntity vehiculo : listVehiculos) {
            if (vehiculo.getIdUsuario().equalsIgnoreCase(id) && vehiculo.getActivo()) {
                listVehiculoById.add(vehiculo);
            }
        }
        return listVehiculoById;
    }

    @GetMapping("/partes/{id}")
    List<PartesEntity> getParts(@PathVariable("id") String id) {
        Iterable<PartesEntity> listPartes = partes.findAll();
        ArrayList<PartesEntity> listPartesById = new ArrayList<>();

        for (PartesEntity parte : listPartes) {
            if (parte.getIdUsuario().equalsIgnoreCase(id) && parte.getActivo()) {
                listPartesById.add(parte);
            }
        }
        return listPartesById;
    }


    @GetMapping("/seguros/{id}")
    List<SeguroEntity> getSecures(@PathVariable("id") String id) {
        Iterable<SeguroEntity> listSeguro = seguros.findAll();
        ArrayList<SeguroEntity> listSeguroById = new ArrayList<>();

        for (SeguroEntity seguro : listSeguro) {
            if (seguro.getIdUsuario().equalsIgnoreCase(id) && seguro.getActivo()) {
                listSeguroById.add(seguro);
            }
        }
        return listSeguroById;
    }
}
