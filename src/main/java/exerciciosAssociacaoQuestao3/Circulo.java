package exerciciosAssociacaoQuestao3;

public class Circulo implements FormaGeometrica {

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    private double raio;


    @Override
    public double area() {
        double result;
        result= (3.14 * raio * raio);
        return result;
    }

    @Override
    public double comprimento() {
        double result;
        result= (2* 3.14 * raio);
        return result;
    }
}
