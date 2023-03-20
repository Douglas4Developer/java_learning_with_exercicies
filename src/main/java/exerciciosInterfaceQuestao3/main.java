package exerciciosInterfaceQuestao3;

public class main {
    public static void main(String[] args) {
    Circulo novoC = new Circulo(3.5);
    Quadrado novoQ = new Quadrado(4);

        System.out.println(novoC.area()  + " --- "+ novoC.comprimento());
        System.out.println(novoQ.area()  + " --- "+ novoQ.comprimento());

    }
}
