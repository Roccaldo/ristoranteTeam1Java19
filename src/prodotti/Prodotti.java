package prodotti;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Prodotti {
    private String nomePiatto;

    private Double prezzo;

    private PortataEnum portata;

    //TODO tutti i field s'inizializzano dentro il costruttore
    private ArrayList<AllergeniEnum> allergeni;


    //Costruttore
    public Prodotti(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni) {
        this.nomePiatto = nomePiatto;
        this.prezzo = prezzo;
        this.portata = portata;
        this.allergeni = allergeni;
    }

    private void addAllergenico(AllergeniEnum allergeniEnum) {
        allergeni.add(allergeniEnum);
    }

    //TODO anche per remove

    //Getter e Setter
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

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    //Metodo stampa dettagli dei piatti
    public void stampaDettagli() {
        System.out.print(nomePiatto + ": " + " €" + prezzo + " | ");
        if (getAllergeni() != null && !getAllergeni().isEmpty()) {
            //TODO il to string fa un po schifo per stampare, quindi si solito si fa un metodo che può essere creato anche nell'enum
            //FOReach e poi si stampa la descizione e non l'enum in maiscolo
            System.out.print("Allergeni presenti: " + allergeni + " | ");
        }
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
