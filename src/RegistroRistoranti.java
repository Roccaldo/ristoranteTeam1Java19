import java.util.ArrayList;

public class RegistroRistoranti {
    ArrayList<Ristorante> ristorantiList;

    public RegistroRistoranti() {
        this.ristorantiList = new ArrayList<>();
    }

    public ArrayList<Ristorante> getRistorantiList() {
        return ristorantiList;
    }

    //Aggiunge un ristorante al registro
    public void addRistorante(Ristorante ristorante) {
        if(!ristorantiList.contains(ristorante)) {
            ristorantiList.add(ristorante);

        } else {
            throw new RuntimeException(MessaggiEnum.RISTORANTEPRESENTE.getMessaggio());
        }
    }

    //Rimuove un ristorante dal registro
    public void removeAnimalList(Ristorante ristorante) {
        if(ristorantiList.contains(ristorante)) {
            ristorantiList.remove(ristorante);

        } else {
            throw new RuntimeException(MessaggiEnum.RISTORANTENONPRESENTE.getMessaggio());
        }
    }


}
