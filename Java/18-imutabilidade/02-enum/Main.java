/*
  Enums podem ser usados para definir
  conjuntos de constantes que permitem uma melhor
  organização de alguns valores

  Os itens dos enums são final e static por padrão

  Por padrão, os valores são os próprios nomes dos itens.
*/

enum SaboresDeBolo {
  MORANGO, CHOCOLATE, ABACAXI, LEITE, MILHO
}

public class Main {
  public static void main(String[] args) {
    SaboresDeBolo sabor1 = SaboresDeBolo.CHOCOLATE;

    System.out.println("O sabor escolhido foi o de " + sabor1);
  }
}