package progetto;

import java.time.OffsetDateTime;

public class Prenotazione {

    private Cliente clientePrenotazione;

    private Integer postiOccupati;

    private OffsetDateTime orario;


    //Costruttore
    public Prenotazione(Cliente nomePrenotazione, Integer postiOccupati, OffsetDateTime orario) {
        this.clientePrenotazione = nomePrenotazione;
        this.postiOccupati = postiOccupati;
        this.orario = orario;
    }

    //Getter e Setter
    public Cliente getClientePrenotazione() {
        return clientePrenotazione;
    }

    public void setNomePrenotazione(Cliente nomePrenotazione) {
        this.clientePrenotazione = nomePrenotazione;
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
        return "progetto.Prenotazione{" +
                "nomePrenotazione='" + clientePrenotazione + '\'' +
                ", postiOccupati=" + postiOccupati +
                ", orario=" + orario +
                '}';
    }

    //Metodo Stampa dettagli della prenotazione
    public void dettagliPrenotazione() {
        System.out.print(MessaggiEnum.NOMEPRENOTAZIONE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + clientePrenotazione.getCognome() + CaratteriSpeEnum.LINEA.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + MessaggiEnum.COPERTI.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + postiOccupati + CaratteriSpeEnum.LINEA.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + MessaggiEnum.ORARIO.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + orario + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere());
    }
}
