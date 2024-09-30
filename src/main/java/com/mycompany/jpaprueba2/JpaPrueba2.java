package com.mycompany.jpaprueba2;

import com.mycompany.jpaprueba2.logica.Alumno;
import com.mycompany.jpaprueba2.logica.Carrera;
import com.mycompany.jpaprueba2.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;



public class JpaPrueba2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        
        Carrera carre = new Carrera(1, "Tecnicatura en programación");
        control.crearCarrera(carre);
        
        
        Alumno alu = new Alumno(24, "Ibu", "The York", new Date(), carre);
        control.crearAlumno(alu);
        
        
        System.out.println("----------------------------");
        System.out.println("---------------DATOS ALUMNO------------------");
        
        Alumno alu2 = control.traerAlumno(24);
        System.out.println("Alumno: " + alu2.getApellido());
        System.out.println("Alumno: " + alu2.getNombre());

        System.out.println("Cursa la carrera de: " + alu2.getCarrera().getNombre());
        
        
        
        
    }
}
