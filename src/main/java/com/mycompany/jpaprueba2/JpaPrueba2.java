package com.mycompany.jpaprueba2;

import com.mycompany.jpaprueba2.logica.Alumno;
import com.mycompany.jpaprueba2.logica.Controladora;
import java.util.Date;



public class JpaPrueba2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        Alumno alu = new Alumno(30, "Luisina", "JPA", new Date());
        control.crearAlumno(alu);
        
//        control.eliminarAlumno(30);

        alu.setApellido("de Paula");
        control.editarAlumno(alu);
    }
}
