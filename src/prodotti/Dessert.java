package prodotti;

import java.util.ArrayList;

public class Dessert extends Prodotti{

    private PortataEnum portata;
    private CalorieEnum livelloCalorie;

    //Costruttore
    public Dessert(String nomePiatto,CalorieEnum livelloCalorie, Double prezzo) {
        super(nomePiatto, prezzo);
        this.portata= PortataEnum.DESSERT;
        this.livelloCalorie= livelloCalorie;
    }

    public Dessert(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni, CalorieEnum livelloCalorie) {
        super(nomePiatto, prezzo, allergeni);
        this.portata= PortataEnum.DESSERT;
        this.livelloCalorie= livelloCalorie;
    }

    //Getter e Setter
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

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        System.out.print("\u001B[35m");
        super.stampaDettagli();
        System.out.print("Livello di calorie: " + livelloCalorie.getLivelloCalorie());
        System.out.println("\u001B[0m ");
    }
}
