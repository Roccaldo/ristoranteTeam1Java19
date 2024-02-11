package programma_reward;

public enum LivelloRewardEnum {

    SILVER("SILVER"),
    GOLD("GOLD");
    private final String livelloRewardEnum;

    LivelloRewardEnum(String livelloRewardEnum) {
        this.livelloRewardEnum = livelloRewardEnum;
    }

    public String getLivelloRewardEnum() {
        return livelloRewardEnum;
    }
}
