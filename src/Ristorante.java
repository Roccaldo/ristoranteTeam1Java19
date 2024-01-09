import prodotti.TipoMenuEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Ristorante {
    private String nome;
    private String indirizzo;
    private String stato;
    private LocalDateTime orario;
    private int numeroTavoli;
    private int numMaxPosti;
    private int postiLiberi;
    private List<Prenotazione> prenotazioniList = new ArrayList<>();

    private ArrayList<Menu> menues = new ArrayList<>();

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //Costruttore
    public Ristorante(String nome, String indirizzo, int numMaxPosti){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.orario = LocalDateTime.now();
        this.stato = determinaStato();
        this.numMaxPosti = numMaxPosti;
        this.postiLiberi = numMaxPosti;
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

    public int getNumeroTavoli() {
        return numeroTavoli;
    }

    public void setNumeroTavoli(int numeroTavoli) {
        this.numeroTavoli = numeroTavoli;
    }

    public int getNumMaxPosti() {
        return numMaxPosti;
    }

    public void setNumMaxPosti(int numMaxPosti) {
        this.numMaxPosti = numMaxPosti;
    }

    public int getPostiLiberi() {
        return postiLiberi;
    }

    public void setPostiLiberi(int postiLiberi) {
        this.postiLiberi = postiLiberi;
    }

    public List<Prenotazione> getPrenotazioniList() {
        return prenotazioniList;
    }

    public void setPrenotazioniList(List<Prenotazione> prenotazioniList) {
        this.prenotazioniList = prenotazioniList;
    }

    public ArrayList<Menu> getMenues() {
        return menues;
    }

    public void setMenues(ArrayList<Menu> menues) {
        this.menues = menues;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    //Metodo che determina lo stato del ristorante
    private String determinaStato(){
        int oraAttuale = orario.getHour();
        return oraAttuale >= 8 && oraAttuale < 23 ? "Aperto" : "Chiuso";
    }

    //Metodo che aggiunge il menu al ristorante
    public void aggingiMenu(Menu menu) {
        if (menues.contains(menu)) {
            System.out.println("menù già presente");
        } else {
            menues.add(menu);
            System.out.println("menù aggiunto correttamente");
        }
    }

    //Metodo che rimuove il menu dal ristorante
    public void rimuoviMenu(Menu menu) {
        if (menues.contains(menu)) {
            menues.remove(menu);
            System.out.println("menù rimosso correttamente");
        } else {
            System.out.println("menù non esistente");
        }
    }

    //Stampa tutti i menu
    public void stampaMenues() {
        for (Menu menu : menues) {
            menu.stampaMenu();
        }
    }

    //Stampa il menu in base al tipo di menu
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
