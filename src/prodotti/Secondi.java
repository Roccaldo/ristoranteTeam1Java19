package prodotti;

public class Secondi extends Prodotti{
    private PortataEnum portata;
    private TipoCotturaEnum tipoCottura;

    public Secondi(PortataEnum portata, String nomePiatto, TipoCotturaEnum tipoCottura, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = portata;
        this.tipoCottura = tipoCottura;
    }
}
