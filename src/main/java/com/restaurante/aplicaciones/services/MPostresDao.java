package com.restaurante.aplicaciones.services;

import com.restaurante.aplicaciones.repository.IMPostresRepository;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import com.restaurante.aplicaciones.utileria.MPostres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
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

    public MPostres findUno(int idPostres) {
        return IMPostresRepository.findById(idPostres).get();
    }

    public boolean actualizaUnoPorId(int idPostres, MPostres MPostres) {
        MPostres.setIdPostre(idPostres);
        return IMPostresRepository.save(MPostres)!=null ? true : false;
    }
}



