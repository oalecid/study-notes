/*
  Para lançar uma exceção intencionalmente, use
  a palavra throw
*/

public class Main {
  public static void exemploLancarExcecao(int opcao) {
    switch (opcao) {
      case 1:
        System.out.println("Opção 1");
        break;
      case 2:
        throw new IllegalArgumentException("Opção depreciada!");
      default:
        throw new IllegalArgumentException("Opção inválida!");
    }
  }

  public static void main(String[] args) {
    exemploLancarExcecao(1);
    
    try {
      exemploLancarExcecao(2);
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }

    try {
      exemploLancarExcecao(3);
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}