package prodotti;

public abstract class Prodotti {

    //TODO non si capisce dal nome cos'è, siamo su prodotti per c'è scritto portata unifichiamo? bravo Roccaldo !
    private String nomePiatto;

    private Double prezzo;

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

    @Override
    public String toString() {
        return "prodotti.Prodotti{" +
                ", nomePiatto='" + nomePiatto + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }


    //TODO come facciamo a stampare i field del prodotto? stampaDettagli
}
