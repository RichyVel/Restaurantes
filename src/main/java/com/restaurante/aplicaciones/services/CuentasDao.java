package com.restaurante.aplicaciones.services;

import com.restaurante.aplicaciones.repository.ICuentasRepository;
import com.restaurante.aplicaciones.utileria.Cuentas;
import com.restaurante.aplicaciones.utileria.MBebidas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentasDao {

    @Autowired
    ICuentasRepository ICuentasRepository;

    public List<Cuentas> findAllCuentas() {
        return ICuentasRepository.findAll();
    }


    public boolean posteaCuentas(Cuentas Cuentas) {

        if(ICuentasRepository.save(Cuentas)!= null){
            return true;
        }else{
            return false;
        }
    }

    public Cuentas findUno(int idUsuario) {
        return ICuentasRepository.findById(idUsuario).get();
    }

    public boolean actualizaUnoPorId(int idUsuario, Cuentas Cuentas) {
        Cuentas.setIdUsuario(idUsuario);
        return ICuentasRepository.save(Cuentas)!=null ? true : false;
    }
}






