/*
  As interfaces também podem ter métodos "default" e "static"

  Os métodos default definem uma implementação padrão,
  mas podem ser sobrescritos

  Os métodos static pertencem à própria interface e devem
  ser chamados pela própria interface
*/

interface ExemploInterface {
  // método abstract
  void metodoAbstrato();

  // método default
  default void metodoDefault() {
    System.out.println("método com implementação padrão (default)");
  }

  // método static
  static void metodoStatic() {
    System.out.println("método da própria interface (static)");
  }
}

class ExemploClasse1 implements ExemploInterface {
  public void metodoAbstrato() {
    System.out.println("método abstrato implementado na classe");
  }
}

public class Main {
  public static void main(String[] args) {
    ExemploClasse1 exp1 = new ExemploClasse1();

    exp1.metodoAbstrato();
    exp1.metodoDefault();

    // exp1.metodoStatic(); <- errado
    ExemploInterface.metodoStatic();
  }
}