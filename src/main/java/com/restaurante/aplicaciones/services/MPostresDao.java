package com.restaurante.aplicaciones.services;

import com.restaurante.aplicaciones.repository.IMPostresRepository;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import com.restaurante.aplicaciones.utileria.MPostres;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MPostresDao {


    @Autowired
    com.restaurante.aplicaciones.repository.IMPostresRepository IMPostresRepository;

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

    public MPostres findUno(int id_Postres) {
        return IMPostresRepository.findById(id_Postres).get();
    }

    public boolean actualizaUnoPorId(int id_Postres, MPostres MPostres) {
        MPostres.setIdPostres(id_Postres);
        return IMPostresRepository.save(MPostres)!=null ? true : false;
    }
}



