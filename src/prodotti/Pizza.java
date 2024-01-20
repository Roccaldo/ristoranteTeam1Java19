package prodotti;

import java.util.ArrayList;


public class Pizza extends Prodotti {
    private String tipoImpasto;
    private ArrayList<String> ingredienti;

    //Costruttore
    public Pizza(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, String tipoImpasto, ArrayList<String> ingredienti) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.tipoImpasto = tipoImpasto;
        this.ingredienti = ingredienti;
    }

    //Getter e Setter
    public String getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(String tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print("Tipo di impasto: " + tipoImpasto + " ");
        System.out.print("Ingredienti: " + ingredienti.toString());
        System.out.println();
    }
}
