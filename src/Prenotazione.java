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
        return "Prenotazione{" +
                "nomePrenotazione='" + clientePrenotazione + '\'' +
                ", postiOccupati=" + postiOccupati +
                ", orario=" + orario +
                '}';
    }

    //Metodo Stampa dettagli della prenotazione
    public void dettagliPrenotazione() {
        System.out.print(MessaggiEnum.NOMEPRENOTAZIONE.getMessaggio() + ": " + clientePrenotazione.getCognome() + " | " + MessaggiEnum.COPERTI.getMessaggio() + ": " + postiOccupati + " | " + MessaggiEnum.ORARIO.getMessaggio() + ": " + orario + " |");
    }
}
