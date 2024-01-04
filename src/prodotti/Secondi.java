package prodotti;

import java.util.ArrayList;

public class Secondi extends Prodotti{
    private PortataEnum portata;
    private TipoCotturaEnum tipoCottura;

    //Costruttore
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
        System.out.print("\u001B[32m");
        super.stampaDettagli();
        System.out.print("Tipo di cottura: " + tipoCottura.getTipoCottura());
        System.out.println("\u001B[0m ");
    }
}
