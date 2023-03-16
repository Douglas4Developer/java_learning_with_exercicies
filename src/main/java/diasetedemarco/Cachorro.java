package diasetedemarco;

public class Cachorro extends Mamifero {
    public Cachorro() {
    }

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void talk(){
        System.out.println("Latir... ");
    }

}
