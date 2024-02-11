package progetto;

import java.util.ArrayList;
import java.util.List;

public class Carrello {

    private List<Ordine> carrello;

    private Double prezzoTotale;

    public Carrello() {
        this.carrello = new ArrayList<>();
        this.prezzoTotale = prezzoTotale;
    }

    public List<Ordine> getCarrello() {
        return carrello;
    }

    public Double getPrezzoTotale() {
        return prezzoTotale;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "carrello=" + carrello +
                ", prezzoTotale=" + prezzoTotale +
                '}';
    }

    public void aggiungiOrdine(Ordine ordine) {
        carrello.add(ordine);
    }

    public void rimuoviOrdine(Ordine ordine) {
        carrello.remove(ordine);
    }

    public void mostraCarrello() {
        for (Ordine ordine : carrello) {
            ordine.stampaOrdine();
        }
    }

}

