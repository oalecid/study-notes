/*
  A partir da versão 22 do Java é possível usar variáveis sem nome com _

  Isso é particularmente útil para lidar com exceções em que a variável do
  erro não é utilizada.
*/

public class Main {
  public static void exemploVariavelSemNome() {
    try {
      System.out.println(10 / 0);
    } catch (Exception _) {
      System.out.println("Este é um erro qualquer em que a variável da exceção não é utilizada.");
    }
  }

  public static void main(String[] args) {
    exemploVariavelSemNome();
  }
}