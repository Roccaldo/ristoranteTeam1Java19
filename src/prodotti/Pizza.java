package prodotti;

import java.util.ArrayList;


public class Pizza extends Prodotti {
    private TipoImpastoEnum tipoImpasto;
    private ArrayList<IngredientiPizzaEnum> ingredienti;

    //Costruttore
    public Pizza(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, TipoImpastoEnum tipoImpasto, ArrayList<IngredientiPizzaEnum> ingredienti) {
        super(nomePiatto, prezzo, portata, allergeni);
        this.tipoImpasto = tipoImpasto;
        this.ingredienti = ingredienti;
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
        System.out.println(MessaggiProdottiEnum.IMPASTO.getMessaggioEnum() + (CaratteriSpeEnum.DUEPUNTI.getCarattere()) +
                CaratteriSpeEnum.SPAZIO.getCarattere() + tipoImpasto.getTipoImpastoEnum());
        System.out.print(MessaggiProdottiEnum.INGREDIENTI.getMessaggioEnum() + (CaratteriSpeEnum.DUEPUNTI.getCarattere()) +
                CaratteriSpeEnum.SPAZIO.getCarattere() + stampaIngredienti());
        System.out.println();
    }

    public StringBuilder stampaIngredienti() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CaratteriSpeEnum.APRIPARENTESI.getCarattere());
        for (IngredientiPizzaEnum ingredientiPizzaEnum : ingredienti) {
            stringBuilder.append(ingredientiPizzaEnum.stampaDescrizione());
            stringBuilder.append(CaratteriSpeEnum.VIRGOLA.getCarattere());
            stringBuilder.append(CaratteriSpeEnum.SPAZIO.getCarattere());

        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(CaratteriSpeEnum.CHIUDIPARENTESI.getCarattere());
        return stringBuilder;
    }

    private void addIngredienti(IngredientiPizzaEnum ingredientiPizzaEnum) {
        ingredienti.add(ingredientiPizzaEnum);
    }
    private void rimuoviIngredienti(IngredientiPizzaEnum ingredientiPizzaEnum) {
        ingredienti.remove(ingredientiPizzaEnum);
    }
}
