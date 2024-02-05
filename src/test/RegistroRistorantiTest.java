package test;

import org.junit.jupiter.api.Test;
import progetto.Ristorante;
import progetto.prodotti.Prodotti;
import progetto.prodotti.TipoEnum;

import java.io.InvalidObjectException;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegistroRistorantiTest {

    @Test
    void addRistoranteToList() throws InvalidObjectException {
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_OFFSET_TIME;
        ArrayList<Ristorante> ristorantiList = new ArrayList<>();
        Ristorante ristorante = new Ristorante("Team Java19", "Via Sparsi Per l' Italia, 5", 50, OffsetTime.parse("12:00:00+00:00",formatter2),OffsetTime.parse("05:00:00+00:00",formatter2) );
        ristorantiList.add(ristorante);

        List<Ristorante> ristoranteList= new ArrayList<>();
        ristoranteList.add(ristorante);

        assertEquals(ristorantiList.size(),ristoranteList.size());
    }

    
}