package com.restaurante.aplicaciones.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity
public class MBebidas {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idBebida;

        @Column
        private String NombreBebida;

        @Column
        private String ODescripBebida;


}

