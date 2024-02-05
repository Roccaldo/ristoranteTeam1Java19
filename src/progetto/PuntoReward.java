package progetto;

public class PuntoReward {

    private Integer valore;

    public PuntoReward(Integer valore) {
        this.valore = valore;
    }

    public Integer getValore() {
        return valore;
    }

    public void setValore(Integer valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return "PuntoReward{" +
                "valore=" + valore +
                '}';
    }
}
