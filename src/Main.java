import prodotti.*;

public class Main {
    public static void main(String[] args) {
        Secondi secondo1 = new Secondi(PortataEnum.SECONDOPIATTO, "Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0);
        Secondi secondo2 = new Secondi(PortataEnum.SECONDOPIATTO, "Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0);
        Secondi secondo3 = new Secondi(PortataEnum.SECONDOPIATTO, "Coniglio alla cacciatora", TipoCotturaEnum.BEN_COTTA, 14.0);
        Secondi secondo4 = new Secondi(PortataEnum.SECONDOPIATTO, "Cotoletta alla milanese", TipoCotturaEnum.BEN_COTTA, 9.0);
        Secondi secondo5 = new Secondi(PortataEnum.SECONDOPIATTO, "Spezzatino di agnello con patate", TipoCotturaEnum.BEN_COTTA, 11.0);

        Dessert dessert1= new Dessert(PortataEnum.DESSERT, "Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99);
        Dessert dessert2= new Dessert(PortataEnum.DESSERT, "Crostata al limone meringata", CalorieEnum.ALTO, 9.99);
        Dessert dessert3= new Dessert(PortataEnum.DESSERT, "Crostatine alla nocciola e vaniglia", CalorieEnum.ALTO, 10.99);
        Dessert dessert4= new Dessert(PortataEnum.DESSERT, "Mousse ai frutti di bosco", CalorieEnum.BASSO, 13.49);
        Dessert dessert5= new Dessert(PortataEnum.DESSERT, "Torta al forno aromatizzata al limone", CalorieEnum.BASSO, 9.99);
        Dessert dessertVegano1= new Dessert(PortataEnum.DESSERT, "Budino di riso al latte di mandorle", CalorieEnum.BASSO, 14.99);
        Dessert dessertVegano2= new Dessert(PortataEnum.DESSERT,"Tronchetti di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99);
        Dessert dessertVegano3= new Dessert(PortataEnum.DESSERT,"Frutta alle spezie", CalorieEnum.BASSO, 6.99);
        Dessert dessertVegano4= new Dessert(PortataEnum.DESSERT,"Pere affogate", CalorieEnum.ALTO, 8.99);
        Dessert dessertVegano5= new Dessert(PortataEnum.DESSERT,"Mousse di cioccolato all'acqua", CalorieEnum.MEDIO,10.99);


        Menu menuCarne = new Menu();

        menuCarne.getMenuCarne().add(secondo1);
        menuCarne.getMenuCarne().add(secondo2);
        menuCarne.getMenuCarne().add(secondo3);
        menuCarne.getMenuCarne().add(secondo4);
        menuCarne.getMenuCarne().add(secondo5);

        menuCarne.getMenuCarne().add(dessert1);
        menuCarne.getMenuCarne().add(dessert2);
        menuCarne.getMenuCarne().add(dessert3);
        menuCarne.getMenuCarne().add(dessert4);
        menuCarne.getMenuCarne().add(dessert5);
        menuCarne.getMenuCarne().add(dessertVegano1);
        menuCarne.getMenuCarne().add(dessertVegano2);
        menuCarne.getMenuCarne().add(dessertVegano3);
        menuCarne.getMenuCarne().add(dessertVegano4);
        menuCarne.getMenuCarne().add(dessertVegano5);

        menuCarne.stampaMenuCarne();

        Menu menuVegano = new Menu();

        menuVegano.getMenuVegano().add(dessertVegano1);
        menuVegano.getMenuVegano().add(dessertVegano2);
        menuVegano.getMenuVegano().add(dessertVegano3);
        menuVegano.getMenuVegano().add(dessertVegano4);
        menuVegano.getMenuVegano().add(dessertVegano5);

        menuVegano.stampaMenuVegano();
    }
}
