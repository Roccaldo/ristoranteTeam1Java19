public class Cliente {

    //TODO inserire il tipo :Carnivoro, Veg, Lucano
    private String cognome;
    private int numeroPersone;

    public Cliente(String cognome, int numeroPersone) {
        this.cognome = cognome;
        this.numeroPersone = numeroPersone;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    //TODO stampare info
}
