package prodotti;

import java.util.ArrayList;

public class Secondi extends Prodotti{
    private PortataEnum portata;
    private TipoCotturaEnum tipoCottura;

    //TODO sistemare
    public Secondi (String nomePiatto, TipoCotturaEnum tipoCottura, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = PortataEnum.SECONDOPIATTO;
        this.tipoCottura = tipoCottura;
    }

    public Secondi(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni, TipoCotturaEnum tipoCottura) {
        super(nomePiatto, prezzo, allergeni);
        this.portata = PortataEnum.SECONDOPIATTO;
        this.tipoCottura = tipoCottura;
    }

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

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print("Tipo di cottura: " + tipoCottura.getTipoCottura());
        System.out.println(" ");
    }
}
