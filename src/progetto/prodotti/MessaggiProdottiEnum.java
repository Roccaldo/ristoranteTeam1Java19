package progetto.prodotti;

public enum MessaggiProdottiEnum {

    ALLERGENI("Allergeni presenti"),
    TIPOLOGIA("Tipologia"),
    COTTURA("Tipo di cottura"),
    CALORIE("Calorie presenti"),
    IMPASTO("Tipo di impasto"),
    INGREDIENTI("Ingredienti"),
    ALCOLICO("Alcolico"),
    ANALCOLICO("Analcolico");


    private final String messaggioEnum;

    MessaggiProdottiEnum(String messaggioEnum) {
        this.messaggioEnum = messaggioEnum;
    }

    public String getMessaggioEnum() {
        return messaggioEnum;
    }


}
