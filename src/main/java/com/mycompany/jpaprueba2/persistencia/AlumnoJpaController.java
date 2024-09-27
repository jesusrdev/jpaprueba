
package com.mycompany.jpaprueba2.persistencia;

import java.io.Serializable;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mycompany.jpaprueba2.logica.Alumno;

public class AlumnoJpaController implements Serializable {

    private EntityManagerFactory emf = null;
    
    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public AlumnoJpaController() {
        emf = Persistence.createEntityManagerFactory("pruebaJPAPU");
    }

    public EntityManagerFactory getEntityManager() {
        return emf;
    }
    
    
}
