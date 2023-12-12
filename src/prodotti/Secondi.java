package prodotti;

public class Secondi extends Prodotti{
    private PortataEnum portata;
    private TipoCotturaEnum tipoCottura;

    public Secondi(PortataEnum portata, String nomePiatto, TipoCotturaEnum tipoCottura, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = portata;
        this.tipoCottura = tipoCottura;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    public TipoCotturaEnum getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(TipoCotturaEnum tipoCottura) {
        this.tipoCottura = tipoCottura;
    }
}
