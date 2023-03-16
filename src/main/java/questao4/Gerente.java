package questao4;

public class Gerente extends Empregado{

    private String nomeGerencia;


    public Gerente(){

    }

    public Gerente(String nome, int idade, String sexo,  String matricula, double salario, String nomeGerencia) {
        super(nome, idade, sexo, matricula, salario);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia(){
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }





}
