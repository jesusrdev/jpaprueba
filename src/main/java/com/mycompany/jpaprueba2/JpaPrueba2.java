package com.mycompany.jpaprueba2;

import com.mycompany.jpaprueba2.logica.Alumno;
import com.mycompany.jpaprueba2.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;



public class JpaPrueba2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        Alumno alu2 = new Alumno(20, "Ibra", "The Yorkie", new Date());
        control.crearAlumno(alu2);
        
//        control.eliminarAlumno(30);

//        alu.setApellido("de Paula");
//        control.editarAlumno(alu);

        Alumno alu = control.traerAlumno(15);
        System.out.println("---------------------------BUSQUEDA INDIVIDUAL----------------------------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("----------------------------BUSQUEDA DE TODOS----------------------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        
        for (Alumno alumno : listaAlumnos) {
            System.out.println("El alumno es: " + alumno.toString());
        }
        
        System.out.println("-----------------------------------------------------------------------");
    }
}
