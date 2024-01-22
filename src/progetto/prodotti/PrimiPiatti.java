package progetto.prodotti;

import java.util.ArrayList;

public class PrimiPiatti extends Prodotti {

    private TipoDiPastaEnum tipoPasta;

    //Costruttore
    public PrimiPiatti(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, TipoDiPastaEnum tipoPasta) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.tipoPasta = tipoPasta;
    }

    //Getter e Setter


    public TipoDiPastaEnum getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(TipoDiPastaEnum tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print(MessaggiProdottiEnum.TIPOLOGIA.getMessaggioEnum() + (": ") + tipoPasta.getTipoDiPastaEnum());
        System.out.println();
    }

}
