package prodotti;

public enum TipoMenuEnum {
    CARNE ("Carne"),
    PESCE ("Pesce"),
    VEGANO ("Vegano");
    
    private final String tipoMenu;

    TipoMenuEnum(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}
