package progetto.prodotti;

public enum IngredientiPizzaEnum {
    POMODORO("Pomodoro"),
    MOZZARELLA("Mozzarella"),
    BASILICO("Basilico"),
    CRUDO("Prosciutto crudo"),
    PEPERONI("Peperoni"),
    ZUCCHINE("Zucchine");

    private final String IngredientiPizzaEnum;

    IngredientiPizzaEnum(String ingredientiPizzaEnum) {
        this.IngredientiPizzaEnum = ingredientiPizzaEnum;
    }

    public String getIngredientiPizzaEnum() {
        return IngredientiPizzaEnum;
    }

    public String stampaDescrizione(){
        return IngredientiPizzaEnum;
    }
}
