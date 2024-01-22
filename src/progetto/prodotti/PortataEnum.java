package progetto.prodotti;

public enum PortataEnum  {
    ANTIPASTO("Antipasto"),
    PRIMOPIATTO("Primo Piatto"),
    SECONDOPIATTO("Secondo Piatto"),
    PIZZA("Pizza"),
    CONTORNO("Contorno"),
    DESSERT("Dessert"),
    BIBITE("Bibite");
    private String portata;
    private PortataEnum(String portata){
        this.portata = portata;
    }

    public String getPortata() {
        return portata;
    }
}

