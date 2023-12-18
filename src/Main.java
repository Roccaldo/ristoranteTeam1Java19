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
        menuCarne.getMenu().add(new Antipasti("Ravioli cinesi al vapore", 3.50,PortataEnum.ANTIPASTO));
        menuCarne.getMenu().add(new Antipasti("Cornetti salati", 1.50,PortataEnum.ANTIPASTO ));

        menuCarne.getMenu().add(new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76,PortataEnum.PRIMOPIATTO,"Classica"));
        menuCarne.getMenu().add(new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30,PortataEnum.PRIMOPIATTO,"Integrale"));

        menuCarne.getMenu().add(new Secondi("Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0, PortataEnum.SECONDOPIATTO));
        menuCarne.getMenu().add( new Secondi("Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0, PortataEnum.SECONDOPIATTO));



        //menu pesce
        menuPesce.getMenu().add(new Antipasti("Antipasto di mare", 4.50,PortataEnum.ANTIPASTO));
        menuPesce.getMenu().add(new Antipasti("Pepata di cozze", 6.40,PortataEnum.ANTIPASTO));

        menuPesce.getMenu().add(new PrimiPiatti("Spaghetti allo scoglio", 14.0,PortataEnum.PRIMOPIATTO,"Classica"));
        menuPesce.getMenu().add(new PrimiPiatti("Linguine all'astice", 9.0,PortataEnum.PRIMOPIATTO,"Classica"));

        menuPesce.getMenu().add( new Secondi("Salmone croccante", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));
        menuPesce.getMenu().add( new Secondi( "Polpettine di tonno e ricotta", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));

        //menu vegano
        menuVegano.getMenu().add(new Antipasti( "Insalata di ceci", 4.50,PortataEnum.ANTIPASTO));
        menuVegano.getMenu().add(new Antipasti( "Falafel", 6.40,PortataEnum.ANTIPASTO));

        menuVegano.getMenu().add(new PrimiPiatti( "Carbonara Vegana", 11.0, PortataEnum.PRIMOPIATTO,"Integrale"));
        menuVegano.getMenu().add(new PrimiPiatti( "Lasagna vegana", 11.0,PortataEnum.PRIMOPIATTO,"Riso"));

        menuVegano.getMenu().add( new Secondi("Strudel salato", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));
        menuVegano.getMenu().add( new Secondi( "Seitan alla piastra", TipoCotturaEnum.STANDARD, 18.0,PortataEnum.SECONDOPIATTO));

        //menu contorni
        menuContorni.getMenu().add(new Contorni("Patate fritte", 1.50,PortataEnum.CONTORNO));
        menuContorni.getMenu().add(new Contorni("Insalata", 1.50,PortataEnum.CONTORNO));

        //menu dessert
        menuDessert.getMenu().add(new Dessert("Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99,(PortataEnum.DESSERT));
        menuDessert.getMenu().add(new Dessert( "Crostata al limone meringata", CalorieEnum.ALTO, 9.99,PortataEnum.DESSERT));
        menuDessert.getMenu().add(new Dessert("Tronchetti vegani di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99,PortataEnum.DESSERT));
        menuDessert.getMenu().add(new Dessert("Frutta alle spezie vegano", CalorieEnum.BASSO, 6.99,PortataEnum.DESSERT));

        //stampa
        menuCarne.stampaMenuCarne();
        menuPesce.stampaMenuPesce();
        menuVegano.stampaMenuVegano();
        menuContorni.stampaMenuContorni();
        menuDessert.stampaMenuDessert();
    }
}