public class Cliente {

    //TODO inserire il tipo :Carnivoro, Veg, Lucano
    private String cognome;
    private Integer numeroPersone;

    public Cliente(String cognome, Integer numeroPersone) {
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


    //Metodo stampa dettagli del cliente
    public void dettagliCliente(){
        System.out.print("Cliente:" + cognome + " - " + "Coperti:" +  numeroPersone);
    }
}
