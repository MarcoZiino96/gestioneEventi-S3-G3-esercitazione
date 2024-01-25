package entietis;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="concerto")
@NamedQuery(name = "getConcertiInStreming", query= "select c from Concerto c where c.inStreming=:tipo")
@NamedQuery(name ="getConcertiPerGenere", query=" select c from Concerto c where c.genere=:genere")
public class Concerto extends Evento{

    @Enumerated(EnumType.STRING)
    private TipoGenere genere;

    @Column(name="in_streming")
    private Boolean inStreming;

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreming=" + inStreming +
                '}';
    }

    public TipoGenere getGenere() {
        return genere;
    }


    public void setGenere(TipoGenere genere) {
        this.genere = genere;
    }

    public Boolean getInStreming() {
        return inStreming;
    }

    public void setInStreming(Boolean inStreming) {
        this.inStreming = inStreming;
    }

    public Concerto(){}

    public Concerto(TipoGenere genere, Boolean inStreming) {
        this.genere = genere;
        this.inStreming = inStreming;
    }

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, TipoGenere genere, Boolean inStreming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.genere = genere;
        this.inStreming = inStreming;
    }
}
