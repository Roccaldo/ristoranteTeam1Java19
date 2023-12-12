import prodotti.Prodotti;

import java.util.ArrayList;
import java.util.List;

public class Menu {
   private List<Prodotti> menuCarne = new ArrayList<>();
   private List<Prodotti> menuPesce = new ArrayList<>();
   private List<Prodotti> menuVegano = new ArrayList<>();
   private List<Prodotti> menuDessert = new ArrayList<>();
   private List<Prodotti> menuContorni = new ArrayList<>();
   public Menu(){

   }

   public List<Prodotti> getMenuCarne() {
      return menuCarne;
   }
   public List<Prodotti> getMenuPesce() {
      return menuPesce;
   }

   public List<Prodotti> getMenuVegano() {
      return menuVegano;
   }

   public List<Prodotti> getMenuDessert() {
      return menuDessert;
   }

   public List<Prodotti> getMenuContorni() {
      return menuContorni;
   }

   public void stampaMenuCarne() {
      System.out.println("MENU DI CARNE");
      for(Prodotti prodotto: menuCarne) {
         prodotto.stampaDettagli();
      }
   }
   public void stampaMenuVegano() {
      System.out.println("MENU VEGANO");
      for(Prodotti prodotto: menuVegano) {
         prodotto.stampaDettagli();
      }
      stampaMenuContorni();
   }
   public void stampaMenuPesce() {
      System.out.println("MENU PESCE");
      for(Prodotti prodotto: menuPesce) {
         prodotto.stampaDettagli();
      }
   }
   public void stampaMenuDessert() {
      System.out.println("MENU DESSERT");
      for(Prodotti prodotto: menuDessert) {
         prodotto.stampaDettagli();
      }
   }
   public void stampaMenuContorni() {
      System.out.println("MENU CONTORNI");
      for(Prodotti prodotto: menuContorni) {
         prodotto.stampaDettagli();
      }
   }
}
