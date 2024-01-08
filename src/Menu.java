import prodotti.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {

   private String nomeMenu;

   private ArrayList<Prodotti> menu = new ArrayList<>();

   private TipoMenuEnum tipoMenu;

   // Costruttore
   public Menu(String nomeMenu, TipoMenuEnum tipoMenu) {
      this.nomeMenu = nomeMenu;
      this.tipoMenu = tipoMenu;
   }

   // Getter e Setter
   public String getNomeMenu() {
      return nomeMenu;
   }

   public void setNomeMenu(String nomeMenu) {
      this.nomeMenu = nomeMenu;
   }

   public ArrayList<Prodotti> getMenu() {
      return menu;
   }

   public TipoMenuEnum getTipoMenu() {
      return tipoMenu;
   }

   public void setTipoMenu(TipoMenuEnum tipoMenu) {
      this.tipoMenu = tipoMenu;
   }

   //Metodo StampaMenu
   public void stampaMenu() {
      System.out.println("Menù " + getNomeMenu() + " (" + tipoMenu.getTipoMenu() + ")");
      stampaSeContenuto(PortataEnum.ANTIPASTO);
      stampaSeContenuto(PortataEnum.PRIMOPIATTO);
      stampaSeContenuto(PortataEnum.SECONDOPIATTO);
      stampaSeContenuto(PortataEnum.CONTORNO);
      stampaSeContenuto(PortataEnum.DESSERT);
      stampaSeContenuto(PortataEnum.BIBITE);
      stampaSeContenuto(PortataEnum.PIZZA);
      System.out.println(" ");
   }

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
         System.out.println("prodotto già presente nel menù");
      } else {
         menu.add(prodotto);
         System.out.println("prodotto aggiunto correttamente");
      }
   }

   //Metodo Rimuovi piatto al menu
   public void rimuoviPiatto (Prodotti prodotto) {
      if (menu.contains(prodotto)) {
         menu.remove(prodotto);
         System.out.println("prodotto rimosso correttamente");
      } else {
         System.out.println("prodotto non presente nel menù");
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


