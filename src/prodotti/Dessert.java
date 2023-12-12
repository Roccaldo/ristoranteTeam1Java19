package prodotti;

public class Dessert extends Prodotti{

    private PortataEnum portata;
    private CalorieEnum livelloCalorie;
    public Dessert(PortataEnum portata,String nomePiatto,CalorieEnum livelloCalorie, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata= portata;
        this.livelloCalorie= livelloCalorie;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    public CalorieEnum getLivelloCalorie() {
        return livelloCalorie;
    }

    public void setLivelloCalorie(CalorieEnum livelloCalorie) {
        this.livelloCalorie = livelloCalorie;
    }
}
