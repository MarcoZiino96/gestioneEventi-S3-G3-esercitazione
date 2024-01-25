package dao;

import entietis.*;
import jakarta.persistence.*;

import java.util.List;

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

    public List<Concerto> getConcertiInStreming(Boolean tipo){
    Query q = em.createNamedQuery("getConcertiInStreming");
    q.setParameter("tipo", tipo);
    return q.getResultList();
}

public List<Concerto> getConcertiPerGenere(TipoGenere genere){
        Query q =em.createNamedQuery("getConcertiPerGenere");
        q.setParameter("genere",genere);
        return q.getResultList();
}

public  List<PartitaDiCalcio> getPartiteVinteCasa(){
        Query q = em.createNamedQuery("getPartiteVinteCasa");
        return q.getResultList();
}
public  List<PartitaDiCalcio> getPartiteVinteFuoriCasa(){
        Query q = em.createNamedQuery("getPartiteVinteFuoriCasa");
        return q.getResultList();
    }
public  List<PartitaDiCalcio> getPartitePareggiate(){
        Query q = em.createNamedQuery("getPartitePareggiate");
        return q.getResultList();
    }

    public List<GaraDiAtletica> getGareDiAtleticaPerVincitore(Persona p){
        Query q = em.createNamedQuery("getGareDiAtleticaPerVincitore");
        q.setParameter("vincitore", p);
        return q.getResultList();
    }
    public List<GaraDiAtletica> getGareDiAtleticaPerPartecipante(Persona p){
        Query q = em.createNamedQuery("getGareDiAtleticaPerPartecipante");
        q.setParameter("partecipante", p);
        return q.getResultList();
    }

}
