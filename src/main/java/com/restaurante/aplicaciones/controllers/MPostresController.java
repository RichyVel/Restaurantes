package com.restaurante.aplicaciones.controllers;

import com.restaurante.aplicaciones.services.MPostresDao;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import com.restaurante.aplicaciones.utileria.MPostres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MPostresController {



    @Autowired
    MPostresDao MPostresDao;

    @GetMapping("/MPostres")
    public List<MPostres> getPostres(){

        return MPostresDao.findAllMPostres();

    }

    @PostMapping("/MPostres")
    public boolean postPlatillos(@RequestBody MPostres MPostres){
        return MPostresDao.posteaMPostres(MPostres);

    }


    /*

    @GetMapping("/MPostres/{id_Postres}")
    public MPostres getMPlatillosPorId(@PathVariable("id_Postres")int id_Postres){
        return MPostresDao.findUno(id_Postres);
    }

    @PutMapping("MPostres/{id_MPostres}")
    public boolean putMPostres(
            @PathVariable("id_Postres")int id_Postres,
            @RequestBody MPostres MPostres){
        return MPostresDao.actualizaUnoPorId(id_Postres, MPostres);
    }
    */
}
