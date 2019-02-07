package com.restaurante.aplicaciones.repository;

import com.restaurante.aplicaciones.utileria.Cuentas;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ICuentasRepository extends JpaRepository<Cuentas,Integer> {
    static void findAllCuentas() {
    }
}

