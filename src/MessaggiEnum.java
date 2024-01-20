public enum MessaggiEnum {

    PRODOTTOAGGIUNTO("prodotto aggiunto correttamente"),
    PRODOTTOPRESENTE("prodotto già presente nel menù"),
    PRODOTTORIMOSSO("prodotto rimosso correttamente"),
    PRODOTTONONPRESENTE("prodotto non presente nel menù"),
    MENUAGGIUNTO("menù aggiunto correttamente"),
    MENURIMOSSO("menù rimosso correttamente"),
    MENUPRESENTE("menù già presente"),
    MENUNONPRESENTE("menù non esistente"),
    PRENOTAZIONEAGGIUNTA("Prenotazione aggiunta correttamente"),
    PRENOTAZIONERIMOSSA("Prenotazione rimossa correttamente"),
    PRENOTAZIONENONVALIDA("Prenotazione non valida"),
    PRENOTAZIONENULLA("Il ristorante è pieno"),
    PRENOTAZIONEINESISTENTE("Prenotazione inesistente"),
    POSTILIBERI("Numero di posti liberi"),
    RISTORANTEPRESENTE("Ristorante già presente"),
    RISTORANTENONPRESENTE("Ristorante non presente");

    private final String messaggio;

    MessaggiEnum(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }
}
