package com.restaurante.aplicaciones.services;

import com.restaurante.aplicaciones.repository.IMPlatillosRepository;
import com.restaurante.aplicaciones.utileria.MPlatillos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MPlatillosDao {


    @Autowired
    IMPlatillosRepository IMPlatillosRepository;

    public List<MPlatillos> findAllMPlatillos()
    {
        return IMPlatillosRepository.findAll();
    }

    public boolean posteaMPlatillos(MPlatillos MPlatillos) {

        if(IMPlatillosRepository.save(MPlatillos)!= null){
            return true;
        }else{
            return false;
        }
    }

    public MPlatillos findUno(int id_Platillos) {
        return IMPlatillosRepository.findById(id_Platillos).get();
    }

    public boolean actualizaUnoPorId(int id_Platillos, MPlatillos MPlatillos) {
                MPlatillos.setIdPlatillos(id_Platillos);
        return IMPlatillosRepository.save(MPlatillos)!=null ? true : false;
    }
}
