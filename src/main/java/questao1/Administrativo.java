package questao1;

public class Administrativo extends Assistente {
    public Administrativo() {
    }

    public Administrativo(String nome, String cpf, String matricula, String turno) {
        super(nome, cpf, matricula);
        this.turno = turno;
    }

    protected String getTurno() {
        return turno;
    }

    protected void setTurno(String turno) {
        this.turno = turno;
    }

    private String turno;

    public void ImprimeDados(){
        System.out.println( getNome() + " " + getCpf() + " " +
                getMatricula() + " " + getTurno());
    }
}
