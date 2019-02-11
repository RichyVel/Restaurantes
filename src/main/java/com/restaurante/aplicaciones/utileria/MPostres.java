package com.restaurante.aplicaciones.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity

public class MPostres {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idPostre;

        @Column
        private String NombrePostre;

        @Column
        private String ODescripPostres;



}

