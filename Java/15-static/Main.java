import operacoes.*;

public class Main {
  public static void main(String args[]) {
    Calculadora calculadora1 = new Calculadora();
    Calculadora calculadora2 = new Calculadora();

    System.out.println("Último resultado salvo na calculadora1: " + calculadora1.ultimoResultado);
    System.out.println("Último resultado salvo na calculadora2: " + calculadora2.ultimoResultado);
    System.out.println("\n");

    System.out.println("Via classe: A soma entre 1 e 2 é " + Calculadora.soma(1, 2));

    System.out.println("Último resultado salvo na calculadora1: " + calculadora1.ultimoResultado);
    System.out.println("Último resultado salvo na calculadora2: " + calculadora2.ultimoResultado);
    System.out.println("\n");

    System.out.println("Via instância calculadora1: A soma entre 3 e 4 é " + calculadora1.soma(3, 4));

    System.out.println("Último resultado salvo na calculadora1: " + calculadora1.ultimoResultado);
    System.out.println("Último resultado salvo na calculadora2: " + calculadora2.ultimoResultado);
  }
}
