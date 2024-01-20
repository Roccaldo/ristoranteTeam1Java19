import prodotti.*;

import java.util.ArrayList;
import java.util.Objects;

public class Menu {

   private String nomeMenu;

   private ArrayList<Prodotti> menu = new ArrayList<>();

   private TipoEnum tipoMenu;

   // Costruttore
   public Menu(String nomeMenu, TipoEnum tipoMenu) {
      this.nomeMenu = nomeMenu;
      this.tipoMenu = tipoMenu;
   }

   /**
    *
    * @return il nome del menu
    */
   // Getter e Sette
   public String getNomeMenu() {
      return nomeMenu;
   }


   public void setNomeMenu(String nomeMenu) {
      this.nomeMenu = nomeMenu;
   }

   public ArrayList<Prodotti> getMenu() {
      return menu;
   }

   public TipoEnum getTipoMenu() {
      return tipoMenu;
   }

   public void setTipoMenu(TipoEnum tipoMenu) {
      this.tipoMenu = tipoMenu;
   }

   //Metodo StampaMenu
   public void stampaMenu() {
      System.out.println(" ");
      System.out.println("Menù " + getNomeMenu() + " (" + tipoMenu.getTipoMenu() + ")");

      //Colore
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
      for (Prodotti prodotti : menu) {
         if (prodotti.getPortata().equals(portataEnum)) {
            contenuto = true;
            break;
         }
      } if (contenuto) {
         System.out.println(portataEnum.getPortata());
         for (Prodotti prodotti : menu) {
            if (prodotti.getPortata().equals(portataEnum)) {
               prodotti.stampaDettagli();
            }
         }
      }
   }

   //Metodo Aggiungi piatto al menu
   public void aggiungiPiatto (Prodotti prodotto) {
      if (menu.contains(prodotto)) {
         throw new RuntimeException(MessaggiEnum.PRODOTTOPRESENTE.getMessaggio());
      } else {
         menu.add(prodotto);
      }
   }

   //Metodo Rimuovi piatto al menu
   public void rimuoviPiatto (Prodotti prodotto) {
      if (menu.contains(prodotto)) {
         menu.remove(prodotto);
         System.out.println(MessaggiEnum.PRODOTTORIMOSSO);
      } else {
         throw new RuntimeException(MessaggiEnum.PRODOTTONONPRESENTE.getMessaggio());
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Menu menu1 = (Menu) o;
      return Objects.equals(nomeMenu, menu1.nomeMenu) && Objects.equals(menu, menu1.menu) && tipoMenu == menu1.tipoMenu;
   }

   @Override
   public int hashCode() {
      return Objects.hash(nomeMenu, menu, tipoMenu);
   }
}


