package exerciciosInterfaceQuestao2;

public class Encomenda {
    private String id;
    private String cidadeOrigem;
    private String cidadeDestino;

    public Encomenda() {
    }

    public Encomenda(String id, String cidadeOrigem, String cidadeDestino) {
        this.id = id;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }


}
