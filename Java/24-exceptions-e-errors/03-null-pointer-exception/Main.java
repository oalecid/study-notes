/*
  A NullPointerException ocorre quando você
  tenta acessar um objeto nulo.
*/

public class Main {
  public static void exemploObjetoNulo() {
    String strVazia = null;

    try {
      int tamanhoStr = strVazia.length();

      System.out.println("O tamanho da string é " + tamanhoStr);
    } catch (NullPointerException e) {
      System.out.println("A variável acessada está vazia.");
    }
  }
  
  public static void main(String[] args) {
    exemploObjetoNulo();
  }
}