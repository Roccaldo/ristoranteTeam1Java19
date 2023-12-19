import prodotti.*;

public class Main {
    public static void main(String[] args) {

        //TODO creare la classe ristrorante e spostare questa logica li dentro
        Ristorante ristorante = new Ristorante("Team Java19","Via Sparsi Per l' Italia, 5");
        System.out.println(ristorante);
        //crea menu
        Menu menuCarne = new Menu("Carne", TipoMenuEnum.CARNE);
        Menu menuPesce = new Menu("Pesce", TipoMenuEnum.PESCE);
        Menu menuVegano = new Menu("Vegano", TipoMenuEnum.VEGANO);
        Menu menuDessert = new Menu("Dessert", TipoMenuEnum.DESSERT);
        Menu menuContorni = new Menu("Contorni", TipoMenuEnum.CONTORNI);
        Menu menuPizza = new Menu("Pizza", TipoMenuEnum.PIZZA.PIZZA);

        //menu carne
        menuCarne.getMenu().add(new Antipasti("Ravioli cinesi al vapore", 3.50));
        menuCarne.getMenu().add(new Antipasti("Cornetti salati", 1.50));

        menuCarne.getMenu().add(new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76, "Classica"));
        menuCarne.getMenu().add(new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30, "Integrale"));

        menuCarne.getMenu().add(new Secondi("Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0));
        menuCarne.getMenu().add( new Secondi("Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0));



        //menu pesce
        menuPesce.getMenu().add(new Antipasti("Antipasto di mare", 4.50));
        menuPesce.getMenu().add(new Antipasti("Pepata di cozze", 6.40));

        menuPesce.getMenu().add(new PrimiPiatti("Spaghetti allo scoglio", 14.0, "Classica"));
        menuPesce.getMenu().add(new PrimiPiatti("Linguine all'astice", 9.0, "Classica"));

        menuPesce.getMenu().add( new Secondi("Salmone croccante", TipoCotturaEnum.STANDARD, 18.0));
        menuPesce.getMenu().add( new Secondi( "Polpettine di tonno e ricotta", TipoCotturaEnum.STANDARD, 18.0));

        //menu vegano
        menuVegano.getMenu().add(new Antipasti( "Insalata di ceci", 4.50));
        menuVegano.getMenu().add(new Antipasti( "Falafel", 6.40));

        menuVegano.getMenu().add(new PrimiPiatti( "Carbonara Vegana", 11.0, "Integrale"));
        menuVegano.getMenu().add(new PrimiPiatti( "Lasagna vegana", 11.0, "Riso"));

        menuVegano.getMenu().add( new Secondi("Strudel salato", TipoCotturaEnum.STANDARD, 18.0));
        menuVegano.getMenu().add( new Secondi( "Seitan alla piastra", TipoCotturaEnum.STANDARD, 18.0));

        //menu contorni
        menuContorni.getMenu().add(new Contorni("Patate fritte", 1.50));
        menuContorni.getMenu().add(new Contorni("Insalata", 1.50));

        //menu dessert
        menuDessert.getMenu().add(new Dessert("Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99));
        menuDessert.getMenu().add(new Dessert( "Crostata al limone meringata", CalorieEnum.ALTO, 9.99));
        menuDessert.getMenu().add(new Dessert("Tronchetti vegani di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99));
        menuDessert.getMenu().add(new Dessert("Frutta alle spezie vegano", CalorieEnum.BASSO, 6.99));

        //menu pizza
        menuPizza.aggiungiPiatto(new Pizza("Margherita", "Integrale", 4.50));
        menuPizza.aggiungiPiatto(new Pizza("Crudaiola", "Normale", 4.50));



        //stampa
        menuCarne.stampaMenu();
        menuPesce.stampaMenu();
        menuVegano.stampaMenu();
        menuContorni.stampaMenu();
        menuDessert.stampaMenu();

        //metodo aggiungi e rimuovi piatti
        menuCarne.aggiungiPiatto(new Antipasti("Ravioli cinesi al vapore", 3.50));
        menuCarne.rimuoviPiatto(new Antipasti("Ravioli cinesi al vapore", 3.50));
        menuCarne.stampaMenu();
    }
}