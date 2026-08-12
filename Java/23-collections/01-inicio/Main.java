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
    // Sets não permitem duplicações

    // Set é a interface e HashSet é a classe
    Set<String> set1 = new HashSet<>();

    set1.add("Fulano");
    set1.add("Cicrano");
    set1.add("Beltrano");

    set1.add("Fulano");
    set1.add("Fulano");

    System.out.println("Set: " + set1);
  }

  public static void main(String[] args) {
    exemploSet();
  }
}