package prodotti;

public class Bibite extends Prodotti {
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
}
