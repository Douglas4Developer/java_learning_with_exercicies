package questao3;


public class exec3{

    public static void main(String[] args) {

        Animal animal1 = new Animal("Gato", 10);
        Peixe peixe1 = new Peixe("Neon", 0.2, "ornamental");
        Cachorro cao = new Cachorro("Rex", 30, "Boxer" );
        System.out.println("-Cachorro-");
        System.out.println("Nome: " + cao.getNome() + "Peso: "+ cao.getPeso());
        System.out.println("-Peixe-");
        System.out.println("Nome: " + peixe1.getNome() + "Peso: "+ peixe1.getPeso());
        System.out.println("-Animal-");
        System.out.println("Nome: " + animal1.getNome() + "Peso: "+ animal1.getPeso());

    }
}