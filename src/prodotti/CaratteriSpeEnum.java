package prodotti;

public enum CaratteriSpeEnum {
    ASTERISCO("*"),
    TRATTINO("-"),
    SPAZIO(" "),
    DUEPUNTI(":"),
    VIRGOLA(","),
    EURO("€"),
    APRIPARENTESI("("),
    CHIUDIPARENTESI(")");


    private String carattere;

    CaratteriSpeEnum(String carattere) {
        this.carattere = carattere;
    }
    public String getCarattere() {
        return carattere;
    }
}
