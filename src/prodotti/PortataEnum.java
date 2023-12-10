package prodotti;

public enum PortataEnum  {
    ANTIPASTO("Antipasto"),
    PRIMOPIATTO("Primo Piatto"),
    SECONDOPIATTO("Secodno Piatto"),
    CONTORNO("Contorno"),
    DESSERT("Dessert");
    private String portata;
    private PortataEnum(String portata){
        this.portata = portata;
    }

    public String getPortata() {
        return portata;
    }
}

