package progetto.prodotti;

import java.util.ArrayList;

public class Contorni extends Prodotti {

    //Costruttore
    public Contorni(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni) {
        super(nomePiatto, prezzo, portata, allergeni);
    }

    /**
     *
     */
    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println();
    }
}
