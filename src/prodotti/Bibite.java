package prodotti;

import java.util.ArrayList;

public class Bibite extends Prodotti {
    private boolean isAlcholic;

    //Costruttore
    public Bibite(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, boolean isAlcholic) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.isAlcholic = isAlcholic;
    }

    //Getter e Setter
    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }
    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        if (isAlcholic) {
            System.out.println(MessaggiProdottiEnum.ALCOLICO.getMessaggioEnum());
        } else {
            System.out.println(MessaggiProdottiEnum.ANALCOLICO.getMessaggioEnum());
        }
    }
}
