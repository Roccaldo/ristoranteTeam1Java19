public abstract class Prodotti {

    public String portata;

    public String nomePiatto;

    public Double prezzo;

    public Prodotti(){};

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
        return "Prodotti{" +
                "portata='" + portata + '\'' +
                ", nomePiatto='" + nomePiatto + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
