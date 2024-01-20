package prodotti;

public enum StatoRistoranteEnum {
    APERTO("Aperto"),
    CHIUSO("Chiuso");

    private final String stato;

    StatoRistoranteEnum(String statoRistorante) {
        this.stato = statoRistorante;
    }

    public String getStato() {
        return stato;
    }
}
