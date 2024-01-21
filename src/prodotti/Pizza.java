package prodotti;

import java.util.ArrayList;


public class Pizza extends Prodotti {
    private TipoImpastoEnum tipoImpasto;
    private ArrayList<IngredientiPizzaEnum> ingredienti;

    //Costruttore
    public Pizza(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, TipoImpastoEnum tipoImpasto, ArrayList<IngredientiPizzaEnum> ingredienti) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.tipoImpasto = tipoImpasto;
        this.ingredienti = new ArrayList<>();
    }

    //Getter e Setter
    public TipoImpastoEnum getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(TipoImpastoEnum tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }

    public ArrayList<IngredientiPizzaEnum> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<IngredientiPizzaEnum> ingredienti) {
        this.ingredienti = ingredienti;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print(MessaggiProdottiEnum.IMPASTO.getMessaggioEnum() + (": ") + tipoImpasto.getTipoImpastoEnum() + " ");
        System.out.print(MessaggiProdottiEnum.INGREDIENTI.getMessaggioEnum() + (": ") + stampaIngredienti());
        System.out.println();
    }

    public StringBuilder stampaIngredienti() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (IngredientiPizzaEnum ingredientiPizzaEnum : ingredienti) {
            stringBuilder.append(ingredientiPizzaEnum.stampaDescrizione());
            stringBuilder.append(" ");
        }
        stringBuilder.append(")");
        return stringBuilder;
    }

    private void addIngredienti(IngredientiPizzaEnum ingredientiPizzaEnum) {
        ingredienti.add(ingredientiPizzaEnum);
    }
    private void rimuoviIngredienti(IngredientiPizzaEnum ingredientiPizzaEnum) {
        ingredienti.remove(ingredientiPizzaEnum);
    }
}
