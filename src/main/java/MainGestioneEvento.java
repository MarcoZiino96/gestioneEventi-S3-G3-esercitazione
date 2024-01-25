import dao.EventoDao;
import dao.LocationDao;
import dao.PartecipazioneDao;
import dao.PersonaDao;
import entietis.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainGestioneEvento {
    public static void main(String[] args) {
        EventoDao eventoDao = new EventoDao();
        PersonaDao personaDao = new PersonaDao();
        PartecipazioneDao prtDao = new PartecipazioneDao();
        LocationDao lctDao = new LocationDao();

        //Evento ev1 = new Evento("ultimo", LocalDate.of(2024,7,10),"ultimo", TipoEvento.PUBBLICO, 50000 );
        //Evento ev2 = new Evento("jovanotti", LocalDate.of(2024,6,14),"ligabue",TipoEvento.PUBBLICO, 55000 );
        //eventoDao.saveEvent(ev1);
        //eventoDao.saveEvent(ev2);
//
        //Persona p1 = new Persona("federico","tusa", "federicoooo@gmail.it", LocalDate.of(1992,4,16), TipoSesso.M);
        //Persona p2 = new Persona("lorena","tusa", "lorencoooo@gmail.it", LocalDate.of(1998,1,14), TipoSesso.F);
//
        //personaDao.savePerson(p1);
        //personaDao.savePerson(p1);
//
        //Partecipazione prt1=new Partecipazione(ev1,TipoStato.CONFERMATA,p1);
        //Partecipazione prt2=new Partecipazione(ev2,TipoStato.CONFERMATA,p1);
        //prtDao.savePartecipazione(prt1);
        //prtDao.savePartecipazione(prt2);
//
        //Location lct= new Location("san_siro","milano");
        //lctDao.saveLocation(lct);

        //Concerto c1 = new Concerto(TipoGenere.POP, true);
        //eventoDao.saveEvent(c1);

        Persona p1 = personaDao.getById(1);

        GaraDiAtletica gAtl1 = new GaraDiAtletica(Set.of(p1), p1);
        eventoDao.saveEvent(gAtl1);

        //PartitaDiCalcio partitaCalcio = new PartitaDiCalcio();
        //eventoDao.saveEvent(partitaCalcio);
    }
}
