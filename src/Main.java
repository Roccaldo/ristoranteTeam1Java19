import prodotti.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        //TODO create le portate, create i menu, add portate menu, add menu al ristorante

        //TODO creare la classe ristrorante e spostare questa logica li dentro
        Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5");
        System.out.println(ristorante);
        System.out.println();

        //crea menu
        Menu menuCarne = new Menu("Monte", TipoMenuEnum.CARNE);
        Menu menuPesce = new Menu("Mare", TipoMenuEnum.PESCE);
        Menu menuVegano = new Menu("Amici della natura", TipoMenuEnum.VEGANO);
        Menu menuPizza = new Menu("Pizza", TipoMenuEnum.PIZZA);
        Menu menuBibite = new Menu("Bibite", TipoMenuEnum.BIBITE);


        //menu carne
        menuCarne.aggiungiPiatto((new Antipasti("Ravioli cinesi al vapore", 3.50, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)))));
        menuCarne.aggiungiPiatto((new Antipasti("Cornetti salati", 1.50,new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI)))));

        menuCarne.aggiungiPiatto((new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), "Classica")));
        menuCarne.aggiungiPiatto((new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), "Integrale")));

        menuCarne.aggiungiPiatto((new Secondi("Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0)));
        menuCarne.aggiungiPiatto((new Secondi("Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0)));


        //menu pesce
        menuPesce.aggiungiPiatto((new Antipasti("Antipasto di mare", 4.50,new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI,AllergeniEnum.MOLLUSCHI)))));
        menuPesce.aggiungiPiatto((new Antipasti("Pepata di cozze", 6.40)));

        menuPesce.aggiungiPiatto((new PrimiPiatti("Spaghetti allo scoglio", 14.0,new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI,AllergeniEnum.MOLLUSCHI)), "Classica")));
        menuPesce.aggiungiPiatto((new PrimiPiatti("Linguine all'astice", 9.0,new ArrayList<>(Arrays.asList(AllergeniEnum.CROSTACEI)), "Classica")));

        menuPesce.aggiungiPiatto((new Secondi("Salmone croccante", TipoCotturaEnum.STANDARD, 18.0)));
        menuPesce.aggiungiPiatto((new Secondi("Polpettine di tonno e ricotta", TipoCotturaEnum.STANDARD, 18.0)));

        //menu vegano
        menuVegano.aggiungiPiatto((new Antipasti("Insalata di ceci", 4.50)));
        menuVegano.aggiungiPiatto((new Antipasti("Falafel", 6.40)));

        menuVegano.aggiungiPiatto((new PrimiPiatti("Carbonara Vegana", 11.0, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)), "Integrale")));
        menuVegano.aggiungiPiatto((new PrimiPiatti("Lasagna vegana", 11.0, "Riso")));

        menuVegano.aggiungiPiatto((new Secondi("Strudel salato",TipoCotturaEnum.STANDARD, 18.0)));
        menuVegano.aggiungiPiatto((new Secondi("Seitan alla piastra", TipoCotturaEnum.STANDARD, 18.0)));

        //menu contorni
        menuContorni.aggiungiPiatto((new Contorni("Patate fritte", 1.50)));
        menuContorni.aggiungiPiatto((new Contorni("Insalata", 1.50)));

        //menu dessert
        menuDessert.aggiungiPiatto((new Dessert("Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99)));
        menuDessert.aggiungiPiatto((new Dessert("Crostata al limone meringata", CalorieEnum.ALTO, 9.99)));

        menuDessert.aggiungiPiatto((new Dessert("Tronchetti vegani di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99)));
        menuDessert.aggiungiPiatto((new Dessert("Frutta alle spezie vegano", CalorieEnum.BASSO, 6.99)));

        //menu pizza
        menuPizza.aggiungiPiatto(new Pizza("Margherita", "Integrale", 4.50,"Pomodoro,Mozzarella"));
        menuPizza.aggiungiPiatto(new Pizza("Crudaiola", "Normale", 4.50,"Pomodoro, Mozzarella, Prosciutto Crudo"));
        menuPizza.aggiungiPiatto(new Pizza("Vegetariana", "Normale", 5.00,"Pomodoro, Mozzarella, Zucchine, Peperoni"));
        
        //menu bibite
        menuBibite.aggiungiPiatto(new Bibite("Coca cola", false, 1.50));
        menuBibite.aggiungiPiatto(new Bibite("Fanta", false, 2.00));
        menuBibite.aggiungiPiatto(new Bibite("Birra", true, 2.50));
        menuBibite.aggiungiPiatto(new Bibite("Vino bianco", true, 14.50));
        menuBibite.aggiungiPiatto(new Bibite("Vino Rosso", true, 14.50));



        //TODO dividere i due enumerati uno per il tipo menu e uno per il tipo portata
        //TODO tutta la logica deve stare in ristorante come avevte fatto con portate e menu
       // ristorenate.stampaMenues();
       // ristorante.stampaMenues(TipoMenuEnum.CARNE);

        //TODO questo deve essere in ristorante
        //stampa menu
        menuCarne.stampaMenu();
        System.out.println();
        menuPesce.stampaMenu();
        System.out.println();
        menuVegano.stampaMenu();
        System.out.println();
        menuContorni.stampaMenu();
        System.out.println();
        menuDessert.stampaMenu();
        System.out.println();
        menuPizza.stampaMenu();
        System.out.println();
        menuBibite.stampaMenu();
        System.out.println();

        //metodo aggiungi e rimuovi piatti
        menuCarne.aggiungiPiatto(new Antipasti("Ravioli cinesi al vapore", 3.50));
        menuCarne.rimuoviPiatto(new Antipasti("Ravioli cinesi al vapore", 3.50));
        System.out.println();
        menuCarne.stampaMenu();
    }
}