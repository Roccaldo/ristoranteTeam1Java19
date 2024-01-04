import prodotti.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

   private String nomeMenu;

   //TODO si può usare un set e rifattorizzare menu
   private List<Prodotti> menu = new ArrayList<>();

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

   public List<Prodotti> getMenu() {
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
      System.out.println("Menù " + getNomeMenu() + " (" + getTipoMenu() + ")");
      for (Prodotti prodotti : menu) {
            prodotti.stampaDettagli();
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
}
