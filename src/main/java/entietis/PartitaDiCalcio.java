package entietis;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="partita_di_calcio")
public class PartitaDiCalcio  extends Evento{

    @Column(name = "squadra_casa")
    private String squadraCasa;
    @Column(name = "squadra_ospite")
    private String squadraOspite;

    @Column(name="saquadra_vincente")
    private String squadraVincente;

    @Column(name="numero_gol_casa")
    private int numeroGolCasa;
    @Column(name="numero_gol_ospite")
    private int numeroGolOspite;

    public PartitaDiCalcio() {
    }


    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumeroGolCasa() {
        return numeroGolCasa;
    }

    public void setNumeroGolCasa(int numeroGolCasa) {
        this.numeroGolCasa = numeroGolCasa;
    }

    public int getNumeroGolOspite() {
        return numeroGolOspite;
    }

    public void setNumeroGolOspite(int numeroGolOspite) {
        this.numeroGolOspite = numeroGolOspite;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraCasa='" + squadraCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeroGolCasa=" + numeroGolCasa +
                ", numeroGolOspite=" + numeroGolOspite +
                '}';
    }

    public PartitaDiCalcio(String squadraCasa, String squadraOspite, String squadraVincente, int numeroGolCasa, int numeroGolOspite) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolCasa = numeroGolCasa;
        this.numeroGolOspite = numeroGolOspite;
    }

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, String squadraCasa, String squadraOspite, String squadraVincente, int numeroGolCasa, int numeroGolOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolCasa = numeroGolCasa;
        this.numeroGolOspite = numeroGolOspite;
    }
}
