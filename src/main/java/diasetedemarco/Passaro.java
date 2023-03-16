package diasetedemarco;

public class Passaro extends Animal{
    public Passaro() {
    }

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void talk() {
        System.out.println("Cantar");
    }


}
