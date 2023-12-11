package prodotti;

public enum CalorieEnum {
    BASSO("Basso"),
    MEDIO("Medio"),
    ALTO("Alto");

    private String livelloCalorie;

    CalorieEnum(String livelloCalorie) {
        this.livelloCalorie = livelloCalorie;
    }

    public String getLivelloCalorie() {
        return livelloCalorie;
    }
}
