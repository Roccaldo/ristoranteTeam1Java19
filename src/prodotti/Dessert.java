package prodotti;

import java.util.ArrayList;

public class Dessert extends Prodotti{
    private CalorieEnum livelloCalorie;

    //Costruttore
    public Dessert(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni, CalorieEnum livelloCalorie) {
        
        super(nomePiatto, prezzo, portata, allergeni);
        this.livelloCalorie = livelloCalorie;
    }

    //Getter e Setter
    public CalorieEnum getLivelloCalorie() {
        return livelloCalorie;
    }

    public void setLivelloCalorie(CalorieEnum livelloCalorie) {
        this.livelloCalorie = livelloCalorie;
    }

    //Metodo Stampa dettagli portata
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.print(MessaggiProdottiEnum.CALORIE.getMessaggioEnum() + (": ") + livelloCalorie.getLivelloCalorie());
        System.out.println();
    }
}
