import prodotti.StatoRistoranteEnum;
import prodotti.TipoEnum;

import java.io.InvalidObjectException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ristorante {
    private String nome;

    private String indirizzo;

    private String stato;

    private LocalDateTime orario;

    private Integer numMaxPosti;

    //TODO mmm siamo sicuro di fare una gestione con tutti sti campi?
    private Integer postiLiberi;

    private List<Prenotazione> prenotazioniList = new ArrayList<>();

    private ArrayList<Menu> menues = new ArrayList<>();

    private final Map<Prenotazione, Cliente> registroPrenotazioni = new HashMap<>();

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //Costruttore
    public Ristorante(String nome, String indirizzo, Integer numMaxPosti) {
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

    public Integer getNumMaxPosti() {
        return numMaxPosti;
    }

    public void setNumMaxPosti(Integer numMaxPosti) {
        this.numMaxPosti = numMaxPosti;
    }

    public Integer getPostiLiberi() {
        return postiLiberi;
    }

    public void setPostiLiberi(Integer postiLiberi) {
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
    private String determinaStato() {
        int oraAttuale = orario.getHour();
        return oraAttuale >= 8 && oraAttuale < 23 ? StatoRistoranteEnum.APERTO.getStato() : StatoRistoranteEnum.CHIUSO.getStato();
    }

    //Metodo che aggiunge il menu al ristorante
    public void aggingiMenu(Menu menu) throws InvalidObjectException {
        if (menues.contains(menu)) {
            //TODO facciamo una gestione meno aggressiva delle eccezioni !è colpa di ubaldo!!!!
            throw new InvalidObjectException(MessaggiEnum.MENUPRESENTE.getMessaggio());
        } else {
            menues.add(menu);
        }
    }

    //Metodo che rimuove il menu dal ristorante
    public void rimuoviMenu(Menu menu) {
        if (menues.contains(menu)) {
            menues.remove(menu);
            System.out.println(MessaggiEnum.MENURIMOSSO.getMessaggio());
        } else {
            throw new RuntimeException(MessaggiEnum.MENUNONPRESENTE.getMessaggio());
        }
    }

    //Stampa tutti i menu
    public void stampaMenues() {
        for (Menu menu : menues) {
            menu.stampaMenu();
        }
    }

    //Stampa il menu in base al tipo di menu
    public void stampamenu(TipoEnum tipoMenuEnum) {
        boolean nonPresente = true;
        for (Menu menu : menues) {
            if (menu.getTipoMenu().equals(tipoMenuEnum)) {
                menu.stampaMenu();
                nonPresente = false;
            }
        }
        if (nonPresente) {
            throw new RuntimeException(MessaggiEnum.MENUNONPRESENTE.getMessaggio());
        }
    }

    //metodo per aggiungere una prenotazione
    public void addPrenotazione(Prenotazione prenotazione, Cliente cliente) {
        //controllo se il ristorante ha posti liberi
        if (postiLiberi - prenotazione.getPostiOccupati() >= 0) {
            //controllo se la data è successiva ad adesso e se la prenotazione
            //non è già stata inserita
            if (prenotazione.getOrario().isAfter(OffsetDateTime.now()) && !registroPrenotazioni.containsKey(prenotazione)) {
                //aggiungo prenotazione
                registroPrenotazioni.put(prenotazione, cliente);
                //modifico posti liberi
                setPostiLiberi(postiLiberi - prenotazione.getPostiOccupati());
            } else {
                throw new RuntimeException(MessaggiEnum.PRENOTAZIONENONVALIDA.getMessaggio());
            }
        } else {
            throw new RuntimeException(MessaggiEnum.PRENOTAZIONENULLA.getMessaggio() + " " + MessaggiEnum.POSTILIBERI.getMessaggio() + " = " + postiLiberi);
        }
    }

    //metodo per rimuovere una prenotazione
    public void removePrenotazione(Prenotazione prenotazione, Cliente cliente) {
        //controllo se il registro contiene la prenotazione da rimuovere
        if (registroPrenotazioni.containsKey(prenotazione)) {

            //rimuovo la prenotazione
            registroPrenotazioni.remove(prenotazione);
            System.out.println(MessaggiEnum.PRENOTAZIONERIMOSSA.getMessaggio());
            //modifico posti liberi
            setPostiLiberi(postiLiberi + prenotazione.getPostiOccupati());
        } else {
            throw new RuntimeException(MessaggiEnum.PRENOTAZIONEINESISTENTE.getMessaggio());
        }

    }

    //metodo per visualizzare le prenotazioni del singolo ristorante
    public void visualizzaPrenotazioniRistorante() {
        for (Prenotazione element : registroPrenotazioni.keySet()) {
            //TODO sto toString non va bene per stampare, dobbiamo usare i metodo dell'oggetto | ubaldo i 2 punti
            System.out.println(MessaggiEnum.NOMEPRENOTAZIONE.getMessaggio() + ": " + element.getNomePrenotazione() + " | " + MessaggiEnum.COPERTI.getMessaggio()  + ": " + element.getPostiOccupati() + " | " + MessaggiEnum.ORARIO.getMessaggio()  + ": " + element.getOrario() + " |");
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
