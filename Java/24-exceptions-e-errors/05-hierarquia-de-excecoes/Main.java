/*
  Existe uma hierarquia de exceções no Java

  A ordem com que serão tratadas segue essa hierarquia.

  Exemplo:

  java.lang.Object
    > java.lang.Throwable
      > java.lang.Exception
        > java.lang.RuntimeException
          > java.lang.IndexOutOfBoundsException
            > java.lang.ArrayIndexOutOfBoundsException
*/

public class Main {
  public static void exemploHierarquiaException(String opcaoDeErro) {
    try {
      if (opcaoDeErro == "indice") {
        int[] arr1 = {1, 2};

        System.out.println(arr1[999]);
      } else {
        System.out.println(999 / 0);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Erro de índice inválido de array!");
    } catch (Exception e) {
      System.out.println("Uma outra exceção qualquer");
    }
  }

  public static void main(String[] args) {
    exemploHierarquiaException("indice");
    exemploHierarquiaException("outro");
  }
}