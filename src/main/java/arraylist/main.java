package arraylist;

import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Fruta> lista = new ArrayList();
        List<Fruta> lista2 =  new ArrayList();
        List<Fruta> lista3 = new LinkedList();
        Fruta e = new Fruta();
        e.setNome("Banana");
        e.setPeso(20.0);

        lista2.add(e);
        lista2.add(0, new Fruta("Uva", 5.0));
        System.out.println("Nome: " + e.getNome());
        System.out.println("Peso: " + e.getPeso());

        if (lista2.isEmpty())
            System.out.println("Lista Vazia");
        else{
            System.out.println("Nome" + lista2.get(0).getNome());
        }

        Iterator it = lista2.iterator();
        while (it.hasNext()){
            Fruta tmp = new Fruta();
            tmp = (Fruta)it.next();
            System.out.println("Nome: " + tmp.getNome().toString().toUpperCase());
            System.out.println("Peso: " + tmp.getPeso());
        }
    }
}
