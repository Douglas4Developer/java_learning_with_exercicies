package exerciciosAssociacaoQuestao3;

public class Quadrado implements FormaGeometrica{

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

 @Override
    public double area() {
        double result;
        result= (lado * lado);
        return result;
    }

    @Override
    public double comprimento() {
        double result;
        result= (lado * 4);
        return result;
    }
}
