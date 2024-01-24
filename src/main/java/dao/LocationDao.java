package dao;

import entietis.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class LocationDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LocationDao(){
        emf = Persistence.createEntityManagerFactory("gestione_eventi");
        em = emf.createEntityManager();
    }

    public Location getById(int id){
        return em.find(Location.class, id);
    }

    public void saveLocation(Location ev){
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

    public void deleteLocation(int id){
        try{
            EntityTransaction et = em.getTransaction();
            et.begin();
            Location ev = getById(id);
            em.remove(ev);
            et.commit();
            System.out.println("evento cancellato sul databese correttamente");
        }catch (IllegalArgumentException e){
            e.getMessage();
            em.close();
        }
    }
}
