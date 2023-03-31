package fabricadeSalgados;

public class main {
    public static void main(String[] args) {

        SalgadosFactory fabrica1 = new SalgadosFactory();

        fabrica1.assarSalgado("COXINHA", "GOIAS");
        System.out.println("Coxinha de Goias");
        System.out.println(fabrica1);

        fabrica1.assarSalgado("COXINHA", "CEARA");
        System.out.println("COXINHA de CEARA");
        System.out.println(fabrica1);

        fabrica1.assarSalgado("EMPADA", "GOIAS");
        System.out.println("EMPADA de Goias");
        System.out.println(fabrica1);

        fabrica1.assarSalgado("EMPADA", "CEARA");
        System.out.println("EMPADA de CEARA");
        System.out.println(fabrica1);




    }
}
