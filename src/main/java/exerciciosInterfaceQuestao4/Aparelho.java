package exerciciosInterfaceQuestao4;

public class Aparelho implements Controle {

    public Aparelho() {
    }

    public Aparelho(boolean status, int volume) {
        this.status = status;
        this.volume = volume;
    }

    private boolean status;
    private int volume;

    @Override
    public void power() {

    }

    @Override
    public void setVolume(int volume) {

    }
}
