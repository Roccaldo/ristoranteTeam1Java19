package progetto.prodotti;

public enum PortataEnum  {
    ANTIPASTO("Antipasti"),
    PRIMOPIATTO("Primi"),
    SECONDOPIATTO("Secondi"),
    PIZZA("Pizze"),
    CONTORNO("Contorni"),
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

