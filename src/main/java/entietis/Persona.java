package entietis;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="persona")
public class Persona {

    @Id@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "sequnce_persone")
    @SequenceGenerator(name = "sequenza_clienti", initialValue = 10, allocationSize = 10)
    private int id;

    private String nome;
    private String cognome;
    private String Email;
    @Column(name ="data_nascita")
    private LocalDate dataNascita;

    @ManyToMany
    @JoinTable(name = "persone_gare",
            joinColumns = @JoinColumn(name="persona_fk"),
            inverseJoinColumns = @JoinColumn(name="gara_fk"))
    private Set<GaraDiAtletica> gare = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private TipoSesso sesso;
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> partecipazioni;
    @OneToMany(mappedBy = "vincitore")
    List<GaraDiAtletica> gareVinte;

    public Set<GaraDiAtletica> getGare() {
        return gare;
    }

    public void setGare(Set<GaraDiAtletica> gare) {
        this.gare = gare;
    }

    public List<GaraDiAtletica> getGareVinte() {
        return gareVinte;
    }

    public void setGareVinte(List<GaraDiAtletica> gareVinte) {
        this.gareVinte = gareVinte;
    }


public Persona(){}

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, TipoSesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        Email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", Email='" + Email + '\'' +
                ", dataNascita=" + dataNascita +
                ", sesso=" + sesso +
                ", partecipazioni=" + partecipazioni +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public TipoSesso getSesso() {
        return sesso;
    }

    public void setSesso(TipoSesso sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }
}
