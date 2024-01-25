package entietis;


import jakarta.persistence.*;

@Entity
@Table(name="partecipazione")

public class Partecipazione {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "evento_fk")

    private Evento evento;

    @Enumerated(EnumType.STRING)
    private TipoStato stato;
    @ManyToOne
    @JoinColumn(name = "persona_fk")
    private Persona persona;
    public Partecipazione(){}

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", evento=" + evento +
                ", stato=" + stato +
                ", persona=" + persona.getId() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public TipoStato getStato() {
        return stato;
    }

    public void setStato(TipoStato stato) {
        this.stato = stato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Partecipazione(Evento evento, TipoStato stato, Persona persona) {
        this.evento = evento;
        this.stato = stato;
        this.persona = persona;
    }
}
