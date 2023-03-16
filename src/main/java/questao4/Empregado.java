package questao4;

public class Empregado extends Pessoa{
    private double salario;
    private String matricula;

    public Empregado (){

    }

    public Empregado(String nome, int idade, String sexo, String matricula, double salario){

        super(nome, idade, sexo);
        this.matricula = matricula;
        this.salario = salario;    
    }

    public double getSalario(){
        return salario;

    }

    public void setSalario(double salario){
        this.salario = salario;
    }



    public String getMatricula(){
        return matricula;

    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double valorInss(){
        return (salario - salario * 0.05);
    }




    
}
