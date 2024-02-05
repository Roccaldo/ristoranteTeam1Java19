package progetto;

import progetto.prodotti.PortataEnum;
import progetto.prodotti.Prodotti;
import progetto.prodotti.TipoEnum;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private String nomeMenu;

    private ArrayList<Prodotti> portateList = new ArrayList<>();

    private TipoEnum tipoMenu;

    // Costruttore
    public Menu(String nomeMenu, TipoEnum tipoMenu) {
        this.nomeMenu = nomeMenu;
        this.tipoMenu = tipoMenu;
    }

    /**
     * @return il nome del menu
     */
    // Getter e Setter
    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public ArrayList<Prodotti> getPortateList() {
        return portateList;
    }

    public void setPortateList(ArrayList<Prodotti> portateList) {
        this.portateList = portateList;
    }

    public TipoEnum getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(TipoEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    //Metodo StampaMenu
    public void stampaMenu() {
        System.out.println(CaratteriSpeEnum.SPAZIO.getCarattere());
        System.out.println(MessaggiEnum.MENU.getMessaggio() + CaratteriSpeEnum.SPAZIO.getCarattere() + getNomeMenu() +
                CaratteriSpeEnum.APRIPARENTESI.getCarattere() +
                tipoMenu.getTipoMenu() + CaratteriSpeEnum.CHIUDIPARENTESI.getCarattere());
        //Colore e mettere il testo del enum
        System.out.print(tipoMenu.getColore());
        stampaSeContenuto(PortataEnum.ANTIPASTO);
        stampaSeContenuto(PortataEnum.PRIMOPIATTO);
        stampaSeContenuto(PortataEnum.SECONDOPIATTO);
        stampaSeContenuto(PortataEnum.CONTORNO);
        stampaSeContenuto(PortataEnum.DESSERT);
        stampaSeContenuto(PortataEnum.BIBITE);
        stampaSeContenuto(PortataEnum.PIZZA);
        //Tolgo colore
        System.out.println("\u001B[0m");
    }

    //Metodo che differenzia le portate all'interno della stampa e le mette in lista
    public void stampaSeContenuto(PortataEnum portataEnum) {
        boolean contenuto = false;
        for (Prodotti prodotti : portateList) {
            if (prodotti.getPortata().equals(portataEnum)) {
                contenuto = true;
                break;
            }
        }
        if (contenuto) {
            System.out.println(portataEnum.getPortata());
            for (Prodotti prodotti : portateList) {
                if (prodotti.getPortata().equals(portataEnum)) {
                    prodotti.stampaDettagli();
                }
            }
            System.out.println();
        }
    }

    //Metodo Aggiungi piatto al menu
    public void aggiungiPiatto(Prodotti prodotto) throws InvalidObjectException {
        if (portateList.contains(prodotto)) {
            throw new InvalidObjectException(MessaggiEnum.PRODOTTOPRESENTE.getMessaggio());
        } else {
            portateList.add(prodotto);
        }
    }

    //Metodo Rimuovi piatto al menu
    public void rimuoviPiatto(Prodotti prodotto) throws InvalidObjectException {
        if (portateList.contains(prodotto)) {
            portateList.remove(prodotto);
            System.out.println(MessaggiEnum.PRODOTTORIMOSSO.getMessaggio());
        } else {
            throw new InvalidObjectException(MessaggiEnum.PRODOTTONONPRESENTE.getMessaggio());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu1 = (Menu) o;
        return Objects.equals(nomeMenu, menu1.nomeMenu) && Objects.equals(portateList, menu1.portateList) && tipoMenu == menu1.tipoMenu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeMenu, portateList, tipoMenu);
    }
}


