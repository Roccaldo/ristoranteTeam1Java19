package prodotti;

import java.util.ArrayList;

public class Secondi extends Prodotti{
    private TipoCotturaEnum tipoCottura;

    //Costruttore
    public Secondi(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, TipoCotturaEnum tipoCottura) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.tipoCottura = tipoCottura;
    }

    //Getter e Setter
    public TipoCotturaEnum getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(TipoCotturaEnum tipoCottura) {
        this.tipoCottura = tipoCottura;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print("Tipo di cottura: " + tipoCottura.getTipoCottura());
        System.out.println();
    }
}
