package progetto;

public enum CaratteriSpeEnum {
    ASTERISCO("*"),
    TRATTINO("-"),
    SPAZIO(" "),
    DUEPUNTI(":"),
    VIRGOLA(","),
    EURO("€"),
    APRIPARENTESI("("),
    CHIUDIPARENTESI(")"),
    LINEA("|");


    private String carattere;

    CaratteriSpeEnum(String carattere) {
        this.carattere = carattere;
    }
    public String getCarattere() {
        return carattere;
    }
}
