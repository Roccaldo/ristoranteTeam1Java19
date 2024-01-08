package prodotti;

import java.util.ArrayList;

public class Contorni extends Prodotti {

    private PortataEnum portata;

    //Costruttore
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
        super.stampaDettagli();
        System.out.println();
    }
}
