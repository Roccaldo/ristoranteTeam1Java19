import com.journaldev.design.template.ClientePattern;
import com.journaldev.design.template.InvitaAmico;
import com.journaldev.design.template.Prenota;
import com.journaldev.design.template.Recensione;
import prodotti.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            // Creazione di un ristorante
            Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5", 50);
            Ristorante ristorante2 = new Ristorante("La Perla", "Via il Molo, 7", 30);
            Ristorante ristorante3 = new Ristorante("Il Ghiottone", "Via Aldo moro, 9", 200);
            System.out.println(ristorante);
            System.out.println();

            //creazione prenotazioni
            OffsetDateTime date = OffsetDateTime.parse("2024-03-01T13:00:00Z");
            Prenotazione prenotazione1 = new Prenotazione("Agostino", 10, date);
            Prenotazione prenotazione2 = new Prenotazione("Roccaldo", 25, date);
            Prenotazione prenotazione3 = new Prenotazione("Chiara", 40, date);

            //Creazione delle portate
            Antipasti antipastoCarne1 = new Antipasti("Ravioli cinesi al vapore", 3.50, PortataEnum.ANTIPASTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)));
            Antipasti antipastoCarne2 = new Antipasti("Cornetti salati", 1.50, PortataEnum.ANTIPASTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI)));
            PrimiPiatti primoPiattoCarne1 = new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), "Classica");
            PrimiPiatti primoPiattoCarne2 = new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), "Integrale");
            Secondi secondoCarne1 = new Secondi("Pollo alla campagnola", 10.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.BEN_COTTA);
            Secondi secondoCarne2 = new Secondi("Tagliata di manzo", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.AL_SANGUE);
            Contorni contornoCarne1 = new Contorni("Patate fritte", 1.50, PortataEnum.CONTORNO, null);
            Contorni contornoCarne2 = new Contorni("Insalata di rucola, pere, grana e noci",5.00, PortataEnum.CONTORNO, null);
            Dessert dessertCarne1 = new Dessert("Cheesecake di yogurt alle fragole", 12.99, PortataEnum.DESSERT,null, CalorieEnum.MEDIO);
            Dessert dessertCarne2 = new Dessert("Crostata al limone meringata", 9.99, PortataEnum.DESSERT, null, CalorieEnum.ALTO);
            Antipasti antipastoPesce1 = new Antipasti("Antipasto di mare", 4.50, PortataEnum.ANTIPASTO, new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI,AllergeniEnum.MOLLUSCHI)));
            Antipasti antipastoPesce2 = new Antipasti("Pepata di cozze", 6.40, PortataEnum.ANTIPASTO, null);
            PrimiPiatti primoPiattoPesce1 = new PrimiPiatti("Spaghetti allo scoglio", 14.0, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI,AllergeniEnum.MOLLUSCHI)), "Classica");
            PrimiPiatti primoPiattoPesce2 = new PrimiPiatti("Linguine all'astice", 9.0, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CROSTACEI)), "Classica");
            Secondi secondoPesce1 = new Secondi("Salmone croccante", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Secondi secondoPesce2 = new Secondi("Polpettine di tonno e ricotta", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Contorni contornoPesce1 = new Contorni("Insalata semplice", 1.50, PortataEnum.CONTORNO,null);
            Contorni contornoPesce2 = new Contorni("Insalata nizzarda",6.00, PortataEnum.CONTORNO,null);
            Dessert dessertPesce1 = new Dessert("Tiramisù",5.00, PortataEnum.DESSERT, null, CalorieEnum.ALTO);
            Dessert dessertPesce2 = new Dessert("Torta tenerina",5.00, PortataEnum.DESSERT, null, CalorieEnum.MEDIO);
            Antipasti antipastoVegano1 = new Antipasti("Insalata di ceci", 4.50, PortataEnum.ANTIPASTO, null);
            Antipasti antipastoVegano2 = new Antipasti("Falafel", 6.40, PortataEnum.ANTIPASTO, null);
            PrimiPiatti primoPiattoVegano1 = new PrimiPiatti("Carbonara Vegana", 11.0, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)), "Integrale");
            PrimiPiatti primoPiattoVegano2 = new PrimiPiatti("Lasagna vegana", 11.0, PortataEnum.PRIMOPIATTO,null, "Riso");
            Secondi secondoVegano1 = new Secondi("Strudel salato", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Secondi secondoVegano2 = new Secondi("Seitan alla piastra", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Contorni contornoVegano1 = new Contorni("Finocchi gratinati in padella",2.50, PortataEnum.CONTORNO, null);
            Contorni contornoVegano2 = new Contorni("Carciofi in insalata",4.00, PortataEnum.CONTORNO, null);
            Dessert dessertVegano1 = new Dessert("Tronchetti vegani di banana al cioccolato fondente", 7.99, PortataEnum.DESSERT, null, CalorieEnum.MEDIO);
            Dessert dessertVegano2 = new Dessert("Frutta alle spezie vegano", 6.99, PortataEnum.DESSERT, null, CalorieEnum.BASSO);
            Pizza pizza1 = new Pizza("Margherita", 4.50, PortataEnum.PIZZA, null, "Integrale",new ArrayList<>(Arrays.asList("Pomodoro", "Mozzarella")));
            Pizza pizza2 = new Pizza("Crudaiola", 4.50, PortataEnum.PIZZA, null, "Normale",new ArrayList<>(Arrays.asList("Pomodoro" , "Mozzarella", "Prosciutto Crudo")));
            Pizza pizza3 = new Pizza("Vegetariana", 5.00, PortataEnum.PIZZA, null, "Normale",new ArrayList<>(Arrays.asList("Pomodoro", "Mozzarella", "Zucchine", "Peperoni")));
            Bibite bibita1 = new Bibite("Coca cola", 1.50, PortataEnum.BIBITE, null, false);
            Bibite bibita2 = new Bibite("Fanta", 2.00, PortataEnum.BIBITE, null, false);
            Bibite bibita3 = new Bibite("Birra", 2.50, PortataEnum.BIBITE, null, true);
            Bibite bibita4 = new Bibite("Vino bianco", 14.50, PortataEnum.BIBITE,null, true);
            Bibite bibita5 = new Bibite("Vino Rosso", 14.50, PortataEnum.BIBITE,null, true);

            //crea menu
            Menu menuCarne = new Menu("Monte", TipoEnum.CARNE);
            Menu menuPesce = new Menu("Mare", TipoEnum.PESCE);
            Menu menuVegano = new Menu("Amici della natura", TipoEnum.VEGANO);
            Menu menuPizza = new Menu("Pizza", TipoEnum.PIZZA);
            Menu menuBibite = new Menu("Bibite", TipoEnum.BIBITE);


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



            //add e remove menù al ristorante
            ristorante.aggingiMenu(menuCarne);
            ristorante.aggingiMenu(menuPesce);
            ristorante.aggingiMenu(menuBibite);
            ristorante.aggingiMenu(menuPizza);
            ristorante.aggingiMenu(menuVegano);
            ristorante2.aggingiMenu(menuPesce);
            ristorante2.aggingiMenu(menuBibite);
            ristorante3.aggingiMenu(menuBibite);
            ristorante3.aggingiMenu(menuCarne);
            ristorante3.aggingiMenu(menuVegano);


            // ristorante.stampaMenues();
            ristorante.stampaMenues();


            // ristorante.stampaMenues(TipoMenuEnum.CARNE);
            ristorante.stampamenu(TipoEnum.CARNE);
            ristorante.stampamenu(TipoEnum.VEGANO);


            //stampa menu
            menuCarne.stampaMenu();
            menuPesce.stampaMenu();
            menuVegano.stampaMenu();
            menuPizza.stampaMenu();
            menuBibite.stampaMenu();


            //add, remove e visualizza prenotazioni
            GestionePrenotazioni gestione = new GestionePrenotazioni();
            gestione.addPrenotazione(prenotazione1, ristorante);
            gestione.addPrenotazione(prenotazione2, ristorante);
            gestione.addPrenotazione(prenotazione3, ristorante2);
            gestione.removePrenotazione(prenotazione1, ristorante);
            gestione.visualizzaPrenotazioni();


            // TODO ristorante.prenotaTavolo(cliente, prenotazione);

            //crea cliente
            Cliente cliente1 = new Cliente("Rossi",5,TipoEnum.CARNE);
            Cliente cliente2 = new Cliente("Verdi",7,TipoEnum.PIZZA);
            Cliente cliente3 = new Cliente("Bianchi",2,TipoEnum.VEGANO);
            Cliente cliente4 = new Cliente("Cassano",20,TipoEnum.PESCE);
            cliente1.dettagliCliente();

            //Con il CLientePattern noi diamo la possibilità al cliente di compiere azioni
            ClientePattern sessione1 = new Prenota();
            sessione1.azione();
            System.out.println(                 );
            ClientePattern sessione2 = new InvitaAmico();
            sessione2.azione();
            System.out.println(                  );
            ClientePattern sessione3 = new Recensione();
            sessione3.azione();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}