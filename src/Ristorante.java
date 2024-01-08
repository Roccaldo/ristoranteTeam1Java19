import prodotti.TipoMenuEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Ristorante {
    private String nome;
    private String indirizzo;
    private String stato;
    private LocalDateTime orario;

    private ArrayList<Menu> menues = new ArrayList<>();

    //TODO googlare per capire se c'è un metodo che prende un enumerato
    //Testiamolo
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //Costruttore
    public Ristorante(String nome, String indirizzo){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.orario = LocalDateTime.now();
        this.stato = determinaStato();
    }

    //Getter e Setter
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

    //Metodo che determina lo stato del ristorante
    private String determinaStato(){
        int oraAttuale = orario.getHour();
        return oraAttuale >= 8 && oraAttuale < 23 ? "Aperto" : "Chiuso";
    }

    public void aggingiMenu(Menu menu) {
        if (menues.contains(menu)) {
            System.out.println("menù già presente");
        } else {
            menues.add(menu);
            System.out.println("menù aggiunto correttamente");
        }
    }

    public void rimuoviMenu(Menu menu) {
        if (menues.contains(menu)) {
            menues.remove(menu);
            System.out.println("menù rimosso correttamente");
        } else {
            System.out.println("menù non esistente");
        }
    }

    public void stampaMenues() {
        for (Menu menu : menues) {
            menu.stampaMenu();
        }
    }

    public void stampamenu(TipoMenuEnum tipoMenuEnum) {
        boolean nonPresente = true;
        for (Menu menu : menues) {
            if (menu.getTipoMenu().equals(tipoMenuEnum)) {
                menu.stampaMenu();
                nonPresente = false;
            }
        }
        if (nonPresente) {
            System.out.println("il menù non è presente");
        }
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
