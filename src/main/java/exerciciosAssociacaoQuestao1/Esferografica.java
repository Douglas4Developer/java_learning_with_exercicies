package exerciciosAssociacaoQuestao1;

public class Esferografica implements Caneta{

    private String cor;

    public Esferografica() {
    }

    public Esferografica(String cor) {
        this.cor = cor;
    }

    @Override
    public String getColor(){
        return this.cor;
    }

    public void escrever(String texto){

        System.out.println("Usando" +  texto + "à caneta esferográfica " + getColor());
    }

    @Override
    public String getCor() {
        return null;
    }


}
