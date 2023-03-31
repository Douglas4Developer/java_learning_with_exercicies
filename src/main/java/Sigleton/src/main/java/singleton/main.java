package singleton;

public class main {

    public static void main(String[] args) {


        Pilotos piloto1 = new Pilotos("Japa", Pista.getInstancePista());
        System.out.println(piloto1.ImprimirFicha());
        Pilotos piloto2 = new Pilotos("Goku", Pista.getInstancePista());
        System.out.println(piloto2.ImprimirFicha());
        Pilotos piloto3 = new Pilotos("Jaspion", Pista.getInstancePista());
        System.out.println(piloto3.ImprimirFicha());

    }
}
