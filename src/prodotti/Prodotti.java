package prodotti;

public abstract class Prodotti {

    private String nomePiatto;

    private Double prezzo;

    //TODO qui ci va portata enum field

    public Prodotti(String nomePiatto, Double prezzo) {
        this.nomePiatto = nomePiatto;
        this.prezzo = prezzo;
    }

    public String getNomePiatto() {
        return nomePiatto;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }


    //TODO cercare su google come inserire colori Ansi per stampare le portate
    public void stampaDettagli() {
        System.out.println(nomePiatto + ": " + " €" + prezzo);
    }

    @Override
    public String toString() {
        return "prodotti.Prodotti{" +
                ", nomePiatto='" + nomePiatto + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
