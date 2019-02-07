package com.restaurante.aplicaciones.repository;


import com.restaurante.aplicaciones.utileria.MPostres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMPostresRepository extends JpaRepository<MPostres,Integer> {


}
