package progetto;

import progetto.prodotti.StatoRistoranteEnum;
import progetto.prodotti.TipoEnum;

import java.io.InvalidObjectException;
import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Ristorante {
    private static Integer counter = 0;
    private Integer id;
    private String nome;
    private String indirizzo;
    private Integer numMaxPosti;
    private Integer postiLiberi;
    private OffsetTime oraApertura;
    private OffsetTime oraChiusura;
    private ArrayList<Menu> menues = new ArrayList<>();
    private final ArrayList<Prenotazione> registroPrenotazioni;
    private final List<Recensione> registroRecensioni;

    private final List<Ordine> registroOrdini;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //Costruttore
    public Ristorante(String nome, String indirizzo, Integer numMaxPosti, OffsetTime oraApertura, OffsetTime oraChiusura) {
        counter++;
        this.id = counter;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numMaxPosti = numMaxPosti;
        this.postiLiberi = numMaxPosti;
        this.oraApertura = oraApertura;
        this.oraChiusura = oraChiusura;
        this.registroPrenotazioni = new ArrayList<>();
        this.registroRecensioni = new ArrayList<>();
        this.registroOrdini = new ArrayList<>();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public OffsetTime getOraApertura() {
        return oraApertura;
    }

    public void setOraApertura(OffsetTime oraApertura) {
        this.oraApertura = oraApertura;
    }

    public OffsetTime getOraChiusura() {
        return oraChiusura;
    }

    public void setOraChiusura(OffsetTime oraChiusura) {
        this.oraChiusura = oraChiusura;
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

    public ArrayList<Prenotazione> getRegistroPrenotazioni() {
        return registroPrenotazioni;
    }

    public List<Recensione> getRegistroRecensioni() {
        return registroRecensioni;
    }

    public List<Ordine> getRegistroOrdini() {
        return registroOrdini;
    }

    public boolean determinaStato() {
        OffsetDateTime oraAttuale = OffsetDateTime.now();
        OffsetDateTime oraA = OffsetDateTime.of(LocalDate.from(oraAttuale), LocalTime.from(oraApertura), ZoneOffset.UTC);
        OffsetDateTime oraC = OffsetDateTime.of(LocalDate.from(oraAttuale), LocalTime.from(oraChiusura), ZoneOffset.UTC);
        if (oraC.isBefore(oraA)) {
            oraC = oraC.plusDays(1);
        }
        return oraAttuale.isAfter(oraA) && oraAttuale.isBefore(oraC);
    }

    public void stampaStato() {
        if (determinaStato()) {
            System.out.println(MessaggiEnum.STATO.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere()
                    + CaratteriSpeEnum.SPAZIO.getCarattere() + StatoRistoranteEnum.APERTO.getStato());
        } else {
            System.out.println(MessaggiEnum.STATO.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere()
                    + CaratteriSpeEnum.SPAZIO.getCarattere() + StatoRistoranteEnum.CHIUSO.getStato());
        }
    }

    //Metodo che aggiunge il menu al ristorante
    public void aggingiMenu(Menu menu) throws InvalidObjectException {
        if (menues.contains(menu)) {
            throw new InvalidObjectException(MessaggiEnum.MENUPRESENTE.getMessaggio());
        } else {
            menues.add(menu);
        }
    }

    //Metodo che rimuove il menu dal ristorante
    public void rimuoviMenu(Menu menu) throws InvalidObjectException {
        if (menues.contains(menu)) {
            menues.remove(menu);
            System.out.println(MessaggiEnum.MENURIMOSSO.getMessaggio());
        } else {
            throw new InvalidObjectException(MessaggiEnum.MENUNONPRESENTE.getMessaggio());
        }
    }

    //Stampa tutti i menu
    public void stampaMenues() {
        for (Menu menu : menues) {
            menu.stampaMenu();
        }
    }

    //Stampa il menu in base al tipo di menu
    public void stampamenu(TipoEnum tipoMenuEnum) throws InvalidObjectException {
        boolean nonPresente = true;
        for (Menu menu : menues) {
            if (menu.getTipoMenu().equals(tipoMenuEnum)) {
                menu.stampaMenu();
                nonPresente = false;
            }
        }
        if (nonPresente) {
            throw new InvalidObjectException(MessaggiEnum.MENUNONPRESENTE.getMessaggio());
        }
    }

    //metodo per aggiungere una prenotazione
    public void addPrenotazione(Prenotazione prenotazione) throws InvalidObjectException {
        //controllo se il ristorante ha posti liberi
        if (postiLiberi - prenotazione.getCoperti() >= 0) {
            //controllo se la data è successiva ad adesso e se la prenotazione
            //non è già stata inserita
            if (prenotazione.getOrario().isAfter(OffsetDateTime.now()) && !registroPrenotazioni.contains(prenotazione)) {
                //aggiungo prenotazione
                registroPrenotazioni.add(prenotazione);
                prenotazione.getClientePrenotazione().getPrenotazioni().add(prenotazione);
                //modifico posti liberi
                setPostiLiberi(postiLiberi - prenotazione.getCoperti());
            } else {
                throw new InvalidObjectException(MessaggiEnum.PRENOTAZIONENONVALIDA.getMessaggio());
            }
        } else {
            throw new InvalidObjectException(MessaggiEnum.PRENOTAZIONENULLA.getMessaggio() +
                    CaratteriSpeEnum.SPAZIO + MessaggiEnum.POSTILIBERI.getMessaggio() +
                    CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                    CaratteriSpeEnum.SPAZIO.getCarattere() + postiLiberi);
        }
    }

    //metodo per rimuovere una prenotazione
    public void removePrenotazione(Prenotazione prenotazione) throws InvalidObjectException {
        //controllo se il registro contiene la prenotazione da rimuovere
        boolean isContenuto = false;
        for (Prenotazione prenotazioneC : registroPrenotazioni) {
            if (prenotazioneC.equals(prenotazione)) {
                registroPrenotazioni.remove(prenotazioneC);
                prenotazione.getClientePrenotazione().getPrenotazioni().remove(prenotazione);
                System.out.println(MessaggiEnum.PRENOTAZIONERIMOSSA.getMessaggio());
                isContenuto = true;
                break;
            }
        }
            if (!isContenuto) {
                throw new InvalidObjectException(MessaggiEnum.PRENOTAZIONEINESISTENTE.getMessaggio());
            }
    }

    //metodo per visualizzare le prenotazioni del singolo ristorante
    public void visualizzaPrenotazioniRistorante() {
        System.out.println(nome + CaratteriSpeEnum.APRIPARENTESI.getCarattere() + MessaggiEnum.PRENOTAZIONI.getMessaggio() + CaratteriSpeEnum.CHIUDIPARENTESI.getCarattere());
        for (Prenotazione prenotazione : registroPrenotazioni) {
            prenotazione.dettagliPrenotazione();
        }
    }

    public void checkPrenotazione(Prenotazione prenotazione) {
        prenotazione.setCompleted(true);
    }

    public void addRecensione(Recensione recensione){
        registroRecensioni.add(recensione);
    }

    public void checkRecensione(Recensione recensione) {
        recensione.setPosted(true);
    }

    public void stampaListaRecensioni(){
        for(Recensione recensione : registroRecensioni){
            recensione.stampaRecensione();
        }
    }

    public void addOrdineToList(Ordine ordine){
        registroOrdini.add(ordine);
    }

    public void removeOrdineToList(Ordine ordine){
        registroOrdini.remove(ordine);
    }

    public void stampaListaOrdini(){
        for(Ordine ordine : registroOrdini){
            ordine.stampaOrdine();
        }
    }

    public void checkordine(Ordine ordine) {
        ordine.setCompleted(true);
    }

    public void stampaDettagliRistorante() {
        System.out.println();
        System.out.println(MessaggiEnum.NOMERISTORANTE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere()
                + CaratteriSpeEnum.SPAZIO.getCarattere() + nome);
        System.out.println(MessaggiEnum.INDIRIZZO.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere()
                + CaratteriSpeEnum.SPAZIO.getCarattere() + indirizzo);
        stampaStato();
    }

    @Override
    public String toString() {
        return "Ristorante{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", oraApertura=" + oraApertura +
                ", oraChiusura=" + oraChiusura +
                '}';
    }
}
