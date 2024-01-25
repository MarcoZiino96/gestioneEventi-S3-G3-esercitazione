package entietis;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

 @Entity
 @Table(name="gara_di_atletica")
public class GaraDiAtletica extends Evento {

    @Column(name="atleti_in_gara")
    @OneToMany(mappedBy = "atleta")
    private Set<Persona> atletiInGara;

    private Persona vincitore;


    public GaraDiAtletica(){}

    public Set<Persona> getAtletiInGara() {
        return atletiInGara;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atletiInGara=" + atletiInGara +
                ", vincitore=" + vincitore +
                '}';
    }

    public void setAtletiInGara(Set<Persona> atletiInGara) {
        this.atletiInGara = atletiInGara;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    public GaraDiAtletica(Set<Persona> atletiInGara, Persona vincitore) {
        this.atletiInGara = atletiInGara;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Set<Persona> atletiInGara, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.atletiInGara = atletiInGara;
        this.vincitore = vincitore;
    }
}
