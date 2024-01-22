package progetto;

import progetto.prodotti.TipoEnum;

import java.util.ArrayList;

public class Cliente {

    private String cognome;
    private Integer numeroPersone;
    private TipoEnum menuPreferito;
    private ArrayList<Prenotazione> prenotazioni;

    public Cliente(String cognome, Integer numeroPersone, TipoEnum menuPreferito) {
        this.cognome = cognome;
        this.numeroPersone = numeroPersone;
        this.menuPreferito = menuPreferito;
        this.prenotazioni = new ArrayList<>();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
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

    public void addPrenotazione(Prenotazione prenotazione) {
        prenotazioni.add(prenotazione);
    }

    public void removePrenotazione(Prenotazione prenotazione) {
        prenotazioni.remove(prenotazione);
    }

    //Metodo stampa dettagli del cliente
    public void dettagliCliente() {
        System.out.println(MessaggiEnum.CLIENTE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() + cognome +
                CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() +
                MessaggiEnum.COPERTI + CaratteriSpeEnum.DUEPUNTI.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() +
                numeroPersone + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.LINEA.getCarattere());
    }

    //Metodo per stampare i ristoranti che contengono il tipo di menu preferito del cliente
    public void ristorantiConsigliati(RegistroRistoranti registro) {
        System.out.print("Ristoranti consigliati: ");
        for (Ristorante ristorante : registro.getRistorantiList()) {
            for (Menu menu : ristorante.getMenues()) {
                if (menu.getTipoMenu().getTipoMenu().equals(menuPreferito.getTipoMenu())) {
                    System.out.print(ristorante.getNome() + " | ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void visualizzaPrenotazioni() {
        System.out.println(MessaggiEnum.PRENOTAZIONE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere());
        for (Prenotazione prenotazione : prenotazioni) {
            prenotazione.dettagliPrenotazione();
        }
    }
}
