package dao;

import entietis.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PartecipazioneDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipazioneDao(){
        emf = Persistence.createEntityManagerFactory("gestione_eventi_new");
        em = emf.createEntityManager();
    }

    public Partecipazione getById(int id){
        return em.find(Partecipazione.class, id);
    }

    public void savePartecipazione(Partecipazione ev){
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

    public void deletePartecipazione(int id){
        try{
            EntityTransaction et = em.getTransaction();
            et.begin();
            Partecipazione ev = getById(id);
            em.remove(ev);
            et.commit();
            System.out.println("evento cancellato sul databese correttamente");
        }catch (IllegalArgumentException e){
            e.getMessage();
            em.close();
        }
    }
}
