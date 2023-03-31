package singleton;

public class Pilotos {

    private String nome;
    private Pista pistaCorrida = null;

    public Pilotos(String nome, Pista pistaCorrida) {
        this.nome = nome;
        this.pistaCorrida = pistaCorrida;
        pistaCorrida.setQuantidadeCorredores();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String ImprimirFicha() {
        String saida = "Dados do Corredor " + "\n";
        saida+= "Nome: " + " " + nome + "\n";
        saida+= "Nome da Pista: " + "Autodromo Internacional de Goiania" + "\n";
        saida+= "ID da pista: " +  pistaCorrida.HashCode() + "\n";
        saida+= "Quantidade de Corredores: "  + pistaCorrida.getQuantidadeCorredores()  + "\n";
        return saida;
    }
}
