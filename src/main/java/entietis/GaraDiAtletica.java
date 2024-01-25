package entietis;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

 @Entity
 @Table(name="gara_di_atletica")
 @NamedQuery(name = "getGareDiAtleticaPerVincitore", query="select c from GaraDiAtletica c where c.vincitore = :vincitore")
 @NamedQuery(name = "getGareDiAtleticaPerPartecipante", query="select c from GaraDiAtletica c where :partecipante member of c.atleti")
public class GaraDiAtletica extends Evento {

    @Column(name="atleti_in_gara")
    @ManyToMany (mappedBy = "gare")
    private Set<Persona> atleti;


    @ManyToOne
    @JoinColumn(name="vincitore_fk")
    private Persona vincitore;


    public GaraDiAtletica(){}

     public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Set<Persona> atleti, Persona vincitore) {
         super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
         this.atleti = atleti;
         this.vincitore = vincitore;
     }

     public Set<Persona> getAtleti() {
         return atleti;
     }

     public void setAtleti(Set<Persona> atleti) {
         this.atleti = atleti;
     }

     public Persona getVincitore() {
         return vincitore;
     }

     public void setVincitore(Persona vincitore) {
         this.vincitore = vincitore;
     }
 }
