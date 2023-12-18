package prodotti;

public class Pizza extends Prodotti {

    private PortataEnum portata;
    private String tipoImpasto;

    public Pizza(String nomePiatto, String tipoImpasto, Double prezzo, PortataEnum portata) {
        super(nomePiatto, prezzo);
        this.tipoImpasto = tipoImpasto;
        this.portata = PortataEnum.PIZZA;
    }

    public String getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(String tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    //TODO
}
