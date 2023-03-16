package InterfaceJava;

public class classeMsg implements  interface1, interface2{

    public void mensagem(){
        interface1.super.mensagem1();
        interface2.super.mensagem2();
    }
}
