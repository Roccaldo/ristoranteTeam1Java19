package prodotti;

public class Dessert extends Prodotti{

    private PortataEnum portata;
    private CalorieEnum livelloCalorie;
    public Dessert(PortataEnum portata,String nomePiatto,CalorieEnum livelloCalorie, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata= portata;
        this.livelloCalorie= livelloCalorie;
    }

}
