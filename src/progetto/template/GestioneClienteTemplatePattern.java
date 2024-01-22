package progetto.template;

public abstract class GestioneClienteTemplatePattern {

    //template method
    public final void azione() {
        //Inizia l'azione
        start();
        //Inizializza l'azione
        init();
        //Termina l'azione
        end();
    }

    public abstract void init();

    public abstract void start();

    public abstract void end();
}

