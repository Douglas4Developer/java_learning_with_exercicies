package diasetedemarco;

public class BemTiVi extends Animal{
    public BemTiVi() {
    }
    public BemTiVi(String nome) {
        super(nome);
    }


    @Override

    public void talk(){
        System.out.println("Cantar ...");
    }
}
