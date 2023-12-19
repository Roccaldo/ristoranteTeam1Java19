import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Ristorante {
    private String nome;
    private String indirizzo;
    private String stato;
    private LocalDateTime orario;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    public Ristorante(String nome, String indirizzo){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.orario = LocalDateTime.now();
        this.stato = determinaStato();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public LocalDateTime getOrario() {
        return orario;
    }

    public void setOrario(LocalDateTime orario) {
        this.orario = orario;
    }

    private String determinaStato(){
        int oraAttuale = orario.getHour();
        return oraAttuale >= 8 && oraAttuale < 23 ? "Aperto" : "Chiuso";
    }

    @Override
    public String toString() {
        return "Ristorante{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", stato='" + stato + '\'' +
                ", orario=" + orario.format(formatter) +
                '}';
    }
}
