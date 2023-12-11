package prodotti;

public class Pizza extends Prodotti {
    private String tipoImpasto;

    public Pizza(String nomePiatto, String tipoImpasto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
    }

    public String getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(String tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }
}
