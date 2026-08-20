/*
  É possível declarar que um método pode lançar uma exceção

  Isso faz com que a responsabilidade de colocar try catch ou não
  seja de quem chame ele
*/

public class Main {
  public static int exemploDivisao(int a, int b) throws ArithmeticException {
    return a / b;
  }

  public static void main(String[] args) {
    try {
      System.out.println(exemploDivisao(10, 0));
    } catch (Exception e) {
      System.out.println("Exceção detectada!");
    }
  }
}