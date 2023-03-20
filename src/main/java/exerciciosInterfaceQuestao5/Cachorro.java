package exerciciosInterfaceQuestao5;

public class Cachorro implements Mamifero {
    public String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro() {
    }

    public Cachorro(String raca) {
        this.raca = raca;
    }

//teste
    @Override
    public void caminhar() {
        System.out.println("Caminhando...");

    }

    @Override
    public void alimentar() {

    }
}
