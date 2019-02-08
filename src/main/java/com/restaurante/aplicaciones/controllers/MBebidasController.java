package com.restaurante.aplicaciones.controllers;
import com.restaurante.aplicaciones.services.MBebidasDao;
import com.restaurante.aplicaciones.utileria.MBebidas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class MBebidasController {

    @Autowired
    MBebidasDao MBebidasDao;

    @GetMapping("/MBebidas")
    public List<MBebidas> getBebidas()
    {

        return MBebidasDao.findAllMBebidas();

    }

    @PostMapping("/MBebidas")
    public boolean postMPlatillos(@RequestBody MBebidas MBebidas)
    {
        return MBebidasDao.posteaMBebidas(MBebidas);
    }
}
