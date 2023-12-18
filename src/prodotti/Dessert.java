package prodotti;

public class Dessert extends Prodotti{

    private PortataEnum portata;
    private CalorieEnum livelloCalorie;
    public Dessert(String nomePiatto,CalorieEnum livelloCalorie, Double prezzo,PortataEnum portata) {
        super(nomePiatto, prezzo);
        this.portata= PortataEnum.DESSERT;
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

    //TODO stessa cosa
}
