package prodotti;

public class Cliente {
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
}
