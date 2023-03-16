package exerciciosAssociacaoQuestao4;

public class Tv extends Aparelho implements Controle{

    private int canal;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public Tv() {
    }

    public Tv(int canal) {
        this.canal = canal;
    }

    public Tv(boolean status, int volume, int canal) {
        super(status, volume);
        this.canal = canal;
    }

    public Tv(boolean status, int volume) {
        super(status, volume);
    }
}
