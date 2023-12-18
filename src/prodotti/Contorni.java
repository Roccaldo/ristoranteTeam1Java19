package prodotti;

public class Contorni extends Prodotti {

    private PortataEnum portata;
    public Contorni(String nomePiatto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = PortataEnum.CONTORNO;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    //TODO stessa cosa dell'altra classe

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        //TODO e gli altri field?
    }
}
