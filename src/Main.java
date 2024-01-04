import prodotti.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Creazione di un ristorante
        Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5");
        System.out.println(ristorante);
        System.out.println();

        //Creazione delle portate
        Antipasti antipastoCarne1 = new Antipasti("Ravioli cinesi al vapore", 3.50, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)));
        Antipasti antipastoCarne2 = new Antipasti("Cornetti salati", 1.50,new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI)));
        PrimiPiatti primoPiattoCarne1 = new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), "Classica");
        PrimiPiatti primoPiattoCarne2 = new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), "Integrale");
        Secondi secondoCarne1 = new Secondi("Pollo alla campagnola", TipoCotturaEnum.BEN_COTTA, 10.0);
        Secondi secondoCarne2 = new Secondi("Tagliata di manzo", TipoCotturaEnum.AL_SANGUE, 18.0);
        Contorni contornoCarne1 = new Contorni("Patate fritte", 1.50);
        Contorni contornoCarne2 = new Contorni("Insalata di rucola, pere, grana e noci",5.00);
        Dessert dessertCarne1 = new Dessert("Cheesecake di yogurt alle fragole", CalorieEnum.MEDIO, 12.99);
        Dessert dessertCarne2 = new Dessert("Crostata al limone meringata", CalorieEnum.ALTO, 9.99);
        Antipasti antipastoPesce1 = new Antipasti("Antipasto di mare", 4.50,new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI,AllergeniEnum.MOLLUSCHI)));
        Antipasti antipastoPesce2 = new Antipasti("Pepata di cozze", 6.40);
        PrimiPiatti primoPiattoPesce1 = new PrimiPiatti("Spaghetti allo scoglio", 14.0,new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI,AllergeniEnum.MOLLUSCHI)), "Classica");
        PrimiPiatti primoPiattoPesce2 = new PrimiPiatti("Linguine all'astice", 9.0,new ArrayList<>(Arrays.asList(AllergeniEnum.CROSTACEI)), "Classica");
        Secondi secondoPesce1 = new Secondi("Salmone croccante", TipoCotturaEnum.STANDARD, 18.0);
        Secondi secondoPesce2 = new Secondi("Polpettine di tonno e ricotta", TipoCotturaEnum.STANDARD, 18.0);
        Contorni contornoPesce1 = new Contorni("Insalata semplice", 1.50);
        Contorni contornoPesce2 = new Contorni("Insalata nizzarda",6.00);
        Dessert dessertPesce1 = new Dessert("Tiramisù",CalorieEnum.ALTO,5.00);
        Dessert dessertPesce2 = new Dessert("Torta tenerina", CalorieEnum.MEDIO,5.00);
        Antipasti antipastoVegano1 = new Antipasti("Insalata di ceci", 4.50);
        Antipasti antipastoVegano2 = new Antipasti("Falafel", 6.40);
        PrimiPiatti primoPiattoVegano1 = new PrimiPiatti("Carbonara Vegana", 11.0, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)), "Integrale");
        PrimiPiatti primoPiattoVegano2 = new PrimiPiatti("Lasagna vegana", 11.0, "Riso");
        Secondi secondoVegano1 = new Secondi("Strudel salato",TipoCotturaEnum.STANDARD, 18.0);
        Secondi secondoVegano2 = new Secondi("Seitan alla piastra", TipoCotturaEnum.STANDARD, 18.0);
        Contorni contornoVegano1 = new Contorni("Finocchi gratinati in padella",2.50);
        Contorni contornoVegano2 = new Contorni("Carciofi in insalata",4.00);
        Dessert dessertVegano1 = new Dessert("Tronchetti vegani di banana al cioccolato fondente", CalorieEnum.MEDIO, 7.99);
        Dessert dessertVegano2 = new Dessert("Frutta alle spezie vegano", CalorieEnum.BASSO, 6.99);
        Pizza pizza1 = new Pizza("Margherita", "Integrale", 4.50,"Pomodoro,Mozzarella");
        Pizza pizza2 = new Pizza("Crudaiola", "Normale", 4.50,"Pomodoro, Mozzarella, Prosciutto Crudo");
        Pizza pizza3 = new Pizza("Vegetariana", "Normale", 5.00,"Pomodoro, Mozzarella, Zucchine, Peperoni");
        Bibite bibita1 = new Bibite("Coca cola", false, 1.50);
        Bibite bibita2 = new Bibite("Fanta", false, 2.00);
        Bibite bibita3 = new Bibite("Birra", true, 2.50);
        Bibite bibita4 = new Bibite("Vino bianco", true, 14.50);
        Bibite bibita5 = new Bibite("Vino Rosso", true, 14.50);

        //crea menu
        Menu menuCarne = new Menu("Monte", TipoMenuEnum.CARNE);
        Menu menuPesce = new Menu("Mare", TipoMenuEnum.PESCE);
        Menu menuVegano = new Menu("Amici della natura", TipoMenuEnum.VEGANO);
        Menu menuPizza = new Menu("Pizza", TipoMenuEnum.PIZZA);
        Menu menuBibite = new Menu("Bibite", TipoMenuEnum.BIBITE);


        // Aggiunta piatti menu carne
        menuCarne.aggiungiPiatto(antipastoCarne1);
        menuCarne.aggiungiPiatto(antipastoCarne2);
        menuCarne.aggiungiPiatto(primoPiattoCarne1);
        menuCarne.aggiungiPiatto(primoPiattoCarne2);
        menuCarne.aggiungiPiatto(secondoCarne1);
        menuCarne.aggiungiPiatto(secondoCarne2);
        menuCarne.aggiungiPiatto(contornoCarne1);
        menuCarne.aggiungiPiatto(contornoCarne2);
        menuCarne.aggiungiPiatto(dessertCarne1);
        menuCarne.aggiungiPiatto(dessertCarne2);

        // Aggiunta piatti menu pesce
        menuPesce.aggiungiPiatto(antipastoPesce1);
        menuPesce.aggiungiPiatto(antipastoPesce2);
        menuPesce.aggiungiPiatto(primoPiattoPesce1);
        menuPesce.aggiungiPiatto(primoPiattoPesce2);
        menuPesce.aggiungiPiatto(secondoPesce1);
        menuPesce.aggiungiPiatto(secondoPesce2);
        menuPesce.aggiungiPiatto(contornoPesce1);
        menuPesce.aggiungiPiatto(contornoPesce2);
        menuPesce.aggiungiPiatto(dessertPesce1);
        menuPesce.aggiungiPiatto(dessertPesce2);

        // Aggiunta piatti menu vegano
        menuVegano.aggiungiPiatto(antipastoVegano1);
        menuVegano.aggiungiPiatto(antipastoVegano2);
        menuVegano.aggiungiPiatto(primoPiattoVegano1);
        menuVegano.aggiungiPiatto(primoPiattoVegano2);
        menuVegano.aggiungiPiatto(secondoVegano1);
        menuVegano.aggiungiPiatto(secondoVegano2);
        menuVegano.aggiungiPiatto(contornoVegano1);
        menuVegano.aggiungiPiatto(contornoVegano2);
        menuVegano.aggiungiPiatto(dessertVegano1);
        menuVegano.aggiungiPiatto(dessertVegano2);

        // Aggiunta piatti menu pizza
        menuPizza.aggiungiPiatto(pizza1);
        menuPizza.aggiungiPiatto(pizza2);
        menuPizza.aggiungiPiatto(pizza3);
        
        // Aggiunta piatti menu bibite
        menuBibite.aggiungiPiatto(bibita1);
        menuBibite.aggiungiPiatto(bibita2);
        menuBibite.aggiungiPiatto(bibita3);
        menuBibite.aggiungiPiatto(bibita4);
        menuBibite.aggiungiPiatto(bibita5);



        //add menù al ristorante
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
        menuPizza.stampaMenu();
        System.out.println();
        menuBibite.stampaMenu();
        System.out.println();


    }
}