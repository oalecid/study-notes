import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void exibirApenasImpares(Set<Integer> lista) {
    lista.removeIf(n -> n % 2 == 0);

    System.out.println(lista);
  }
  
  public static void main(String[] args) {
    Set<Integer> lista = new HashSet<>();

    lista.add(0);
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);
    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);

    exibirApenasImpares(lista);
  }
}