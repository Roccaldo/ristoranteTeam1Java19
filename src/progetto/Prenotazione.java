package progetto;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Prenotazione {

    private String nomePrenotazione;

    private Integer coperti;

    private OffsetDateTime orario;
    private Integer id;
    private static Integer counter = 0;


    //Costruttore
    public Prenotazione(String nome, Integer coperti, OffsetDateTime orario) {
        counter++;
        this.nomePrenotazione = nome;
        this.coperti = coperti;
        this.orario = orario;
        this.id = counter;
    }

    //Getter e Setter

    public String getNome() {
        return nomePrenotazione;
    }

    public void setNome(String nome) {
        this.nomePrenotazione = nome;
    }

    public Integer getCoperti() {
        return coperti;
    }

    public void setCoperti(Integer coperti) {
        this.coperti = coperti;
    }

    public OffsetDateTime getOrario() {
        return orario;
    }

    public void setOrario(OffsetDateTime orario) {
        this.orario = orario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "progetto.Prenotazione{" +
                "nomePrenotazione='" + nomePrenotazione + '\'' +
                ", postiOccupati=" + coperti +
                ", orario=" + orario +
                '}';
    }

    //Metodo Stampa dettagli della prenotazione
    public void dettagliPrenotazione() {
        System.out.println(MessaggiEnum.ID.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() + id + CaratteriSpeEnum.SPAZIO.getCarattere() +
                CaratteriSpeEnum.LINEA.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() + nomePrenotazione + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + MessaggiEnum.COPERTI.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + coperti + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + MessaggiEnum.DATA.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + orario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm")) + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere());
    }
}
