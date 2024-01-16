import prodotti.TipoEnum;

public class Cliente {

    //TODO inserire il tipo :Carnivoro, Veg, Lucano
    private String cognome;
    private Integer numeroPersone;
    private TipoEnum menuPreferito;

    public Cliente(String cognome, Integer numeroPersone, TipoEnum menuPreferito) {
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

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public TipoEnum getMenuPreferito() {
        return menuPreferito;
    }

    public void setMenuPreferito(TipoEnum menuPreferito) {
        this.menuPreferito = menuPreferito;
    }

    //Metodo stampa dettagli del cliente
    public void dettagliCliente(){
        System.out.print("Cliente: " + cognome + " - " + "Coperti: " +  numeroPersone);
    }
}
