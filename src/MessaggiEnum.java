public enum MessaggiEnum {

    PRODOTTOAGGIUNTO("Prodotto aggiunto correttamente"),
    PRODOTTOPRESENTE("Prodotto già presente nel menù"),
    PRODOTTORIMOSSO("Prodotto rimosso correttamente"),
    PRODOTTONONPRESENTE("Prodotto non presente nel menù"),
    MENUAGGIUNTO("Menù aggiunto correttamente"),
    MENURIMOSSO("Menù rimosso correttamente"),
    MENUPRESENTE("Menù già presente"),
    MENUNONPRESENTE("Menù non esistente"),
    PRENOTAZIONEAGGIUNTA("Prenotazione aggiunta correttamente"),
    PRENOTAZIONERIMOSSA("Prenotazione rimossa correttamente"),
    PRENOTAZIONENONVALIDA("Prenotazione non valida"),
    PRENOTAZIONENULLA("Il ristorante è pieno"),
    PRENOTAZIONEINESISTENTE("Prenotazione inesistente"),
    POSTILIBERI("Numero di posti liberi"),
    RISTORANTEPRESENTE("Ristorante già presente"),
    RISTORANTENONPRESENTE("Ristorante non presente"),
    NOMEPRENOTAZIONE("Nome prenotazione"),
    COPERTI("COPERTI"),
    ORARIO("Orario"),
    CLIENTE("Cliente");

    private final String messaggio;

    MessaggiEnum(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }
}
