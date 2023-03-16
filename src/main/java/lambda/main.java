package lambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {

    public static void main(String[] args) {
        int[] Values = { 3, 10, -1, 5, 7, 9, 11, 34, 56, 1, 7};
        System.out.println("Vetor: ");
        IntStream.of(Values).forEach(value -> System.out.println(value));
        System.out.println();
        System.out.println("Quantidade" + IntStream.of(Values).count());
        System.out.println("Min = " + IntStream.of(Values).min().getAsInt());
        System.out.println("Max = " + IntStream.of(Values).max().getAsInt());
        System.out.println("Soma = " + IntStream.of(Values).sum());
        System.out.println("Media = " + IntStream.of(Values).average().getAsDouble());
        System.out.println("Soma = " + IntStream.of(Values).reduce(0, (x,y)-> x+y));
        System.out.println("Soma = " + IntStream.of(Values).reduce(1, (x,y)-> x*y));
        System.out.println("Soma = " + IntStream.of(Values).reduce(0, (x,y)-> x+y*y));
        System.out.println("Valores impares multiplicados por 10 em ordem cresecente");
        IntStream.of(Values).filter(valor ->valor%2!=0).map(valor->valor*10)
                .sorted().forEach(valor -> System.out.println(valor));
        System.out.println("");
        System.out.println("soma dos inteitos de 1 a 10 exclusivo");
        IntStream.range(1,5).sum();
        System.out.println("");
        System.out.println("soma dos inteitos de 1 a  inclusivo");
        IntStream.rangeClosed(1,5).sum();
        System.out.println("Primeiro " + IntStream.of(Values).findFirst().getAsInt());
        try {
            System.out.println("Numero -1 " + IntStream.of(Values)
                    .filter(valor->valor==-1).findAny().getAsInt());
        }catch (java.util.NoSuchElementException e)
        {
            System.out.println("Valor -1 nao existe");
        }
        System.out.println("Vetor: " + Arrays.asList(Values));
//        System.out.println("Vetor: " + Arrays.stream(Values)
              //  .sorted().collect(Collectors.toList()));
            //


    }
}
