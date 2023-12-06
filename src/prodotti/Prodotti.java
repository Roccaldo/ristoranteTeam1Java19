package prodotti;

public abstract class Prodotti {

    //TODO non si capisce dal nome cos'è, siamo su prodotti per c'è scritto portata unifichiamo? bravo Roccaldo !
    public String portata;

    public String nomePiatto;

    public Double prezzo;

    public Prodotti(String portata, String nomePiatto, Double prezzo) {
        this.portata = portata;
        this.nomePiatto = nomePiatto;
        this.prezzo = prezzo;
    }

    public String getPortata() {
        return portata;
    }

    public void setPortata(String portata) {
        this.portata = portata;
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
                "portata='" + portata + '\'' +
                ", nomePiatto='" + nomePiatto + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }


    //TODO come facciamo a stampare i field del prodotto? stampaDettagli
}
