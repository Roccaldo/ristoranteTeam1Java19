import prodotti.TipoEnum;

public class Cliente {

    private String cognome;
    private Integer numeroPersone;
    private TipoEnum menuPreferito;

    public Cliente(String cognome, Integer numeroPersone, TipoEnum menuPreferito) {
        this.cognome = cognome;
        this.numeroPersone = numeroPersone;
        this.menuPreferito = menuPreferito;
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
        System.out.println("Cliente: " + cognome + " - " + "Coperti: " +  numeroPersone);
    }

    //Metodo per stampare i ristoranti che contengono il tipo di menu preferito del cliente
    public void ristorantiConsigliati(RegistroRistoranti registro) {
        System.out.print("Ristoranti consigliati: ");
        for(Ristorante ristorante : registro.getRistorantiList()) {

            for(Menu menu : ristorante.getMenues()) {

                if(menu.getTipoMenu().getTipoMenu().equals(menuPreferito.getTipoMenu())) {
                    System.out.print(ristorante.getNome() + " | ");
                    break;
                }
            }
        }
        System.out.println();
    }

}
