package exerciciosAssociacaoQuestao5;

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


    @Override
    public void caminhar() {

    }

    @Override
    public void alimentar() {

    }
}
