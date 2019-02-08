package com.restaurante.aplicaciones.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Blob;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity

public class Promociones {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idPromocion;

        @Column
        private String NombrePromocion;

        @Column
        private Blob xFoto;

    }


