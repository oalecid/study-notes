import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void exemploMap() {
    /*
      Maps

      - São para conjuntos de chave-valor, como um objeto no JS ou
      um dicionário no Python

      - As chaves são únicas, mas os valores podem ser duplicados

      - Possui métodos específicos, como put(), get() e remove() adaptados

      - Não dispara erro se a chave acessada não existir

      - Não é ordenado por padrão, para ordenar é possível usar outras
      classes mais específicas, como:

        - LinkedHashMap: ordena de acordo com a ordem de inserção
        - TreeMap: ordena de acordo com as chaves
    */

    // Map não é necessáriamente uma interface relacionada à interface Collection
    // mas a declaração continua seguindo um padrão parecido com as anteriores
    Map<String, Integer> map1 = new HashMap<>();

    map1.put("chave1", 1);
    map1.put("chave2", 2);

    System.out.println("O valor da chave1 é: " + map1.get("chave1"));
    System.out.println("O valor da chave2 é: " + map1.get("chave2"));

    // Ao repetir a chave o valor é atualizado
    map1.put("chave1", 7);

    System.out.println("O valor da chave1 é: " + map1.get("chave1"));
    System.out.println("O valor da chave2 é: " + map1.get("chave2"));

    System.out.println("Contém a chave teste123? " + map1.containsKey("teste123"));
    System.out.println("Contém o valor 123? " + map1.containsValue(123));

    System.out.println("Map " + map1);
  }

  public static void main(String[] args) {
    exemploMap();
  }
}