package prodotti;

import java.util.ArrayList;

public class Bibite extends Prodotti {

    private PortataEnum portata;
    private boolean isAlcholic;

    //Costruttore
    public Bibite(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni, boolean isAlcholic) {
        super(nomePiatto, prezzo, allergeni);
        this.isAlcholic = isAlcholic;
        this.portata = PortataEnum.BIBITE;
    }

    //Getter e Setter
    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        System.out.print("\u001B[30m");
        super.stampaDettagli();
        if (isAlcholic) {
            System.out.println("Alcolico");
        } else {
            System.out.println("Analcolico");
        }
        System.out.print("\u001B[0m");
    }

}
