package questao4;

public class exec4{


    public static void main(String[] args) {

        Pessoa persona = new Pessoa("Joao", 33, "Masculino");
        Empregado empregado1 = new Empregado("Ana", 21, "Feminina", "1400", 5000.00);
        Cliente cli = new Cliente("Almir", 40,"Masculino",  2000, 1976);
        Gerente ger = new Gerente("Tania", 30, "", "1300", 15000.00, "Atendimento");
        Vendedor vend = new Vendedor("Igor", 0, null,"", 7000.00, 14000.00, 120);

        System.out.println(persona.getNome() + " " + persona.getIdade() + " " +  persona.getSexo());
        System.out.println(empregado1.getNome() + " " + empregado1.getIdade() + " " +  empregado1.getSexo());
        System.out.println(cli.getNome() + " " + cli.getIdade() + " " +  cli.getSexo());
        System.out.println(ger.getNome() + " " + ger.getIdade() + " " +  ger.getSexo());
        System.out.println(vend.getNome() + " " + vend.getIdade() + " " +  vend.getSexo());
    }
}