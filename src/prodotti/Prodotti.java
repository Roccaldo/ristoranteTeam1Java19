package prodotti;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Prodotti {
    private String nomePiatto;

    private Double prezzo;

    private PortataEnum portata;

    private ArrayList<AllergeniEnum> allergeni;

    //Costruttore
    public Prodotti(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni) {
        this.nomePiatto = nomePiatto;
        this.prezzo = prezzo;
        this.portata = portata;
        this.allergeni = allergeni;
    }

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

    public void setAllergeni(ArrayList<AllergeniEnum> allergeni) {
        this.allergeni = allergeni;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }

    private void addAllergeni(AllergeniEnum allergeniEnum) {
        allergeni.add(allergeniEnum);
    }
    private void rimuoviAllergeni(AllergeniEnum allergeniEnum) {
        allergeni.remove(allergeniEnum);
    }

    //Metodo stampa dettagli dei piatti
    public void stampaDettagli() {
        System.out.println(nomePiatto + ": " + " €" + prezzo + " | ");
        if (getAllergeni() != null && !getAllergeni().isEmpty()) {
            System.out.println(MessaggiProdottiEnum.ALLERGENI.getMessaggioEnum() + (": ") + stampaAllergeni() + " | ");
        }
    }

    public StringBuilder stampaAllergeni() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (AllergeniEnum allergeniEnum : allergeni) {
            stringBuilder.append(allergeniEnum.stampaDescrizione());
            stringBuilder.append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(")");
        return stringBuilder;
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
