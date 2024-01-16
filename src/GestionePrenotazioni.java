import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

public class GestionePrenotazioni {
    private final Map<Prenotazione, Ristorante> registroPrenotazioni = new HashMap<>();

    //metodo per aggiungere una prenotazione
    public void addPrenotazione(Prenotazione prenotazione, Ristorante ristorante) {
        //controllo se il ristorante ha posti liberi
        if(ristorante.getPostiLiberi() - prenotazione.getPostiOccupati() >= 0) {

            //controllo se la data è successiva ad adesso e se la prenotazione
            //non è già stata inserita
            if(prenotazione.getOrario().isAfter(OffsetDateTime.now()) && !registroPrenotazioni.containsKey(prenotazione)) {

                //aggiungo prenotazione
                registroPrenotazioni.put(prenotazione, ristorante);
                System.out.println(MessaggiEnum.PRENOTAZIONEAGGIUNTA);
                //modifico posti liberi
                ristorante.setPostiLiberi(ristorante.getPostiLiberi() - prenotazione.getPostiOccupati());
            } else {
                throw new RuntimeException(MessaggiEnum.PRENOTAZIONENONVALIDA.getMessaggio());
            }
        } else {
            throw new RuntimeException(MessaggiEnum.PRENOTAZIONENULLA + " " + MessaggiEnum.POSTILIBERI + " = " + ristorante.getPostiLiberi());
        }
    }

    //metodo per rimuovere una prenotazione
    public void removePrenotazione(Prenotazione prenotazione, Ristorante ristorante) {
        //controllo se il registro contiene la prenotazione da rimuovere
        if(registroPrenotazioni.containsKey(prenotazione)) {

            //rimuovo la prenotazione
            registroPrenotazioni.remove(prenotazione);
            System.out.println(MessaggiEnum.PRENOTAZIONERIMOSSA);
            //modifico posti liberi
            ristorante.setPostiLiberi(ristorante.getPostiLiberi() + prenotazione.getPostiOccupati());
        } else {
            throw new RuntimeException(MessaggiEnum.PRENOTAZIONEINESISTENTE.getMessaggio());
        }

    }

    //metodo per visualizzare tutte le prenotazioni
    public void visualizzaPrenotazioni() {
        for(Map.Entry<Prenotazione, Ristorante> element : registroPrenotazioni.entrySet()) {
            System.out.println(element.getKey());
        }
    }
}
