package singleton;

public class Pista {

    private String nome;
    static int QuantidadeCorredores = 0;

    private static Pista pistaUnica = null;

    private Pista(){ }

    public static Pista getInstancePista (){
        if (pistaUnica == null)
            pistaUnica = new Pista();
        return pistaUnica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCorredores() {
        return QuantidadeCorredores;
    }

    public void setQuantidadeCorredores() {
        QuantidadeCorredores ++;
    }


    public static Pista getPistaUnica() {
        return pistaUnica;
    }

    public static void setPistaUnica(Pista pistaUnica) {
        Pista.pistaUnica = pistaUnica;
    }

    public int HashCode(){
        return hashCode();
    }
}
