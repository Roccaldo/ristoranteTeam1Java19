package progetto;

public enum VotoEnum {

    UNO("Uno"),
    DUE("Due"),
    TRE("Tre"),
    QUATTRO("Quattro"),
    CINQUE("Cinque");

    private String votoEnum;

    VotoEnum(String votoEnum) {
        this.votoEnum = votoEnum;
    }

    public String getVotoEnum() {
        return votoEnum;
    }
}
