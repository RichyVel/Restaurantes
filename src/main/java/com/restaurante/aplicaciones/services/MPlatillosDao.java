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

    public boolean posteaMPlatillos(MPlatillos MPlatillos)
    {

        if(IMPlatillosRepository.save(MPlatillos)!= null){
            return true;
        }else{
            return false;
        }
    }

    public MPlatillos findUno(int idPlatillo) {
        return IMPlatillosRepository.findById(idPlatillo).get();
    }

    public boolean actualizaUnoPorId(int idPlatillo, MPlatillos MPlatillos) {
                MPlatillos.setIdPlatillo(idPlatillo);
        return IMPlatillosRepository.save(MPlatillos)!=null ? true : false;
    }
}
