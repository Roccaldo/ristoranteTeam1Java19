package test;

import org.junit.jupiter.api.Test;
import progetto.Cliente;
import progetto.Menu;
import progetto.Prenotazione;
import progetto.Ristorante;
import progetto.prodotti.TipoEnum;

import java.io.InvalidObjectException;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RistoranteTest {

    @Test
    void aggingiMenu() throws InvalidObjectException {

        Menu menuCarne = new Menu("Monte", TipoEnum.CARNE);
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_OFFSET_TIME;
        Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5", 50, OffsetTime.parse("12:00:00+00:00",formatter2),OffsetTime.parse("05:00:00+00:00",formatter2));
        ristorante.aggingiMenu(menuCarne);

        List<Menu> menuList= new ArrayList<>();
        menuList.add(menuCarne);

        assertEquals(ristorante.getMenues().size(), menuList.size());

    }


    @Test
    void addPrenotazione() throws InvalidObjectException {
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_OFFSET_TIME;
        Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5", 50,OffsetTime.parse("12:00:00+00:00",formatter2),OffsetTime.parse("05:00:00+00:00",formatter2));
        Cliente cliente1 = new Cliente("Rossi", 5, TipoEnum.CARNE);
        OffsetDateTime date = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        Prenotazione prenotazione1 = new Prenotazione(cliente1, 10, date);
        ristorante.addPrenotazione(prenotazione1);

        List<Prenotazione> prenotazioneList = new ArrayList<>();
        prenotazioneList.add(prenotazione1);

        assertEquals(ristorante.getRegistroPrenotazioni().size(), prenotazioneList.size());
    }


}
