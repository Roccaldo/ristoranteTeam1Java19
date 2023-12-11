package prodotti;

public class Dessert extends Prodotti{

    private PortataEnum portata;
    public Dessert(PortataEnum portata,String nomePiatto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = portata;
    }

}
