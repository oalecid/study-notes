public class Main {
  public static void exemploExcecao(int n1, int n2) {
    try {
      double result = n1 / n2;

      String resultText = String.format("A divisão entre %d e %d é %f", n1, n2, result);

      System.out.println(resultText);
    } catch (ArithmeticException e) {
      System.out.println("Não é possível dividir por zero");
    } finally {
      System.out.println("Conta finalizada.\n");
    }
  }

  public static void main(String[] args) {
    exemploExcecao(10, 5);

    exemploExcecao(10, 0);
  }
}