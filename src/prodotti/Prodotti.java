package prodotti;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Prodotti {
    private String nomePiatto;

    private Double prezzo;

    private ArrayList<AllergeniEnum> allergeni = new ArrayList<>();

    //TODO qui ci va portata enum field

    public Prodotti(String nomePiatto, Double prezzo) {
        this.nomePiatto = nomePiatto;
        this.prezzo = prezzo;
    }

    public Prodotti(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni) {
        this.nomePiatto = nomePiatto;
        this.prezzo = prezzo;
        this.allergeni = allergeni;
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

    public ArrayList<AllergeniEnum> getAllergeni() {
        return allergeni;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotti prodotti = (Prodotti) o;
        return Objects.equals(nomePiatto, prodotti.nomePiatto) && Objects.equals(prezzo, prodotti.prezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePiatto, prezzo);
    }
}
