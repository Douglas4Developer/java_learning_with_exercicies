package questao1;

public class Assistente extends Funcionario {
    private String matricula;

    public Assistente() {
    }

    public Assistente(String nome, String cpf) {
    }

    public Assistente(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }




}
