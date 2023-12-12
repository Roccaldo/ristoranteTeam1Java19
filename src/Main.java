import prodotti.*;

public class Main {
    public static void main(String[] args) {
        //crea menu
        Menu menuCarne = new Menu();
        Menu menuPesce = new Menu();
        Menu menuVegano = new Menu();
        Menu menuDessert = new Menu();
        Menu menuContorni = new Menu();

        //menu carne
        menuCarne.getMenuCarne().add(new Antipasti(PortataEnum.ANTIPASTO, "Ravioli cinesi al vapore", 3.50));
        menuCarne.getMenuCarne().add(new Antipasti(PortataEnum.ANTIPASTO, "Cornetti salati", 1.50));

        menuCarne.getMenuCarne().add(new PrimiPiatti(PortataEnum.PRIMOPIATTO,"Pappardelle al ragù di cinghiale", 14.76));
        menuCarne.getMenuCarne().add(new PrimiPiatti(PortataEnum.PRIMOPIATTO,"Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30));

        menuCarne.getMenuCarne().add(new Secondi(PortataEnum.SECONDOPIATTO, "Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0));
        menuCarne.getMenuCarne().add( new Secondi(PortataEnum.SECONDOPIATTO, "Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0));



        //menu pesce
        menuPesce.getMenuPesce().add(new Antipasti(PortataEnum.ANTIPASTO, "Antipasto di mare", 4.50));
        menuPesce.getMenuPesce().add(new Antipasti(PortataEnum.ANTIPASTO, "Pepata di cozze", 6.40));

        menuPesce.getMenuPesce().add(new PrimiPiatti(PortataEnum.PRIMOPIATTO, "Spaghetti allo scoglio", 14.0));
        menuPesce.getMenuPesce().add(new PrimiPiatti(PortataEnum.PRIMOPIATTO, "Linguine all'astice", 9.0));

        menuPesce.getMenuPesce().add( new Secondi(PortataEnum.SECONDOPIATTO, "Salmone croccante", TipoCotturaEnum.STANDARD, 18.0));
        menuPesce.getMenuPesce().add( new Secondi(PortataEnum.SECONDOPIATTO, "Polpettine di tonno e ricotta", TipoCotturaEnum.STANDARD, 18.0));

        //menu vegano
        menuVegano.getMenuVegano().add(new Antipasti(PortataEnum.ANTIPASTO, "Insalata di ceci", 4.50));
        menuVegano.getMenuVegano().add(new Antipasti(PortataEnum.ANTIPASTO, "Falafel", 6.40));

        menuVegano.getMenuVegano().add(new PrimiPiatti(PortataEnum.PRIMOPIATTO, "Carbonara Vegana", 11.0));
        menuVegano.getMenuVegano().add(new PrimiPiatti(PortataEnum.PRIMOPIATTO, "Lasagna vegana", 11.0));

        menuVegano.getMenuVegano().add( new Secondi(PortataEnum.SECONDOPIATTO, "Strudel salato", TipoCotturaEnum.STANDARD, 18.0));
        menuVegano.getMenuVegano().add( new Secondi(PortataEnum.SECONDOPIATTO, "Seitan alla piastra", TipoCotturaEnum.STANDARD, 18.0));

        //menu contorni
        menuContorni.getMenuContorni().add(new Contorni(PortataEnum.CONTORNO, "Patate fritte", 1.50));
        menuContorni.getMenuContorni().add(new Contorni(PortataEnum.CONTORNO, "Insalata", 1.50));

        //menu dessert
        menuDessert.getMenuDessert().add(new Dessert(PortataEnum.DESSERT, "Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99));
        menuDessert.getMenuDessert().add(new Dessert(PortataEnum.DESSERT, "Crostata al limone meringata", CalorieEnum.ALTO, 9.99));
        menuDessert.getMenuDessert().add(new Dessert(PortataEnum.DESSERT,"Tronchetti vegani di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99));
        menuDessert.getMenuDessert().add(new Dessert(PortataEnum.DESSERT,"Frutta alle spezie vegano", CalorieEnum.BASSO, 6.99));

        //stampa
        menuCarne.stampaMenuCarne();
        menuPesce.stampaMenuPesce();
        menuVegano.stampaMenuVegano();
        menuContorni.stampaMenuContorni();
        menuDessert.stampaMenuDessert();
    }
}