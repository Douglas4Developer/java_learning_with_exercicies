package questao2;

public class Vip extends Ingresso{

    public Vip(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public Vip(double adicional) {
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double retornaVal(){
        return getValor() + adicional;
    }

    private double adicional;

}
