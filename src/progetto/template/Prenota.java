package progetto.template;
public class Prenota extends GestioneClienteTemplatePattern {

    @Override
    public void start() {
        System.out.println("Inizia la prenotazione");
    }

    @Override
    public void init() {
        System.out.println("Scegli data e ora");
    }

    @Override
    public void end() {
        System.out.println("La tua prenotazione è andata a buon fine");
    }
}
