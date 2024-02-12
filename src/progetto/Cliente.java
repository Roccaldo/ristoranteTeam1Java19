package progetto;

import progetto.prodotti.TipoEnum;
import programma_reward.PuntoReward;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nome;
    private Integer coperti;
    private TipoEnum menuPreferito;
    private final ArrayList<Prenotazione> prenotazioni;
    private final List<PuntoReward> portafoglioReward;
    private final List<Recensione> recensioneList;
    private final List<Ordine> ordineList;

    private Integer puntiTotali;

    public Cliente(String nome, Integer coperti, TipoEnum menuPreferito) {
        this.nome = nome;
        this.coperti = coperti;
        this.menuPreferito = menuPreferito;
        this.prenotazioni = new ArrayList<>();
        this.portafoglioReward = new LinkedList<>();
        this.puntiTotali = 0;
        this.recensioneList = new ArrayList<>();
        this.ordineList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(Integer coperti) {
        this.coperti = coperti;
    }

    public TipoEnum getMenuPreferito() {
        return menuPreferito;
    }

    public void setMenuPreferito(TipoEnum menuPreferito) {
        this.menuPreferito = menuPreferito;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public List<PuntoReward> getPortafoglioReward() {
        return portafoglioReward;
    }

    public Integer getPuntiTotali() {
        return puntiTotali;
    }

    public List<Recensione> getRecensioneList() {
        return recensioneList;
    }

    public List<Ordine> getOrdineList() {
        return ordineList;
    }

    public void addPrenotazione(Prenotazione prenotazione) {
        prenotazioni.add(prenotazione);
    }

    public void removePrenotazione(Prenotazione prenotazione) {
        prenotazioni.remove(prenotazione);
    }


    //Metodo stampa dettagli del cliente
    public void dettagliCliente() {
        System.out.println(MessaggiEnum.CLIENTE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() + nome +
                CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() +
                MessaggiEnum.COPERTI + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() +
                coperti + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere());
    }

    //Metodo per stampare i ristoranti che contengono il tipo di menu preferito del cliente
    public void ristorantiConsigliati(RegistroRistoranti registro) {
        System.out.print(MessaggiEnum.RISTORANTI.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere());
        for (Ristorante ristorante : registro.getRistorantiList()) {
            for (Menu menu : ristorante.getMenues()) {
                if (menu.getTipoMenu().getTipoMenu().equals(menuPreferito.getTipoMenu())) {
                    System.out.print(ristorante.getNome() + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere());
                    break;
                }
            }
        }
        System.out.println();
    }

    public void addRecensione(Recensione recensione){
        recensioneList.add(recensione);
    }
    public void stampaListaRecensioni(){
        for(Recensione recensione : recensioneList){
            recensione.stampaRecensione();
        }
    }

    public void addOrdineToList(Ordine ordine){
        ordineList.add(ordine);
    }

    public void removeOrdineToList(Ordine ordine){
        ordineList.remove(ordine);
    }

    public void stampaOrdini(){
        for(Ordine ordine : ordineList){
            ordine.stampaOrdine();
        }
    }

    public void addRewardToPortafoglioPrenotazione(Prenotazione prenotazione, PuntoReward puntoReward){
        for(Prenotazione prenotazioneEs : prenotazioni){
            if(prenotazione.isCompleted()){
                portafoglioReward.add(puntoReward);
                puntiTotali++;
            }
        }
    }

    public void addRewardToPortafoglioRecensione(Recensione recensione, PuntoReward puntoReward){
        for(Recensione recensioneEs : recensioneList){
            if(recensione.isPosted()){
                portafoglioReward.add(puntoReward);
                puntiTotali++;
            }
        }
    }

    public void addRewardToPortafoglioOrdine(Ordine ordine, PuntoReward puntoReward){
        for(Ordine ordineEs : ordineList){
            if(ordine.isCompleted()){
                portafoglioReward.add(puntoReward);
                puntiTotali++;
            }
        }
    }

    public void stampaPortafoglioReward(){
        System.out.println(MessaggiEnum.PUNTI.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() + puntiTotali);
    }

    public void visualizzaPrenotazioni() {
        System.out.println(MessaggiEnum.PRENOTAZIONE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere());
        for (Prenotazione prenotazione : prenotazioni) {
            prenotazione.dettagliPrenotazione();
        }
    }


}
