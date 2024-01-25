package dao;

import entietis.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDao(){
        emf = Persistence.createEntityManagerFactory("gestione_eventi_new");
        em = emf.createEntityManager();
    }

    public Persona getById(int id){
        return em.find(Persona.class, id);
    }

    public void savePerson(Persona ev){
        try{
            EntityTransaction et = em.getTransaction();
            et.begin();
            em.persist(ev);
            et.commit();
            em.refresh(ev);
            System.out.println("evento salvato sul databese correttamente");

        }catch (IllegalArgumentException e){
            e.getMessage();
            em.close();
        }
    }

    public void deletePerson(int id){
        try{
            EntityTransaction et = em.getTransaction();
            et.begin();
            Persona ev = getById(id);
            em.remove(ev);
            et.commit();
            System.out.println("evento cancellato sul databese correttamente");
        }catch (IllegalArgumentException e){
            e.getMessage();
            em.close();
        }
    }
}
