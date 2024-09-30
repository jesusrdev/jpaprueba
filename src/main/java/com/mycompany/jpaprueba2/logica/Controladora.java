
package com.mycompany.jpaprueba2.logica;

import com.mycompany.jpaprueba2.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alumno) {
        controlPersis.editarAlumno(alumno);
    }    
    
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos() {
        return controlPersis.traerListaAlumnos();
    }
}
