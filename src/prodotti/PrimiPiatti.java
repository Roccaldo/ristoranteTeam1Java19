package prodotti;

import java.util.ArrayList;

public class PrimiPiatti extends Prodotti{

    private String tipoPasta;

    //Costruttore

    public PrimiPiatti(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, String tipoPasta) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.tipoPasta = tipoPasta;
    }

    //Getter e Setter
    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print("Tipo di pasta: " + tipoPasta);
        System.out.println();
    }

}
