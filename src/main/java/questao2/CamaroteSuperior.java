package questao2;

public class CamaroteSuperior extends Normal{

    private String localiza;

    public CamaroteSuperior(double valor, String localiza) {
        super(valor);
        this.localiza = localiza;
    }

    public String getLocaliza() {
        return localiza;
    }

    public void setLocaliza(String localiza) {
        this.localiza = localiza;
    }

    public CamaroteSuperior(String localiza) {
        this.localiza = localiza;
    }
}
