package com.restaurante.aplicaciones.utileria;


import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity
public class MPlatillos {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlatillos;

    @Column
    private String NombrePlatillo;

    @Column
    private String Descripcion;
}
