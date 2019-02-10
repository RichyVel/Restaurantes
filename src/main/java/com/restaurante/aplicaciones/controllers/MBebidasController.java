package com.restaurante.aplicaciones.controllers;

import com.restaurante.aplicaciones.services.MBebidasDao;
import com.restaurante.aplicaciones.utileria.MBebidas;
import com.restaurante.aplicaciones.utileria.MBebidas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;





@RestController
public class MBebidasController {

    @Autowired
    MBebidasDao MBebidasDao;

    @GetMapping("/MBebidas")
    public List<MBebidas> getBebidas()
    {

        return MBebidasDao.findAllMBebidas();

    }

    @PostMapping("/MBebidas")
    public boolean postMBebidas(@RequestBody MBebidas MBebidas)
    {
        return MBebidasDao.posteaMBebidas(MBebidas);
    }

    @PutMapping("MBebidas/{idBebida}")
    public boolean putMBebidas(
            @PathVariable("idBebida") int idBebida,
            @RequestBody MBebidas MBebidas) {
        return MBebidasDao.actualizaUnoPorId(idBebida, MBebidas);
    }
}
