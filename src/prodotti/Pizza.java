package prodotti;

import java.util.ArrayList;

public class Pizza extends Prodotti {

    private PortataEnum portata;
    private String tipoImpasto;

    private AllergeniEnum allergeni;

    public Pizza(String nomePiatto, String tipoImpasto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
        this.portata = PortataEnum.PIZZA;
    }

    public Pizza(String nomePiatto, Double prezzo, AllergeniEnum allergeni, String tipoImpasto) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
        this.portata = PortataEnum.PIZZA;
        this.allergeni = allergeni;
    }


    public String getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(String tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    @Override
    public void stampaDettagli() {
        System.out.print("\u001B[31m");
        super.stampaDettagli();
        System.out.print("Tipo di impasto: " + tipoImpasto);
        System.out.println("\u001B[0m ");
    }
}
