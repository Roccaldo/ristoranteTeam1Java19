package prodotti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza extends Prodotti {

    private PortataEnum portata;
    private String tipoImpasto;

    private AllergeniEnum allergeni;
    private List<String> ingredienti;

    public Pizza(String nomePiatto, String tipoImpasto, Double prezzo,String... ingredienti ) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
        this.portata = PortataEnum.PIZZA;
        this.ingredienti = Arrays.asList(ingredienti);
    }

    public Pizza(String nomePiatto, String tipoImpasto, Double prezzo, AllergeniEnum allergeni, String... ingredienti) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
        this.portata = PortataEnum.PIZZA;
        this.allergeni = allergeni;
        this.ingredienti= Arrays.asList(ingredienti);

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

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void stampaDettagli() {
        System.out.print("\u001B[31m");
        super.stampaDettagli();
        System.out.print("Tipo di impasto: " + tipoImpasto + " ");
        System.out.print("Ingredienti: " + ingredienti.toString());
        System.out.println("\u001B[0m ");
    }
}
