package prodotti;

public class Pizza extends Prodotti {
    private String tipoImpasto;
    public Pizza(String portata, String nomePiatto, String tipoImpasto, Double prezzo) {
        super(portata, nomePiatto, prezzo);
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
