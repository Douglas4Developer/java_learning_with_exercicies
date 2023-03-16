package questao4;

public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;


    public Vendedor(){

    }

    public Vendedor(String nome, int idade, String sexo,  String matricula, double salario, double valorVendas, int qntVendas){
        super(nome, idade, sexo, matricula, salario);
        
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }


    public double getValorVendas(){
        return valorVendas;
    }

    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }

    public int getQntVendas(){
        return qntVendas;
    }

    public void setQntVendas(int qntVendas){
        this.qntVendas = qntVendas;
    }


}
