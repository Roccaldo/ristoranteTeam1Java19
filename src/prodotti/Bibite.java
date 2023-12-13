package prodotti;

public class Bibite extends Prodotti {

    //TODO il modificatore di accesso
    boolean isAlcholic;
    public Bibite(String nomePiatto, boolean isAlcholic, Double prezzo) {
        super(nomePiatto, prezzo);
        this.isAlcholic = isAlcholic;
    }

    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }


    //TODO stampare le bibite, abbiamo un metodo da incrementare con i nuovi fields
}
