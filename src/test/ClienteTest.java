package test;

import org.junit.jupiter.api.Test;
import progetto.*;
import progetto.prodotti.TipoEnum;

import java.io.InvalidObjectException;
import java.time.OffsetDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void addPrenotazione() {
        Cliente cliente1 = new Cliente("Rossi", 5, TipoEnum.CARNE);
        OffsetDateTime date = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        Prenotazione prenotazione1 = new Prenotazione("Rossi", 10, date);
        cliente1.addPrenotazione(prenotazione1);

    }

    @Test
    void removePrenotazione() {
        Cliente cliente1 = new Cliente("Rossi", 5, TipoEnum.CARNE);
        OffsetDateTime date = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        Prenotazione prenotazione1 = new Prenotazione("Rossi", 10, date);
        cliente1.addPrenotazione(prenotazione1);
        cliente1.removePrenotazione(prenotazione1);
    }

    @Test
    void ristorantiConsigliati() throws InvalidObjectException {
        ArrayList<Ristorante> ristorantiList = new ArrayList<>();
        Cliente cliente1 = new Cliente("Rossi", 5, TipoEnum.CARNE);
        Menu menuCarne = new Menu("Monte", TipoEnum.CARNE);
        Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5", 50);
        ristorante.aggingiMenu(menuCarne);
        cliente1.ristorantiConsigliati(new RegistroRistoranti());
    }
}