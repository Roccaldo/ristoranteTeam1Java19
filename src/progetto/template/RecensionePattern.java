package progetto.template;
public class RecensionePattern extends GestioneClienteTemplatePattern {

    @Override
    public void start() {
        System.out.println("Scrivi la tua recensione");
    }

    @Override
    public void init() {
        System.out.println("Dai un voto");
    }

    @Override
    public void end() {
        System.out.println("Grazie per la tua recensione");
    }
}
