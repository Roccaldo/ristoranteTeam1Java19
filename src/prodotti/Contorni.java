package prodotti;

public class Contorni extends Prodotti {

    private PortataEnum portata;
    public Contorni(PortataEnum portata,String nomePiatto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = portata;
    }
}
