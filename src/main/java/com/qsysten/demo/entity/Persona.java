package com.qsysten.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PERSONA")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dni;
    private String paterno;
    private String materno;


}
