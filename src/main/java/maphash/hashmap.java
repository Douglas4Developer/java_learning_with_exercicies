package maphash;


import java.util.*;

public class hashmap {

    public static void main(String[] args) {
        Map<String, Integer> veiculos = new HashMap();
        // Map<String, Integer> veiculos = new Hashtable();
      //  Map<String, Integer> veiculos = new TreeMap();
        veiculos.put("BMW", 5);
        veiculos.put("Mecedes", 3);
        veiculos.put("Audi", 4);
        veiculos.put("Fiat", 7);

        System.out.println(veiculos);
        System.out.println("Tamanho: " + veiculos.size());

        for(String chaves: veiculos.keySet()
             ) {
            System.out.println(chaves + "-" + veiculos.get(chaves));
        }
        for (int valor: veiculos.values()){
            System.out.println(valor + "-" + veiculos.get(valor));
        }

        String busca="Fiat";

        if (veiculos.containsKey(busca))
        {
            System.out.println("Encontrado: " + veiculos.get(busca));
        }

        Set<Map.Entry<String, Integer>> set = veiculos.entrySet();
        Iterator it =  set.iterator();

        while (it.hasNext())
        {
            Map.Entry<String, Integer> entrada = (Map.Entry)it.next();
            System.out.println(entrada.getKey() + ":" + entrada.getValue());
        }

        veiculos.clear();
        System.out.println(veiculos.size());
        System.out.println("/---------------------/");

    }
}
