package exerciciosAssociacaoQuestao4;

public class Radio extends Aparelho implements Controle{


    private double faixa;

    public Radio() {
    }

    public Radio(double faixa) {
        this.faixa = faixa;
    }

    public Radio(boolean status, int volume, double faixa) {
        super(status, volume);
        this.faixa = faixa;
    }

    public double getFaixa() {
        return faixa;
    }

    public void setFaixa(double faixa) {
        this.faixa = faixa;
    }

    public Radio(boolean status, int volume) {
        super(status, volume);
    }
}
