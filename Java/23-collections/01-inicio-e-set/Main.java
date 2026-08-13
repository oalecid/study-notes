/*
  Collections

  - Permitem armazenar conjuntos de valores assim como arrays

  - Entretanto, possuem tamanho variável e permitem uma manipulação
  mais fácil de itens

  - Possuem alguns métodos como add(), remove(), clear(), size(),
  isEmpty(), contains(), etc.

  - Collection é a interface raiz, mas as classes de verdade são HashSet,
  ArrayList, HashMap, etc.
*/

import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void exemploSet() {
    /*
      - Sets não permitem duplicações

      - Não garantem a ordem dos elementos

      - Não podem ser acessados via índice,
      só por laços de repetição e alguns outros métodos

      - Entretanto, permitem que verifique se contém um item
      com contains()
    */

    // Set é a interface e HashSet é a classe
    Set<String> set1 = new HashSet<>();

    boolean fulanoFoiAdicionado = set1.add("Fulano");

    set1.add("Cicrano");
    set1.add("Beltrano");

    boolean fulanoFoiAdicionadoNovamente = set1.add("Fulano");

    boolean contemBeltrano = set1.contains("Beltrano");

    System.out.println("Set: " + set1);
    System.out.println("fulanoFoiAdicionado: " + fulanoFoiAdicionado);
    System.out.println("fulanoFoiAdicionadoNovamente: " + fulanoFoiAdicionadoNovamente);
    System.out.println("contemBeltrano: " + contemBeltrano);
  }

  public static void main(String[] args) {
    exemploSet();
  }
}