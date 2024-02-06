package progetto;

import progetto.prodotti.TipoEnum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nome;
    private Integer coperti;
    private TipoEnum menuPreferito;
    private final ArrayList<Prenotazione> prenotazioni;
    private List<PuntoReward> portafoglioReward;

    public Cliente(String nome, Integer coperti, TipoEnum menuPreferito) {
        this.nome = nome;
        this.coperti = coperti;
        this.menuPreferito = menuPreferito;
        this.prenotazioni = new ArrayList<>();
        this.portafoglioReward = new LinkedList<>();
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

    public void addRewardToPortafoglio(Prenotazione prenotazione, PuntoReward puntoReward){
        for(Prenotazione prenotazioneEs : prenotazioni){
            if(prenotazione.isCompleted()){
                portafoglioReward.add(puntoReward);
            }
        }

    }

    public void stampaPortafoglioReward(){
        Integer somma = 0;
        System.out.println("Punti raccolti: " + portafoglioReward.size());
        for (PuntoReward puntoReward : portafoglioReward) {
            somma += puntoReward.getValore();
        }   System.out.println("Valore del portafoglio: " + somma);
    }

    public void visualizzaPrenotazioni() {
        System.out.println(MessaggiEnum.PRENOTAZIONE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere());
        for (Prenotazione prenotazione : prenotazioni) {
            prenotazione.dettagliPrenotazione();
        }
    }
}
