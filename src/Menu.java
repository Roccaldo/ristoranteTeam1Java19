import prodotti.Prodotti;

import java.util.ArrayList;
import java.util.List;

public class Menu {
   private List<Prodotti> menuCarne = new ArrayList<>();
   private List<Prodotti> menuPesce = new ArrayList<>();
   private List<Prodotti> menuVegano = new ArrayList<>();
   public Menu(){}

   public List<Prodotti> getMenuCarne() {
      return menuCarne;
   }

   public List<Prodotti> getMenuPesce() {
      return menuPesce;
   }

   public List<Prodotti> getMenuVegano() {
      return menuVegano;
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
   }


}
