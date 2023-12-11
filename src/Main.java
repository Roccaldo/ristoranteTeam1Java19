import prodotti.PortataEnum;
import prodotti.Secondi;
import prodotti.TipoCotturaEnum;

public class Main {
    public static void main(String[] args) {
        Secondi secondo1 = new Secondi(PortataEnum.SECONDOPIATTO, "Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0);
        Secondi secondo2 = new Secondi(PortataEnum.SECONDOPIATTO, "Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0);
        Secondi secondo3 = new Secondi(PortataEnum.SECONDOPIATTO, "Coniglio alla cacciatora", TipoCotturaEnum.BEN_COTTA, 14.0);
        Secondi secondo4 = new Secondi(PortataEnum.SECONDOPIATTO, "Cotoletta alla milanese", TipoCotturaEnum.BEN_COTTA, 9.0);
        Secondi secondo5 = new Secondi(PortataEnum.SECONDOPIATTO, "Spezzatino di agnello con patate", TipoCotturaEnum.BEN_COTTA, 11.0);

        Menu menuCarne = new Menu();
        menuCarne.getMenuCarne().add(secondo1);
        menuCarne.getMenuCarne().add(secondo2);
        menuCarne.getMenuCarne().add(secondo3);
        menuCarne.getMenuCarne().add(secondo4);
        menuCarne.getMenuCarne().add(secondo5);
        menuCarne.stampaMenuCarne();
    }
}
