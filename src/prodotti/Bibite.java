package prodotti;

public class Bibite extends Prodotti {

    //TODO il modificatore di accesso
    private PortataEnum portata;
    private boolean isAlcholic;
    public Bibite(String nomePiatto, boolean isAlcholic, Double prezzo) {
        super(nomePiatto, prezzo);
        this.isAlcholic = isAlcholic;
        this.portata = PortataEnum.BIBITE;
    }

    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }


    //TODO stampare le bibite, abbiamo un metodo da incrementare con i nuovi fields
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();

        if(isAlcholic) {
            System.out.println("Alcolico");
        } else {
            System.out.println("Analcolico");
        }
    }

}
