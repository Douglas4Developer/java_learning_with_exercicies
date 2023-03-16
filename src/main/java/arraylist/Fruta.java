package arraylist;

public class Fruta
{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Fruta(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Fruta() {
    }

    private String nome;
    private double peso;


}
