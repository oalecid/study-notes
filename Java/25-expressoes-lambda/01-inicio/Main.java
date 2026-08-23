import java.util.Arrays;
import java.util.List;

public class Main {
  public static void exemploForEach(List<Integer> lista) {
    for (Integer item : lista) {
      System.out.println(item);
    }
  }

  public static void exemploLambda(List<Integer> lista) {
    lista.forEach((Integer item) -> System.out.println(item));
  }

  public static void exemploLambdaMultiplasLinhas(List<Integer> lista) {
    // Nem sempre é preciso especificar o tipo obrigatoriamente
    lista.forEach((item) -> {
      System.out.println("exemploLambdaMultiplasLinhas");
      System.out.println(item);
    });
  }

  public static void main(String[] args) {
    List<Integer> lista = Arrays.asList(7, 8, 9);

    exemploForEach(lista);
    
    System.out.println("\n");

    exemploLambda(lista);

    System.out.println("\n");

    exemploLambdaMultiplasLinhas(lista);
  }
}