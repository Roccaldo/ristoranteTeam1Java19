package prodotti;

public enum TipoDiPastaEnum {

    GRANO("Grano"),
    RISO("Riso"),
    SENZAGLUTINE("Senza glutine"),
    INTEGRALE("Integrale");

    private final String tipoDiPastaEnum;

    TipoDiPastaEnum(String tipoDiPastaEnum) {
        this.tipoDiPastaEnum = tipoDiPastaEnum;
    }

    public String getTipoDiPastaEnum() {
        return tipoDiPastaEnum;
    }
}
