package progetto;

import progetto.prodotti.Prodotti;

import java.util.ArrayList;
import java.util.List;

public class Ordine {

    private Integer id;
    private static Integer counter = 1;
    private Cliente cliente;
    private List<Prodotti> portateList;

    private Double prezzo;

    private boolean completed;

    public Ordine(Cliente cliente) {
        this.cliente = cliente;
        this.portateList = new ArrayList<>();
        this.id = counter;
        this.completed = false;
        this.prezzo = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Prodotti> getPortateList() {
        return portateList;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getCounter() {
        return counter;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void addPortateToOrdine(Prodotti prodotti){
        portateList.add(prodotti);
    }

    public void removePortateFromOrdine(Prodotti prodotti){
        portateList.remove(prodotti);
    }

    public void calcolaPrezzoOrdine() {
        for (Prodotti prodotti : portateList) {
            prezzo += prodotti.getPrezzo();
        }
        System.out.println(prezzo);
    }
    public void stampaOrdine(){
        System.out.println(MessaggiEnum.CLIENTE.getMessaggio() + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.TRATTINO.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + id + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.TRATTINO.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere() + cliente.getNome() + CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.TRATTINO.getCarattere() +
                CaratteriSpeEnum.SPAZIO.getCarattere());
        for(Prodotti prodotti : portateList){
            prodotti.stampaDettagli();
        }
        stampaStatoOrdine();

    }

    public void stampaStatoOrdine(){
        if(!isCompleted()){
            System.out.println(MessaggiEnum.RICEVUTO.getMessaggio());
        } else if(isCompleted()){
            System.out.println(MessaggiEnum.COMPLETATO.getMessaggio());
        }
    }


    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", portateList=" + portateList +
                ", prezzo=" + prezzo +
                ", completed=" + completed +
                '}';
    }
}
