import prodotti.*;

public class Main {
    public static void main(String[] args) {

        //TODO creare la classe ristrorante e spostare questa logica li dentro
        //crea menu
        Menu menuCarne = new Menu();
        Menu menuPesce = new Menu();
        Menu menuVegano = new Menu();
        Menu menuDessert = new Menu();
        Menu menuContorni = new Menu();

        //menu carne
        menuCarne.getMenuCarne().add(new Antipasti("Ravioli cinesi al vapore", 3.50,PortataEnum.ANTIPASTO));
        menuCarne.getMenuCarne().add(new Antipasti("Cornetti salati", 1.50,PortataEnum.ANTIPASTO ));

        menuCarne.getMenuCarne().add(new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76,(PortataEnum.PRIMOPIATTO));
        menuCarne.getMenuCarne().add(new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30,PortataEnum.PRIMOPIATTO));

        menuCarne.getMenuCarne().add(new Secondi("Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0, PortataEnum.SECONDOPIATTO));
        menuCarne.getMenuCarne().add( new Secondi("Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0, PortataEnum.SECONDOPIATTO));



        //menu pesce
        menuPesce.getMenuPesce().add(new Antipasti("Antipasto di mare", 4.50,PortataEnum.ANTIPASTO));
        menuPesce.getMenuPesce().add(new Antipasti("Pepata di cozze", 6.40,PortataEnum.ANTIPASTO));

        menuPesce.getMenuPesce().add(new PrimiPiatti("Spaghetti allo scoglio", 14.0,PortataEnum.PRIMOPIATTO));
        menuPesce.getMenuPesce().add(new PrimiPiatti("Linguine all'astice", 9.0,PortataEnum.PRIMOPIATTO));

        menuPesce.getMenuPesce().add( new Secondi("Salmone croccante", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));
        menuPesce.getMenuPesce().add( new Secondi( "Polpettine di tonno e ricotta", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));

        //menu vegano
        menuVegano.getMenuVegano().add(new Antipasti( "Insalata di ceci", 4.50,PortataEnum.ANTIPASTO));
        menuVegano.getMenuVegano().add(new Antipasti( "Falafel", 6.40,PortataEnum.ANTIPASTO));

        menuVegano.getMenuVegano().add(new PrimiPiatti( "Carbonara Vegana", 11.0, PortataEnum.PRIMOPIATTO));
        menuVegano.getMenuVegano().add(new PrimiPiatti( "Lasagna vegana", 11.0,PortataEnum.PRIMOPIATTO));

        menuVegano.getMenuVegano().add( new Secondi("Strudel salato", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));
        menuVegano.getMenuVegano().add( new Secondi( "Seitan alla piastra", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));

        //menu contorni
        menuContorni.getMenuContorni().add(new Contorni("Patate fritte", 1.50,PortataEnum.CONTORNO));
        menuContorni.getMenuContorni().add(new Contorni("Insalata", 1.50,PortataEnum.CONTORNO));

        //menu dessert
        menuDessert.getMenuDessert().add(new Dessert("Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99,(PortataEnum.DESSERT));
        menuDessert.getMenuDessert().add(new Dessert( "Crostata al limone meringata", CalorieEnum.ALTO, 9.99,PortataEnum.DESSERT));
        menuDessert.getMenuDessert().add(new Dessert("Tronchetti vegani di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99,PortataEnum.DESSERT));
        menuDessert.getMenuDessert().add(new Dessert("Frutta alle spezie vegano", CalorieEnum.BASSO, 6.99,PortataEnum.DESSERT));

        //stampa
        menuCarne.stampaMenuCarne();
        menuPesce.stampaMenuPesce();
        menuVegano.stampaMenuVegano();
        menuContorni.stampaMenuContorni();
        menuDessert.stampaMenuDessert();
    }
}