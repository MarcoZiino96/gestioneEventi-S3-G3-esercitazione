import dao.EventoDao;
import dao.LocationDao;
import dao.PartecipazioneDao;
import dao.PersonaDao;
import entietis.*;

import java.time.LocalDate;

public class MainGestioneEvento {
    public static void main(String[] args) {
        EventoDao eventoDao = new EventoDao();
        PersonaDao personaDao = new PersonaDao();
        PartecipazioneDao prtDao = new PartecipazioneDao();
        LocationDao lctDao = new LocationDao();

        Evento ev1 = new Evento("Il ritorno di max", LocalDate.of(2024,7,9),"max pezzali-messina(sicilia)-stadio san-filippo", TipoEvento.PUBBLICO, 50000 );
        Evento ev2 = new Evento("ligabue", LocalDate.of(2024,6,15),"ligabue- areba di verona",TipoEvento.PUBBLICO, 55000 );
        eventoDao.saveEvent(ev1);
        eventoDao.saveEvent(ev2);

        Persona p1 = new Persona("marco","mastritto", "Marccooo@gmail.it", LocalDate.of(1996,7,16), TipoSesso.M);
        personaDao.savePerson(p1);

        Partecipazione prt1=new Partecipazione();
        prtDao.savePartecipazione(prt1);

        Location lct= new Location();

        lctDao.saveLocation(lct);




    }
}
