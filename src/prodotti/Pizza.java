package prodotti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza extends Prodotti {

    private PortataEnum portata;
    private String tipoImpasto;
    private List<String> ingredienti;

    //Costruttore
    public Pizza(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni, String tipoImpasto, String... ingredienti) {
        super(nomePiatto, prezzo, allergeni);
        this.tipoImpasto = tipoImpasto;
        this.portata = PortataEnum.PIZZA;
        this.ingredienti= Arrays.asList(ingredienti);

    }

    //Getter e Setter
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

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        System.out.print("\u001B[31m");
        super.stampaDettagli();
        System.out.print("Tipo di impasto: " + tipoImpasto + " ");
        System.out.print("Ingredienti: " + ingredienti.toString());
        System.out.println("\u001B[0m ");
    }
}
