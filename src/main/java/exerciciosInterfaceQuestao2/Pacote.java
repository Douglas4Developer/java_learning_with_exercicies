package exerciciosInterfaceQuestao2;

public class Pacote extends Encomenda implements Entrega{
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public Pacote() {
    }

    public Pacote(String id, String cidadeOrigem, String cidadeDestino) {
        super(id, cidadeOrigem, cidadeDestino);
    }

    public Pacote(double peso, String descricao) {
        this.peso = peso;
        this.descricao = descricao;
    }

    public Pacote(String id, String cidadeOrigem, String cidadeDestino, double peso, String descricao) {
        super(id, cidadeOrigem, cidadeDestino);
        this.peso = peso;
        this.descricao = descricao;
    }

}
