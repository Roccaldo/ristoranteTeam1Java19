package programma_reward;

public enum AzioneRewardEnum {

    PRENOTAZIONE("Prenotazione utilizzata"),
    RECENSIONE("Recensione pubblicata"),
    ORDINE("Ordine effettuato");

    private final String azioneRewardEnum;

    AzioneRewardEnum(String azioneRewardEnum) {
        this.azioneRewardEnum = azioneRewardEnum;
    }

    public String getAzioneRewardEnum() {
        return azioneRewardEnum;
    }
}
