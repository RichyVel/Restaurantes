package com.restaurante.aplicaciones.controllers;


import com.restaurante.aplicaciones.services.MPlatillosDao;
import com.restaurante.aplicaciones.services.MPostresDao;
import com.restaurante.aplicaciones.utileria.MPostres;
import com.restaurante.aplicaciones.utileria.MPostres;
import com.restaurante.aplicaciones.utileria.MPostres;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class MPostresController {

    @Autowired
    com.restaurante.aplicaciones.services.MPostresDao MPostresDao;

    @GetMapping("/MPostres")
    public List<MPostres> getPostres() {

        return MPostresDao.findAllMPostres();

    }

    @PostMapping("/MPostres")
    public boolean postMPostres(@RequestBody MPostres MPostres) {
        return MPostresDao.posteaMPostres(MPostres);
    }


    @PutMapping("MPostres/{idPostre}")
    public boolean putMPostres(
            @PathVariable("idPostre") int idPostre,
            @RequestBody MPostres MPostres) {
        return MPostresDao.actualizaUnoPorId(idPostre, MPostres);
    }
    /*

    @GetMapping("/MPostres/{id_Postres}")
    public MPostres getMPlatillosPorId(@PathVariable("id_Postres")int id_Postres){
        return MPostresDao.findUno(id_Postres);
    }

    @PutMapping("MPostres/{idPostre}")
    public boolean putMPostres(
            @PathVariable("idPostre")int idPostre,
            @RequestBody MPostres MPostres){
        return MPostresDao.actualizaUnoPorId(idPostre, MPostres);
    }
    */
}
