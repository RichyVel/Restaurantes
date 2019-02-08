package com.restaurante.aplicaciones.services;

import com.restaurante.aplicaciones.repository.IMPostresRepository;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import com.restaurante.aplicaciones.utileria.MPostres;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MPostresDao {


    @Autowired
    IMPostresRepository IMPostresRepository;

    public List<MPostres> findAllMPostres()
    {
        return IMPostresRepository.findAll();
    }

    public boolean posteaMPostres(MPostres MPostres) {

        if(IMPostresRepository.save(MPostres)!= null){
            return true;
        }else{
            return false;
        }
    }

    public MPostres findUno(int idPostre) {
        return IMPostresRepository.findById(idPostre).get();
    }

    public boolean actualizaUnoPorId(int idPostre, MPostres MPostres) {
        MPostres.setIdPostre(idPostre);
        return IMPostresRepository.save(MPostres)!=null ? true : false;
    }
}



