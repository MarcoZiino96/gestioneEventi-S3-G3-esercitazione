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

  //     Evento ev1 = new Evento("ultimo", LocalDate.of(2024,7,10),"ultimo", TipoEvento.PUBBLICO, 50000 );
  //     Evento ev2 = new Evento("jovanotti", LocalDate.of(2024,6,14),"ligabue",TipoEvento.PUBBLICO, 55000 );
  //     eventoDao.saveEvent(ev1);
  //     eventoDao.saveEvent(ev2);

  //     Persona p1 = new Persona("federico","tusa", "federicoooo@gmail.it", LocalDate.of(1992,4,16), TipoSesso.M);
  //     Persona p2 = new Persona("lorena","tusa", "lorencoooo@gmail.it", LocalDate.of(1998,1,14), TipoSesso.F);

  //     personaDao.savePerson(p1);
  //     personaDao.savePerson(p1);

  //     Partecipazione prt1=new Partecipazione(ev1,TipoStato.CONFERMATA,p1);
  //     Partecipazione prt2=new Partecipazione(ev2,TipoStato.CONFERMATA,p1);
  //     prtDao.savePartecipazione(prt1);
  //     prtDao.savePartecipazione(prt2);

  //     Location lct= new Location("san_siro","milano");
  //     lctDao.saveLocation(lct);

   // Concerto c1 = new Concerto(TipoGenere.POP, true);
   // c1.setDataEvento(LocalDate.of(2024, 3, 5));
   // c1.setTipoEvento(TipoEvento.PUBBLICO);
   // eventoDao.saveEvent(c1);



        //eventoDao.getConcertiInStreming(false).stream().forEach(concerto -> System.out.println(concerto));
        //eventoDao.getConcertiPerGenere(TipoGenere.POP).stream().forEach(c -> System.out.println(c));




  //  GaraDiAtletica gAtl1 = new GaraDiAtletica();
  //  gAtl1.setDataEvento(LocalDate.of(2024,12,25));
  //  eventoDao.saveEvent(gAtl1);
  //  Persona p1 = personaDao.getById(1);
  //  p1.getGare().add(gAtl1);
  //  personaDao.savePerson(p1);

  //  Persona p2 = personaDao.getById(2);
  //  p2.getGare().add(gAtl1);
  //  personaDao.savePerson(p2);




    //PartitaDiCalcio partitaCalcio = new PartitaDiCalcio("juve","inter","juve",2,3);
    //PartitaDiCalcio partitaCalcio3 = new PartitaDiCalcio("juve","inter","juve",3,2);
    //PartitaDiCalcio partitaCalcio2 = new PartitaDiCalcio();
    //partitaCalcio2.setSquadraCasa("verona");
    //partitaCalcio2.setSquadraOspite("bari");

    //eventoDao.saveEvent(partitaCalcio);
    //eventoDao.saveEvent(partitaCalcio2);
    //eventoDao.saveEvent(partitaCalcio3);


    //eventoDao.getPartiteVinteFuoriCasa().stream().forEach(System.out::println);
    //   System.out.println();
    //   eventoDao.getPartiteVinteCasa().stream().forEach(System.out::println);
    //   System.out.println();
    //   eventoDao.getPartitePareggiate().stream().forEach(System.out::println);

 //      Persona p1 = personaDao.getById(1);
 //      Persona p2 = personaDao.getById(2);
 //      System.out.println(p1);
 //      System.out.println(p2);

 //      GaraDiAtletica gAtl1 = (GaraDiAtletica)eventoDao.getById(4);
 //      p1.getGare().add(gAtl1);
 //      p2.getGare().add(gAtl1);



 //      GaraDiAtletica gAtl2 = (GaraDiAtletica)eventoDao.getById(52);
 //      p1.getGare().add(gAtl2);
 //      p2.getGare().add(gAtl2);
 //      eventoDao.saveEvent(gAtl2);



 //      gAtl1.setAtleti(Set.of(p1,p2));
 //      gAtl1.setVincitore(p1);
 //      eventoDao.saveEvent(gAtl1);
 //      gAtl2.setAtleti(Set.of(p1,p2));
 //      gAtl2.setVincitore(p2);
 //      eventoDao.saveEvent(gAtl2);

        Persona p1 = personaDao.getById(1);
        Persona p2 = personaDao.getById(2);
        GaraDiAtletica gAtl1 = (GaraDiAtletica)eventoDao.getById(4);
        GaraDiAtletica gAtl2 = (GaraDiAtletica)eventoDao.getById(52);

        gAtl1.setAtleti(Set.of(p1,p2));
        gAtl2.setAtleti(Set.of(p1));

        eventoDao.getGareDiAtleticaPerPartecipante(p1).stream().forEach(System.out::println);
        eventoDao.getGareDiAtleticaPerVincitore(p1).stream().forEach(System.out::println);

        eventoDao.getGareDiAtleticaPerPartecipante(p2).stream().forEach(System.out::println);
        eventoDao.getGareDiAtleticaPerVincitore(p2).stream().forEach(System.out::println);





    }
}
