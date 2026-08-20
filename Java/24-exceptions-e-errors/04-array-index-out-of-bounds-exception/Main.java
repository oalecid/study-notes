/*
  ArrayIndexOutOfBoundsException ocorre quando você
  tenta acessar um índice de um array que não está disponível
*/

public class Main {
  public static void exemploErroArray() {
    // Outra forma de declarar um array
    // Parece que essa forma só funciona na inicialização mesmo
    int[] valores = {7, 8, 9};

    try {
      System.out.println(valores[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Tentou acessar índice não disponível!");
    }
  }

  public static void main() {
    exemploErroArray();
  }
}