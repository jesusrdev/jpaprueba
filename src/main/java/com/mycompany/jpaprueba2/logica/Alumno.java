package com.mycompany.jpaprueba2.logica;

import java.util.Date;

public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNac;

    public Alumno(int id, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
    
    
}
