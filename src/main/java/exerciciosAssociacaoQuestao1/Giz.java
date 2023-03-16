package exerciciosAssociacaoQuestao1;

public class Giz implements Caneta{

    @Override
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private String cor;
    public Giz(String cor) {
        this.cor = cor;
    }

    public Giz() {
    }


    @Override
    public void escrever(String texto) {

        System.out.println("Usando" +  texto + "com giz" + getColor());
    }

    @Override
    public String getColor() {
        return null;
    }


}
