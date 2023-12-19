import prodotti.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

   private String nomeMenu;

   private List<Prodotti> menu = new ArrayList<>();

   private TipoMenuEnum tipoMenu;

   public Menu(String nomeMenu, TipoMenuEnum tipoMenu) {
      this.nomeMenu = nomeMenu;
      this.tipoMenu = tipoMenu;
   }

   public String getNomeMenu() {
      return nomeMenu;
   }

   public void setNomeMenu(String nomeMenu) {
      this.nomeMenu = nomeMenu;
   }

   public List<Prodotti> getMenu() {
      return menu;
   }

   public TipoMenuEnum getTipoMenu() {
      return tipoMenu;
   }

   public void setTipoMenu(TipoMenuEnum tipoMenu) {
      this.tipoMenu = tipoMenu;
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
