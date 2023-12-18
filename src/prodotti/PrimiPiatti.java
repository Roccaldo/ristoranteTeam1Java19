package prodotti;

public class PrimiPiatti extends Prodotti{

    private PortataEnum portata;
    public PrimiPiatti(String nomePiatto, Double prezzo, PortataEnum portata) {
        super(nomePiatto, prezzo);
        this.portata = PortataEnum.PRIMOPIATTO;
    }

    public PortataEnum getPortata() {
        return portata;
    }

    public void setPortata(PortataEnum portata) {
        this.portata = portata;
    }


    //TODO metodo che stampa e possiamo fare uno in overloaded che prende anche il coloro
}
