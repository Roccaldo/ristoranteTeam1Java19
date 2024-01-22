package progetto.prodotti;

public enum TipoCotturaEnum {
    AL_SANGUE("Al sangue"),
    BEN_COTTA("Ben cotta"),
    STANDARD("Standard");

    private String tipoCottura;

    TipoCotturaEnum(String tipoCottura) {
        this.tipoCottura = tipoCottura;
    }

    public String getTipoCottura() {
        return tipoCottura;
    }
}
