package prodotti;

public enum TipoMenuEnum {
    CARNE ("Carne"),
    PESCE ("Pesce"),
    VEGANO ("Vegano"),
    CONTORNI ("Contorni"),
    DESSERT ("Dessert"),
    PIZZA ("Picca"),
    BIBITE ("Bibite");

    private final String tipoMenu;

    TipoMenuEnum(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}
