package com.restaurante.aplicaciones.services;
import com.restaurante.aplicaciones.utileria.MBebidas;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MBebidasDao {


    @Autowired
    com.restaurante.aplicaciones.repository.IMBebidasRepository IMBebidasRepository;

    public List<MBebidas> findAllMBebidas()
    {
        return IMBebidasRepository.findAll();
    }

    public boolean posteaMBebidas(MBebidas MBebidas) {

        if(IMBebidasRepository.save(MBebidas)!= null){
            return true;
        }else{
            return false;
        }
    }

    public MBebidas findUno(int idBebida) {
        return IMBebidasRepository.findById(idBebida).get();
    }

    public boolean actualizaUnoPorId(int idBebida, MBebidas MBebidas) {
        MBebidas.setIdBebida(idBebida);
        return IMBebidasRepository.save(MBebidas)!=null ? true : false;
    }
}

