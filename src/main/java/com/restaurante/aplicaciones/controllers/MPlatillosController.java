package com.restaurante.aplicaciones.controllers;


import com.restaurante.aplicaciones.services.MPlatillosDao;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MPlatillosController {


    @Autowired
    MPlatillosDao MPlatillosDao;

    @GetMapping("/MPlatillos")
    public List<MPlatillos> getPlatillos(){

        return MPlatillosDao.findAllMPlatillos();

    }

    @PostMapping("/MPlatillos")
    public boolean postMPlatillos(@RequestBody MPlatillos MPlatillos){
        return MPlatillosDao.posteaMPlatillos(MPlatillos);
    }

    /*@GetMapping("/MPlatillos/{id_Platillos}")
    public MPlatillos getMPlatillosPorId(@PathVariable("id_Platillos")int id_Platillos){
        return MPlatillosDao.findUno(id_Platillos);
    }

    @PutMapping("MPlatillos/{id_Platillos}")
    public boolean putMPlatillos(
            @PathVariable("id_Platillos")int id_Platillos,
            @RequestBody MPlatillos MPlatillos){
        return MPlatillosDao.actualizaUnoPorId(id_Platillos, MPlatillos);
    }
*/


}
