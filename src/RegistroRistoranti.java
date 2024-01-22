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
}
