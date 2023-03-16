package questao1;

public class exec1 {

    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("Douglas", "708.321.121-35");
        Assistente assis1 = new Assistente("Douglas SSFer", "70832112135", "52");
        Administrativo adm1 = new Administrativo("Joao", "65932112154", "1","Noturno");
        Tecnico tec1 = new Tecnico("Henrique", "321654785", "2",100);

        System.out.println(fun1.getNome() + " " + fun1.getCpf());
        System.out.println(assis1.getNome() + " " + assis1.getCpf() + " " + assis1.getMatricula());

        adm1.ImprimeDados();
        tec1.ImprimeDados();

        System.out.println(adm1.getNome() + " " + adm1.getCpf() + " " + adm1.getMatricula());
        System.out.println(tec1.getNome() + " " + tec1.getCpf() + " " + tec1.getMatricula());
    }
}
