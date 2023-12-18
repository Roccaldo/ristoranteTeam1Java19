import prodotti.PortataEnum;
import prodotti.PrimiPiatti;
import prodotti.Prodotti;

import java.util.ArrayList;
import java.util.List;

public class Menu {

   private String nomeMenu;

   //TODO inserire i field per menu, quindi creare un tipomenuenum e poi il nome città come field
   private List<Prodotti> menu = new ArrayList<>();

   public Menu(String nomeMenu) {
      this.nomeMenu = nomeMenu;
   }
   //TODO fare u metodo che fa add e remove


   public String getNomeMenu() {
      return nomeMenu;
   }

   public void setNomeMenu(String nomeMenu) {
      this.nomeMenu = nomeMenu;
   }

   public List<Prodotti> getMenu() {
      return menu;
   }

   public void stampaMenu() {
      System.out.println("Menù " + getNomeMenu());
      for (Prodotti prodotti : menu) {
            prodotti.stampaDettagli();
      }
   }

   public void aggiungiPiatto (Prodotti prodotto) {
      if (menu.contains(prodotto)) {
         System.out.println("prodotto già presente nel menù");
      } else {
         menu.add(prodotto);
         System.out.println("prodotto aggiunto correttamente");
      }
   }

   public void rimuoviPiatto (Prodotti prodotto) {
      if (menu.contains(prodotto)) {
         menu.remove(prodotto);
         System.out.println("prodotto rimosso correttamente");
      } else {
         System.out.println("prodotto non presente nel menù");
      }
   }
}
