package prodotti;

import java.util.ArrayList;

public class Secondi extends Prodotti{
    private PortataEnum portata;
    private TipoCotturaEnum tipoCottura;

    //Costruttore
    //TODO sistemare
    public Secondi(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni, TipoCotturaEnum tipoCottura) {
        super(nomePiatto, prezzo, allergeni);
        this.portata = PortataEnum.SECONDOPIATTO;
        this.tipoCottura = tipoCottura;
    }

    //Getter e Setter
    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

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
