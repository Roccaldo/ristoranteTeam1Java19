package programma_reward;

public class PuntoReward{

    private LivelloRewardEnum livelloRewardEnum;

    private AzioneRewardEnum azioneRewardEnum;

    public PuntoReward(LivelloRewardEnum livelloRewardEnum, AzioneRewardEnum azioneRewardEnum) {
        this.livelloRewardEnum = livelloRewardEnum;
        this.azioneRewardEnum = azioneRewardEnum;
    }

    public LivelloRewardEnum getLivelloRewardEnum() {
        return livelloRewardEnum;
    }

    public void stampaPunti(){
        System.out.println();
    }
}
