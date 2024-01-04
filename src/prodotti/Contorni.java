package prodotti;

import java.util.ArrayList;

public class Contorni extends Prodotti {

    private PortataEnum portata;

    //Costruttore
    public Contorni(String nomePiatto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = PortataEnum.CONTORNO;
    }

    public Contorni(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni) {
        super(nomePiatto, prezzo, allergeni);
        this.portata = PortataEnum.CONTORNO;
    }

    //Getter e Setter
    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }


    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        System.out.print("\u001B[33m");
        super.stampaDettagli();
        System.out.println("\u001B[0m ");
    }
}
