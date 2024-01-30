package test;

import org.junit.jupiter.api.Test;
import progetto.Menu;
import progetto.prodotti.*;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void aggiungiPiatto() throws InvalidObjectException {
        Antipasti antipastoCarne2 = new Antipasti("Cornetti salati", 1.50, PortataEnum.ANTIPASTO, new ArrayList<>(List.of(AllergeniEnum.CEREALI)));
        PrimiPiatti primoPiattoCarne1 = new PrimiPiatti("Pappardelle al ragù di cinghiale", 14.76, PortataEnum.PRIMOPIATTO, new ArrayList<>(Arrays.asList(AllergeniEnum.CEREALI, AllergeniEnum.UOVA)), TipoDiPastaEnum.GRANO);
        Secondi secondoCarne1 = new Secondi("Pollo alla campagnola", 10.0, PortataEnum.SECONDOPIATTO, null, TipoCotturaEnum.BEN_COTTA);

        Menu menuCarne = new Menu("Monte", TipoEnum.CARNE);

        menuCarne.aggiungiPiatto(antipastoCarne2);
        menuCarne.aggiungiPiatto(primoPiattoCarne1);
        menuCarne.aggiungiPiatto(secondoCarne1);

    }

    @Test
    void rimuoviPiatto() throws InvalidObjectException {
        Antipasti antipastoCarne2 = new Antipasti("Cornetti salati", 1.50, PortataEnum.ANTIPASTO, new ArrayList<>(List.of(AllergeniEnum.CEREALI)));

        Menu menuCarne = new Menu("Monte", TipoEnum.CARNE);

        menuCarne.aggiungiPiatto(antipastoCarne2);
        menuCarne.rimuoviPiatto(antipastoCarne2);

    }
}