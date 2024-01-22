package progetto.prodotti;

public enum TipoImpastoEnum {

    NORMALE("Normale"),
    INTEGRALE("Integrale"),
    SENZAGLUTINE("Senza glutine");

    private final String tipoImpastoEnum;

    TipoImpastoEnum(String tipoImpastoEnum) {
        this.tipoImpastoEnum = tipoImpastoEnum;
    }

    public String getTipoImpastoEnum() {
        return tipoImpastoEnum;
    }
}
