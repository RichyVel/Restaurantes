package com.restaurante.aplicaciones.controllers;


import com.restaurante.aplicaciones.services.CuentasDao;
import com.restaurante.aplicaciones.utileria.Cuentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CuentasController {

    @Autowired
    CuentasDao cuentasDao;


    @RequestMapping(value="/Cuentas", method = RequestMethod.GET)
    public List<Cuentas> getCuentas()
    {
        return cuentasDao.findAllCuentas();
    }

}
