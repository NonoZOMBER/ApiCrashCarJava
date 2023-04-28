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

    @GetMapping("/vehiculo/{dni}")
    List<VehiculoEntity> getVehicles(@PathVariable("dni") String dni) {
        Iterable<VehiculoEntity> listVehiculos = vehiculos.findAll();
        ArrayList<VehiculoEntity> listVehiculoById = new ArrayList<>();

        for (VehiculoEntity vehiculo : listVehiculos) {
            if (vehiculo.getDniUsuario().equalsIgnoreCase(dni) && vehiculo.isActivo()) {
                listVehiculoById.add(vehiculo);
            }
        }
        return listVehiculoById;
    }

    @GetMapping("/partes/{dni}")
    List<PartesEntity> getParts(@PathVariable("dni") String dni) {
        Iterable<PartesEntity> listPartes = partes.findAll();
        ArrayList<PartesEntity> listPartesById = new ArrayList<>();

        for (PartesEntity parte : listPartes) {
            if (parte.getDniUsuario().equalsIgnoreCase(dni) && parte.isActivo()) {
                listPartesById.add(parte);
            }
        }
        return listPartesById;
    }


    @GetMapping("/seguros/{dni}")
    List<SeguroEntity> getSecures(@PathVariable("dni") String dni) {
        Iterable<SeguroEntity> listSeguro = seguros.findAll();
        ArrayList<SeguroEntity> listSeguroById = new ArrayList<>();

        for (SeguroEntity seguro : listSeguro) {
            if (seguro.getDniUsuario().equalsIgnoreCase(dni) && seguro.isActivo()) {
                listSeguroById.add(seguro);
            }
        }
        return listSeguroById;
    }
}
