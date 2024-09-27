package com.mycompany.jpaprueba2.persistencia;

import java.io.Serializable;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mycompany.jpaprueba2.logica.Alumno;
import com.mycompany.jpaprueba2.persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

public class AlumnoJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public AlumnoJpaController() {
        emf = Persistence.createEntityManagerFactory("pruebaJPAPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Alumno alumno) {
        EntityManager em = null;

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /*
    public void edit(Alumno alumno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            alumno = em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alumno.getId();
                if (findAlumno.getId(id) == null) {
                    throw new NonexistentEntityException("The alumno with id " + id + " no longer exist.");
                }
            }

            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    */

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno alumno;
            try {
                alumno = em.getReference(Alumno.class, id);
                alumno.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.", enfe);
            }
            em.remove(alumno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
