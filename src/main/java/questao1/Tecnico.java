package questao1;

public class Tecnico extends Assistente{

    private double bonus;

    public Tecnico() {
    }

    public Tecnico(String nome, String cpf, String matricula, double bonus) {
        super(nome, cpf, matricula);
        this.bonus = bonus;
    }

    protected double getBonus() {
        return bonus;
    }

    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }



    public void ImprimeDados(){
        System.out.println( getNome() + " " + getCpf() + " " +
                getMatricula() + " " + getBonus());
    }

}
