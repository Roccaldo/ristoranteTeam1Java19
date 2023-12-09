package prodotti;

public enum TipoDiMenuEnum {
    CARNE("Menù di Carne"),
    PESCE("Menù di Pesce"),
    VEGANO("Menù Vegano");
    private String tipoMenu;
    private TipoDiMenuEnum(String tipoMenu){
        this.tipoMenu = tipoMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}
