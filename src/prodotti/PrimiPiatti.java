package prodotti;

public class PrimiPiatti extends Prodotti{

    private PortataEnum portata;
    public PrimiPiatti(PortataEnum portata,String nomePiatto, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata = portata;
    }
}
