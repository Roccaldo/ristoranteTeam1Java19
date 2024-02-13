package progetto;

import progetto.prodotti.Prodotti;

import java.io.InvalidObjectException;
import java.util.ArrayList;

public class RegistroRistoranti {
    private ArrayList<Ristorante> ristorantiList;

    public RegistroRistoranti() {
        this.ristorantiList = new ArrayList<>();
    }

    public ArrayList<Ristorante> getRistorantiList() {
        return ristorantiList;
    }

    public void setRistorantiList(ArrayList<Ristorante> ristorantiList) {
        this.ristorantiList = ristorantiList;
    }

    //Aggiunge un ristorante al registro
    public void addRistoranteToList(Ristorante ristorante) throws InvalidObjectException {
        if (!ristorantiList.contains(ristorante)) {
            ristorantiList.add(ristorante);
        } else {
            throw new InvalidObjectException(MessaggiEnum.RISTORANTEPRESENTE.getMessaggio());
        }
    }

    //Rimuove un ristorante dal registro
    public void removeRistoranteToList(Ristorante ristorante) throws InvalidObjectException {
        if (ristorantiList.contains(ristorante)) {
            ristorantiList.remove(ristorante);
        } else {
            throw new InvalidObjectException(MessaggiEnum.RISTORANTENONPRESENTE.getMessaggio());
        }
    }

    public Integer getMenuIdRistorante(Menu menu) {
        for (Ristorante ristorante : ristorantiList) {
            if (ristorante.getMenues().contains(menu)) {
                return ristorante.getId();
            }
        }
        return null;
    }

    public Integer getportataIdMenu(Prodotti prodotti) {
        for (Ristorante ristorante : ristorantiList) {
            for (Menu menu : ristorante.getMenues()) {
                if (menu.getPortateList().contains(prodotti)) {
                    return menu.getId();
                }
            }
        }
        return null;
    }

    public Integer getPrenotazioneIdRistorante(Prenotazione prenotazione) {
        for (Ristorante ristorante : ristorantiList) {
            if (ristorante.getRegistroPrenotazioni().contains(prenotazione)) {
                return ristorante.getId();
            }
        }
        return null;
    }
}
