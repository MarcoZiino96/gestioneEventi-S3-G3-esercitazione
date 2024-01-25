package dao;

import entietis.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EventoDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDao(){
        emf = Persistence.createEntityManagerFactory("gestione_eventi_new");
        em = emf.createEntityManager();
    }

    public Evento getById(int id){
        return em.find(Evento.class, id);
    }

    public void saveEvent(Evento ev){
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

    public void cancellaEvento(int id){
        try{
            EntityTransaction et = em.getTransaction();
            et.begin();
            Evento ev = getById(id);
            em.remove(ev);
            et.commit();
            System.out.println("evento cancellato sul databese correttamente");
        }catch (IllegalArgumentException e){
            e.getMessage();
            em.close();
        }
    }
}
