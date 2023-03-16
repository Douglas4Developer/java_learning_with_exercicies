package questao2;

public class CamaroteInferior extends Normal{
    public String localiza;

    public CamaroteInferior(double valor, String localiza) {
        super(valor);
        this.localiza = localiza;
    }

    public CamaroteInferior(String localiza) {
        this.localiza = localiza;
    }

    public String getLocaliza() {
        return localiza;
    }

    public void setLocaliza(String localiza) {
        this.localiza = localiza;
    }
}
