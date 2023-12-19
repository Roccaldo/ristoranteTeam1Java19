import prodotti.Prodotti;
import prodotti.TipoMenuEnum;

import java.util.ArrayList;
import java.util.List;

public class Menu {

   //TODO inserire i field per menu, quindi creare un tipomenuenum e poi il nome città come field
   private List<Prodotti> menu = new ArrayList<>();

   private TipoMenuEnum tipoMenu;

   public Menu(){

   }

   public Menu(TipoMenuEnum tipoMenu) {
      this.tipoMenu = tipoMenu;
   }

   //TODO fare u metodo che fa add e remove


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
      System.out.println("MENU DI CARNE");
      for (Prodotti prodotto : menuCarne) {
         prodotto.stampaDettagli();
      }
   }


}
