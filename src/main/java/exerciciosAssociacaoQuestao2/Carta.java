package exerciciosAssociacaoQuestao2;

public class Carta extends Encomenda implements Entrega{

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Carta(String texto) {
        this.texto = texto;
    }

    public Carta(String id, String cidadeOrigem, String cidadeDestino, String texto) {
        super(id, cidadeOrigem, cidadeDestino);
        this.texto = texto;
    }


}
