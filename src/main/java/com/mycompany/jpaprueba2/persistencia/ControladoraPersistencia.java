package com.mycompany.jpaprueba2.persistencia;

import com.mycompany.jpaprueba2.logica.Alumno;
import com.mycompany.jpaprueba2.logica.Carrera;
import com.mycompany.jpaprueba2.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    CarreraJpaController carreJpa = new CarreraJpaController();


    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }
    
    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            aluJpa.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        
        return listaAlumnos;
    }
    
    public void crearCarrera(Carrera carrera) {
        carreJpa.create(carrera);
    }
    
    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarCarrera(Carrera carrera) {
        try {
            carreJpa.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }
    
    public ArrayList<Carrera> traerListaCarrera() {
        List<Carrera> listita = carreJpa.findCarreraEntities();
        
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>(listita);
        
        return listaCarreras;
    }
    
}
