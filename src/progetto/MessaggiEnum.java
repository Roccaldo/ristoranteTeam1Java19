package progetto;

public enum MessaggiEnum {

    PRODOTTOAGGIUNTO("Prodotto aggiunto correttamente"),
    PRODOTTOPRESENTE("Prodotto già presente nel menù"),
    PRODOTTORIMOSSO("Prodotto rimosso correttamente"),
    PRODOTTONONPRESENTE("Prodotto non presente nel menù"),
    MENUAGGIUNTO("Menù aggiunto correttamente"),
    MENURIMOSSO("Menù rimosso correttamente"),
    MENUPRESENTE("Menù già presente"),
    MENUNONPRESENTE("Menù non esistente"),
    PRENOTAZIONI("Prenotazioni"),
    PRENOTAZIONEAGGIUNTA("Prenotazione aggiunta correttamente"),
    PRENOTAZIONERIMOSSA("Prenotazione rimossa correttamente"),
    PRENOTAZIONENONVALIDA("Prenotazione non valida"),
    PRENOTAZIONENULLA("Il ristorante è pieno"),
    PRENOTAZIONEINESISTENTE("Prenotazione inesistente"),
    POSTILIBERI("Numero di posti liberi"),
    RISTORANTEPRESENTE("Ristorante già presente"),
    RISTORANTENONPRESENTE("Ristorante non presente"),
    ID("ID"),
    COPERTI("COPERTI"),
    DATA("data"),
    CLIENTE("Cliente"),
    PRENOTAZIONE("le tue prenotazioni"),
    NOMERISTORANTE("Nome ristorante"),
    INDIRIZZO("Indirizzo"),
    STATO("Stato"),
    MENU("Menù"),
    RISTORANTI("Ristoranti consigliati"),

    COMPLETED("Prenotazione completata"),
    PUNTI("Punti totali"),

    RECENSIONE("Recensione");

    private final String messaggio;

    MessaggiEnum(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }
}
