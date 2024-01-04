import javax.swing.*;
import java.time.OffsetDateTime;

public class Prenotazione {

    private String nomePrenotazione;

    private Integer postiOccupati;

    private OffsetDateTime orario;

    public Prenotazione(String nomePrenotazione, Integer postiOccupati, OffsetDateTime orario) {
        this.nomePrenotazione = nomePrenotazione;
        this.postiOccupati = postiOccupati;
        this.orario = orario;
    }

    public String getNomePrenotazione() {
        return nomePrenotazione;
    }

    public void setNomePrenotazione(String nomePrenotazione) {
        this.nomePrenotazione = nomePrenotazione;
    }

    public Integer getPostiOccupati() {
        return postiOccupati;
    }

    public void setPostiOccupati(Integer postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public OffsetDateTime getOrario() {
        return orario;
    }

    public void setOrario(OffsetDateTime orario) {
        this.orario = orario;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "nomePrenotazione='" + nomePrenotazione + '\'' +
                ", postiOccupati=" + postiOccupati +
                ", orario=" + orario +
                '}';
    }

    public void dettagliPrenotazione(){
        System.out.print(nomePrenotazione + ": " + " " + postiOccupati + " | " + orario);
    }
}
