package exerciciosAssociacaoQuestao1;

public class Lapis implements Caneta{

    public Lapis(String cor) {
        this.cor = cor;
    }

    public Lapis() {
    }
    private String cor;

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void escrever(String texto) {

        System.out.println("Usando" +  texto + "à lápis"  + getColor());
    }


    public void setCor(String cor) {
        this.cor = cor;
    }
}
