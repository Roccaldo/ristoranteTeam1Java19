package prodotti;

public enum AllergeniEnum {
    CEREALI ("Cereali"),
    PESCE ("Pesce"),
    CROSTACEI ("Crostacei"),
    UOVA ("Uova"),
    ARACHIDI ("Arachidi"),
    SOIA ("Soia"),
    LATTE ("Latte"),
    FRUTTA_A_GUSCIO ("Frutta a guscio"),
    SENAPE ("Senape"),
    SEDANO ("Sedano"),
    ANIDRITE_SOLFOROSA ("Anidrite solforosa e solfiti"),
    LUPINI ("Lupini"),
    MOLLUSCHI ("Molluschi");

    private final String allergeni;

    AllergeniEnum(String allergeni) {
        this.allergeni = allergeni;
    }

    public String getAllergeni() {
        return allergeni;
    }
}
