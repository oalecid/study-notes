import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void exemploList() {
    /*
      - Mais semelhante a um array, porém com tamanho variável

      - Permite duplicações
    */

    // List é a interface e ArrayList é a classe
    List<String> list1 = new ArrayList<>();

    boolean fulanoFoiAdicionado = list1.add("Fulano");

    list1.add("Cicrano");
    list1.add("Beltrano");

    boolean fulanoFoiAdicionadoNovamente = list1.add("Fulano");

    boolean contemBeltrano = list1.contains("Beltrano");

    System.out.println("exemploList ArrayList: " + list1);
    System.out.println("exemploList fulanoFoiAdicionado: " + fulanoFoiAdicionado);
    System.out.println("exemploList fulanoFoiAdicionadoNovamente: " + fulanoFoiAdicionadoNovamente);
    System.out.println("exemploList contemBeltrano: " + contemBeltrano);

    System.out.println("exemploList: Acessando pelo índice: " + list1.get(2));
  }

  public static void exemploAsList() {
    // Arrays.asList cria uma lista com base nos valores informados
    // entretanto, a lista gerada com ele se parece mais com os arrays normais
    // pois tem tamanho fixo

    List<String> listaFixa = Arrays.asList("a", "do", "le", "tá");

    // listaFixa.add("teste"); <- retorna erro durante a execução

    for (String listaFixaItem : listaFixa) {
      System.out.println("exemploAsList: " + listaFixaItem);
    }
  }

  public static void exemploAdicionarMultiplosItens() {
    List<String> list1 = new ArrayList<>();

    list1.add("borboletinha");
    list1.add("amarelinha");

    List<String> listaFixaTemporaria = Arrays.asList("fazendo", "chocolate", "para", "a", "madrinha");

    // addAll adiciona todos os itens dessa lista fixa temporária à
    // lista original
    list1.addAll(listaFixaTemporaria);

    System.out.println("exemploAdicionarMultiplosItens: " + list1);
  }

  public static void main(String[] args) {
    exemploList();
    exemploAsList();
    exemploAdicionarMultiplosItens();
  }
}