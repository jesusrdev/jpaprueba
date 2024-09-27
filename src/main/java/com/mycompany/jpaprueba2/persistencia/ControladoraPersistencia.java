package com.mycompany.jpaprueba2.persistencia;

import com.mycompany.jpaprueba2.logica.Alumno;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }
    
}
