package prodotti;

public enum StatoRistoranteEnum {
    APERTO ("Aperto"),
    CHIUSO ("Chiuso");

    private final String stato;

    public String getStato() {
        return stato;
    }

    StatoRistoranteEnum(String statoRistorante) {
        this.stato = statoRistorante;
    }
}
