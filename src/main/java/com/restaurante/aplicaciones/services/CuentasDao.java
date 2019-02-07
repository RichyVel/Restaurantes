package com.restaurante.aplicaciones.services;

import com.restaurante.aplicaciones.repository.ICuentasRepository;
import com.restaurante.aplicaciones.utileria.Cuentas;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentasDao {

    @Autowired
    ICuentasRepository ICuentasRepository;

    public List<Cuentas> findAllCuentas()
    {
        return ICuentasRepository.findAll();
    }


    }


