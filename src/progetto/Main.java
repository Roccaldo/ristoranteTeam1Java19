package progetto;

import progetto.template.GestioneClienteTemplatePattern;
import progetto.template.InvitaAmico;
import progetto.template.Prenota;
import progetto.template.RecensionePattern;
import progetto.prodotti.*;
import progetto.template.RecensionePattern;
import programma_reward.AzioneRewardEnum;
import programma_reward.LivelloRewardEnum;
import programma_reward.PuntoReward;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            DateTimeFormatter formatter2 = DateTimeFormatter.ISO_OFFSET_TIME;
            // Creazione DatabaseAction
            DatabaseAction databaseAction = new DatabaseAction("jdbc:mysql://localhost:3306/progettodb", "root", "password");

            // Creazione e aggiunta al database di ristorante
            Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5", 50, OffsetTime.parse("17:00:00+00:00",formatter2),OffsetTime.parse("06:00:00+00:00",formatter2));
            databaseAction.insertRistorante(ristorante);
            Ristorante ristorante2 = new Ristorante("La Perla", "Via il Molo, 7", 30,  OffsetTime.parse("06:00:00+00:00",formatter2),OffsetTime.parse("03:00:00+00:00",formatter2));
            databaseAction.insertRistorante(ristorante2);
            Ristorante ristorante3 = new Ristorante("Il Ghiottone", "Via Aldo moro, 9", 200,  OffsetTime.parse("09:00:00+00:00",formatter2),OffsetTime.parse("00:00:00+00:00",formatter2));
            databaseAction.insertRistorante(ristorante3);

            //Creazione registro ristoranti
            RegistroRistoranti registroRistoranti = new RegistroRistoranti();
            registroRistoranti.addRistoranteToList(ristorante);
            registroRistoranti.addRistoranteToList(ristorante2);
            registroRistoranti.addRistoranteToList(ristorante3);

            //Creazione delle portate
            Antipasti antipastoCarne1 = new Antipasti("Ravioli cinesi al vapore", 3.50, PortataEnum.ANTIPASTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)));
            Antipasti antipastoCarne2 = new Antipasti("Cornetti salati", 1.50, PortataEnum.ANTIPASTO, new ArrayList<>(List.of(AllergeniEnum.CEREALI)));
            PrimiPiatti primoPiattoCarne1 = new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), TipoDiPastaEnum.GRANO);
            PrimiPiatti primoPiattoCarne2 = new PrimiPiatti("Mezzemaniche al pesto di peperoni e basilico con salsiccia", 22.30, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), TipoDiPastaEnum.INTEGRALE);
            Secondi secondoCarne1 = new Secondi("Pollo alla campagnola", 10.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.BEN_COTTA);
            Secondi secondoCarne2 = new Secondi("Tagliata di manzo", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.AL_SANGUE);
            Contorni contornoCarne1 = new Contorni("Patate fritte", 1.50, PortataEnum.CONTORNO, null);
            Contorni contornoCarne2 = new Contorni("Insalata di rucola, pere, grana e noci", 5.00, PortataEnum.CONTORNO, null);
            Dessert dessertCarne1 = new Dessert("Cheesecake di yogurt alle fragole", 12.99, PortataEnum.DESSERT, null, CalorieEnum.MEDIO);
            Dessert dessertCarne2 = new Dessert("Crostata al limone meringata", 9.99, PortataEnum.DESSERT, null, CalorieEnum.ALTO);
            Antipasti antipastoPesce1 = new Antipasti("Antipasto di mare", 4.50, PortataEnum.ANTIPASTO, new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI, AllergeniEnum.MOLLUSCHI)));
            Antipasti antipastoPesce2 = new Antipasti("Pepata di cozze", 6.40, PortataEnum.ANTIPASTO, null);
            PrimiPiatti primoPiattoPesce1 = new PrimiPiatti("Spaghetti allo scoglio", 14.0, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.PESCE, AllergeniEnum.CROSTACEI, AllergeniEnum.MOLLUSCHI)), TipoDiPastaEnum.RISO);
            PrimiPiatti primoPiattoPesce2 = new PrimiPiatti("Linguine all'astice", 9.0, PortataEnum.PRIMOPIATTO, new ArrayList<>(List.of(AllergeniEnum.CROSTACEI)), TipoDiPastaEnum.GRANO);
            Secondi secondoPesce1 = new Secondi("Salmone croccante", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Secondi secondoPesce2 = new Secondi("Polpettine di tonno e ricotta", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Contorni contornoPesce1 = new Contorni("Insalata semplice", 1.50, PortataEnum.CONTORNO, null);
            Contorni contornoPesce2 = new Contorni("Insalata nizzarda", 6.00, PortataEnum.CONTORNO, null);
            Dessert dessertPesce1 = new Dessert("Tiramisù", 5.00, PortataEnum.DESSERT, null, CalorieEnum.ALTO);
            Dessert dessertPesce2 = new Dessert("Torta tenerina", 5.00, PortataEnum.DESSERT, null, CalorieEnum.MEDIO);
            Antipasti antipastoVegano1 = new Antipasti("Insalata di ceci", 4.50, PortataEnum.ANTIPASTO, null);
            Antipasti antipastoVegano2 = new Antipasti("Falafel", 6.40, PortataEnum.ANTIPASTO, null);
            PrimiPiatti primoPiattoVegano1 = new PrimiPiatti("Carbonara Vegana", 11.0, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.SOIA)), TipoDiPastaEnum.INTEGRALE);
            PrimiPiatti primoPiattoVegano2 = new PrimiPiatti("Lasagna vegana", 11.0, PortataEnum.PRIMOPIATTO, null, TipoDiPastaEnum.RISO);
            Secondi secondoVegano1 = new Secondi("Strudel salato", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Secondi secondoVegano2 = new Secondi("Seitan alla piastra", 18.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.STANDARD);
            Contorni contornoVegano1 = new Contorni("Finocchi gratinati in padella", 2.50, PortataEnum.CONTORNO, null);
            Contorni contornoVegano2 = new Contorni("Carciofi in insalata", 4.00, PortataEnum.CONTORNO, null);
            Dessert dessertVegano1 = new Dessert("Tronchetti vegani di banana al cioccolato fondente", 7.99, PortataEnum.DESSERT, null, CalorieEnum.MEDIO);
            Dessert dessertVegano2 = new Dessert("Frutta alle spezie vegano", 6.99, PortataEnum.DESSERT, null, CalorieEnum.BASSO);
            Pizza pizza1 = new Pizza("Margherita", 4.50, PortataEnum.PIZZA, null,TipoImpastoEnum.NORMALE, new ArrayList<>(Arrays.asList(IngredientiPizzaEnum.POMODORO,IngredientiPizzaEnum.MOZZARELLA,IngredientiPizzaEnum.BASILICO)));
            Pizza pizza2 = new Pizza("Crudaiola", 4.50, PortataEnum.PIZZA, null, TipoImpastoEnum.INTEGRALE, new ArrayList<>(Arrays.asList(IngredientiPizzaEnum.POMODORO,IngredientiPizzaEnum.MOZZARELLA,IngredientiPizzaEnum.CRUDO)));
            Pizza pizza3 = new Pizza("Vegetariana", 5.00, PortataEnum.PIZZA, null, TipoImpastoEnum.SENZAGLUTINE, new ArrayList<>(Arrays.asList(IngredientiPizzaEnum.POMODORO,IngredientiPizzaEnum.MOZZARELLA,IngredientiPizzaEnum.ZUCCHINE,IngredientiPizzaEnum.PEPERONI)));
            Bibite bibita1 = new Bibite("Coca cola", 1.50, PortataEnum.BIBITE, null, false);
            Bibite bibita2 = new Bibite("Fanta", 2.00, PortataEnum.BIBITE, null, false);
            Bibite bibita3 = new Bibite("Birra", 2.50, PortataEnum.BIBITE, null, true);
            Bibite bibita4 = new Bibite("Vino bianco", 14.50, PortataEnum.BIBITE, null, true);
            Bibite bibita5 = new Bibite("Vino Rosso", 14.50, PortataEnum.BIBITE, null, true);

            //crea menu
            Menu menuCarne = new Menu("Monte", TipoEnum.CARNE);
            Menu menuPesce = new Menu("Mare", TipoEnum.PESCE);
            Menu menuVegano = new Menu("Amici della natura", TipoEnum.VEGANO);
            Menu menuPizza = new Menu("Pizza", TipoEnum.PIZZA);
            Menu menuBibite = new Menu("Bibite", TipoEnum.BIBITE);

            //add e remove menù al ristorante e insert database
            ristorante.aggingiMenu(menuCarne);
            databaseAction.insertMenu(menuCarne, registroRistoranti);
            ristorante.aggingiMenu(menuBibite);
            databaseAction.insertMenu(menuBibite, registroRistoranti);
            ristorante.aggingiMenu(menuPizza);
            databaseAction.insertMenu(menuPizza, registroRistoranti);
            ristorante2.aggingiMenu(menuPesce);
            databaseAction.insertMenu(menuPesce, registroRistoranti);
            ristorante2.aggingiMenu(menuBibite);
            databaseAction.insertMenu(menuBibite, registroRistoranti);
            ristorante3.aggingiMenu(menuVegano);
            databaseAction.insertMenu(menuVegano, registroRistoranti);

            // Aggiunta piatti menu carne
            menuCarne.aggiungiPiatto(antipastoCarne1);
            databaseAction.insertProdotto(antipastoCarne1, registroRistoranti);
            menuCarne.aggiungiPiatto(antipastoCarne2);
            databaseAction.insertProdotto(antipastoCarne2, registroRistoranti);
            menuCarne.aggiungiPiatto(primoPiattoCarne1);
            databaseAction.insertProdotto(primoPiattoCarne1, registroRistoranti);
            menuCarne.aggiungiPiatto(primoPiattoCarne2);
            databaseAction.insertProdotto(primoPiattoCarne2, registroRistoranti);
            menuCarne.aggiungiPiatto(secondoCarne1);
            databaseAction.insertProdotto(secondoCarne1, registroRistoranti);
            menuCarne.aggiungiPiatto(secondoCarne2);
            databaseAction.insertProdotto(secondoCarne2, registroRistoranti);
            menuCarne.aggiungiPiatto(contornoCarne1);
            databaseAction.insertProdotto(contornoCarne1, registroRistoranti);
            menuCarne.aggiungiPiatto(contornoCarne2);
            databaseAction.insertProdotto(contornoCarne2, registroRistoranti);
            menuCarne.aggiungiPiatto(dessertCarne1);
            databaseAction.insertProdotto(dessertCarne1, registroRistoranti);
            menuCarne.aggiungiPiatto(dessertCarne2);
            databaseAction.insertProdotto(dessertCarne2, registroRistoranti);

            // Aggiunta piatti menu pesce
            menuPesce.aggiungiPiatto(antipastoPesce1);
            databaseAction.insertProdotto(antipastoPesce1, registroRistoranti);
            menuPesce.aggiungiPiatto(antipastoPesce2);
            databaseAction.insertProdotto(antipastoPesce2, registroRistoranti);
            menuPesce.aggiungiPiatto(primoPiattoPesce1);
            databaseAction.insertProdotto(primoPiattoPesce1, registroRistoranti);
            menuPesce.aggiungiPiatto(primoPiattoPesce2);
            databaseAction.insertProdotto(primoPiattoPesce2, registroRistoranti);
            menuPesce.aggiungiPiatto(secondoPesce1);
            databaseAction.insertProdotto(secondoPesce1, registroRistoranti);
            menuPesce.aggiungiPiatto(secondoPesce2);
            databaseAction.insertProdotto(secondoPesce2, registroRistoranti);
            menuPesce.aggiungiPiatto(contornoPesce1);
            databaseAction.insertProdotto(contornoPesce1, registroRistoranti);
            menuPesce.aggiungiPiatto(contornoPesce2);
            databaseAction.insertProdotto(contornoPesce2, registroRistoranti);
            menuPesce.aggiungiPiatto(dessertPesce1);
            databaseAction.insertProdotto(dessertPesce1, registroRistoranti);
            menuPesce.aggiungiPiatto(dessertPesce2);
            databaseAction.insertProdotto(dessertPesce2, registroRistoranti);

            // Aggiunta piatti menu vegano
            menuVegano.aggiungiPiatto(antipastoVegano1);
            databaseAction.insertProdotto(antipastoVegano1, registroRistoranti);
            menuVegano.aggiungiPiatto(antipastoVegano2);
            databaseAction.insertProdotto(antipastoVegano2, registroRistoranti);
            menuVegano.aggiungiPiatto(primoPiattoVegano1);
            databaseAction.insertProdotto(primoPiattoVegano1, registroRistoranti);
            menuVegano.aggiungiPiatto(primoPiattoVegano2);
            databaseAction.insertProdotto(primoPiattoVegano2, registroRistoranti);
            menuVegano.aggiungiPiatto(secondoVegano1);
            databaseAction.insertProdotto(secondoVegano1, registroRistoranti);
            menuVegano.aggiungiPiatto(secondoVegano2);
            databaseAction.insertProdotto(secondoVegano2, registroRistoranti);
            menuVegano.aggiungiPiatto(contornoVegano1);
            databaseAction.insertProdotto(contornoVegano1, registroRistoranti);
            menuVegano.aggiungiPiatto(contornoVegano2);
            databaseAction.insertProdotto(contornoVegano2, registroRistoranti);
            menuVegano.aggiungiPiatto(dessertVegano1);
            databaseAction.insertProdotto(dessertVegano1, registroRistoranti);
            menuVegano.aggiungiPiatto(dessertVegano2);
            databaseAction.insertProdotto(dessertVegano2, registroRistoranti);

            // Aggiunta piatti menu pizza
            menuPizza.aggiungiPiatto(pizza1);
            databaseAction.insertProdotto(pizza1, registroRistoranti);
            menuPizza.aggiungiPiatto(pizza2);
            databaseAction.insertProdotto(pizza2, registroRistoranti);
            menuPizza.aggiungiPiatto(pizza3);
            databaseAction.insertProdotto(pizza3, registroRistoranti);

            // Aggiunta piatti menu bibite
            menuBibite.aggiungiPiatto(bibita1);
            databaseAction.insertProdotto(bibita1, registroRistoranti);
            menuBibite.aggiungiPiatto(bibita2);
            databaseAction.insertProdotto(bibita2, registroRistoranti);
            menuBibite.aggiungiPiatto(bibita3);
            databaseAction.insertProdotto(bibita3, registroRistoranti);
            menuBibite.aggiungiPiatto(bibita4);
            databaseAction.insertProdotto(bibita4, registroRistoranti);
            menuBibite.aggiungiPiatto(bibita5);
            databaseAction.insertProdotto(bibita5, registroRistoranti);

            //crea cliente e aggiunta al database
            Cliente cliente1 = new Cliente("Rossi", TipoEnum.CARNE);
            databaseAction.insertCliente(cliente1);
            Cliente cliente2 = new Cliente("Verdi", TipoEnum.PIZZA);
            databaseAction.insertCliente(cliente2);
            Cliente cliente3 = new Cliente("Bianchi", TipoEnum.VEGANO);
            databaseAction.insertCliente(cliente3);
            Cliente cliente4 = new Cliente("Cassano", TipoEnum.PESCE);
            databaseAction.insertCliente(cliente4);

            //creazione orario
            OffsetDateTime date = OffsetDateTime.parse("2024-03-01T13:00:00Z");

            //creazione prenotazioni e aggiunta al database
            Prenotazione prenotazione1 = new Prenotazione(cliente1, 10, date);
            Prenotazione prenotazione2 = new Prenotazione(cliente2, 25, date);
            Prenotazione prenotazione3 = new Prenotazione(cliente3, 40, date);
            Prenotazione prenotazione4 = new Prenotazione(cliente4,2, date);

            //add e aggiunta al database
            ristorante.addPrenotazione(prenotazione1);
            databaseAction.insertPrenotazione(prenotazione1, registroRistoranti);
            ristorante.addPrenotazione(prenotazione2);
            databaseAction.insertPrenotazione(prenotazione2, registroRistoranti);
            ristorante3.addPrenotazione(prenotazione3);
            databaseAction.insertPrenotazione(prenotazione3, registroRistoranti);
            ristorante.addPrenotazione(prenotazione4);
            databaseAction.insertPrenotazione(prenotazione4, registroRistoranti);

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

            //stampa dettagli e ristoranti consigliati;
            cliente1.dettagliCliente();
            cliente4.ristorantiConsigliati(registroRistoranti);

            System.out.println();
            // visualizza tutte le prenotazioni del ristorante
            ristorante.visualizzaPrenotazioniRistorante();
            System.out.println();
            //visualizza prenotazione cliente
            cliente1.visualizzaPrenotazioni();
            System.out.println();
            //visualizza dettagli ristorante
            ristorante.stampaDettagliRistorante();
            ristorante2.stampaDettagliRistorante();
            ristorante3.stampaDettagliRistorante();
            //Con il CLientePattern noi diamo la possibilità al cliente di compiere azioni
            System.out.println();
            GestioneClienteTemplatePattern sessione1 = new Prenota();
            sessione1.azione();
            System.out.println();
            GestioneClienteTemplatePattern sessione2 = new InvitaAmico();
            sessione2.azione();
            System.out.println();
            GestioneClienteTemplatePattern sessione3 = new RecensionePattern();
            sessione3.azione();
            System.out.println();
            ristorante.checkPrenotazione(prenotazione1);
            ristorante.checkPrenotazione(prenotazione2);
            cliente1.addRewardToPortafoglioPrenotazione(prenotazione1,new PuntoReward(LivelloRewardEnum.GOLD,AzioneRewardEnum.PRENOTAZIONE));
            cliente1.addRewardToPortafoglioPrenotazione(prenotazione1,new PuntoReward(LivelloRewardEnum.GOLD,AzioneRewardEnum.PRENOTAZIONE));
            cliente1.stampaPortafoglioReward();
            System.out.println();
            Recensione recensione1 = new Recensione(cliente1,"Ottima esperienza,abbiamo mangiato benissimo",VotoEnum.CINQUE);
            recensione1.stampaRecensione();
            ristorante.addRecensione(recensione1);
            cliente1.addRecensione(recensione1);
            ristorante.checkRecensione(recensione1);
            cliente1.addRewardToPortafoglioRecensione(recensione1,new PuntoReward(LivelloRewardEnum.SILVER,AzioneRewardEnum.RECENSIONE));
            cliente1.stampaPortafoglioReward();
            System.out.println();
            Ordine ordine1 = new Ordine(cliente1);
            cliente1.addOrdineToList(ordine1);
            ristorante.addOrdineToList(ordine1);
            ordine1.addPortateToOrdine(antipastoCarne1);
            ordine1.addPortateToOrdine(antipastoCarne2);
            ordine1.addPortateToOrdine(primoPiattoCarne1);
            ordine1.addPortateToOrdine(secondoCarne1);
            ordine1.addPortateToOrdine(dessertCarne1);
            ordine1.addPortateToOrdine(bibita1);
            ordine1.addPortateToOrdine(bibita1);
            ordine1.stampaOrdine();
            System.out.println();
            Carrello carrello = new Carrello();
            carrello.aggiungiOrdine(ordine1);
            carrello.mostraCarrello();
            ordine1.calcolaPrezzoOrdine();
            carrello.checkordine(ordine1);
            ordine1.stampaStatoOrdine();
            cliente1.addRewardToPortafoglioOrdine(ordine1,new PuntoReward(LivelloRewardEnum.GOLD,AzioneRewardEnum.ORDINE));
            cliente1.stampaPortafoglioReward();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

