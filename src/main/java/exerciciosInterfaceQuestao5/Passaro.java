package exerciciosInterfaceQuestao5;

public class Passaro implements Voador {
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private String especie;

    public Passaro() {
    }

    public Passaro(String especie) {
        this.especie = especie;
    }

    @Override
    public void voar() {

    }

    @Override
    public void comunicar() {

    }
}
