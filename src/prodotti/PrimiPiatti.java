package prodotti;

import java.util.ArrayList;

public class PrimiPiatti extends Prodotti{

    private String tipoPasta;
    private PortataEnum portata;
    public PrimiPiatti(String nomePiatto, Double prezzo, String tipoPasta) {
        super(nomePiatto, prezzo);
        this.portata = PortataEnum.PRIMOPIATTO;
        this.tipoPasta = tipoPasta;
    }

    public PrimiPiatti(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni, String tipoPasta) {
        super(nomePiatto, prezzo, allergeni);
        this.portata = PortataEnum.PRIMOPIATTO;
        this.tipoPasta = tipoPasta;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    //TODO metodo che stampa e possiamo fare uno in overloaded che prende anche il coloro
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Tipo di pasta: " + tipoPasta);
    }
}
