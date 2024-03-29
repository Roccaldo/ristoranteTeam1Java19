package progetto.template;
public class InvitaAmico extends GestioneClienteTemplatePattern {

    @Override
    public void start() {
        System.out.println("Invita un amico");
    }

    @Override
    public void init() {
        System.out.println("Consiglia il tuo ristorante preferito");
    }

    @Override
    public void end() {
        System.out.println("I tuoi amici sono stati invitati");
    }
}
