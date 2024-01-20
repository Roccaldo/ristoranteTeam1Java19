package prodotti;

public enum TipoEnum {
    //Rosso
    CARNE("Carne", "\u001B[31m"),
    //Blu
    PESCE("Pesce", "\u001B[34m"),
    //Verde
    VEGANO("Vegano", "\u001B[32m"),
    //Giallo
    PIZZA("Picca", "\u001B[33m"),
    //Ciano
    BIBITE("Bibite", "\u001B[36m");

    private final String tipoMenu;

    private final String colore;

    TipoEnum(String tipoMenu, String colore) {
        this.tipoMenu = tipoMenu;
        this.colore = colore;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public String getColore() {
        return colore;
    }
}
