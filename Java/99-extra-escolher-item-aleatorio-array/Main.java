import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static String exemploEscolherItemAleatorioArr(List<String> arr) {
    Random random = new Random();

    int tamanhoDoArr = arr.size();
    
    int indiceAleatorioGerado = random.nextInt(tamanhoDoArr);

    return arr.get(indiceAleatorioGerado);
  }
  
  public static void main(String[] args) {
    List<String> listaExemplo = new ArrayList<>(List.of("Batata", "Maçã", "Banana", "Uva", "Laranja"));

    String itemAleatorio = exemploEscolherItemAleatorioArr(listaExemplo);

    System.out.println("Item aleatório escolhido: " + itemAleatorio);
  }
}