package prodotti;

public enum TipoEnum {
    CARNE ("Carne", "\u001B[31m"),
    PESCE ("Pesce", "\u001B[31m"),
    VEGANO ("Vegano", "\u001B[31m"),
    PIZZA ("Picca", "\u001B[31m"),
    BIBITE ("Bibite", "\u001B[31m");

    private final String tipoMenu;

    //TODO sistemare
    TipoEnum(String tipoMenu, String s) {
        this.tipoMenu = tipoMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}
