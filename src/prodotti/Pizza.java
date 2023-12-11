package prodotti;

public class Pizza extends Prodotti {
    private String tipoImpasto;

    public Pizza(String nomePiatto, Double prezzo, String tipoImpasto) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
    }

    @Override
    public Double getPrezzo() {
        return super.getPrezzo();
    }

    @Override
    public void setNomePiatto(String nomePiatto) {
        super.setNomePiatto(nomePiatto);
    }
}
