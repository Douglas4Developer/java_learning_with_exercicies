package exerciciosInterfaceQuestao2;

public class Revista extends Encomenda implements Entrega {

    private String titulo;
    private String mes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Revista(String titulo, String mes) {
        this.titulo = titulo;
        this.mes = mes;
    }

    public Revista(String id, String cidadeOrigem, String cidadeDestino, String titulo, String mes) {
        super(id, cidadeOrigem, cidadeDestino);
        this.titulo = titulo;
        this.mes = mes;
    }
}
