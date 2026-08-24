/*
  Sobre interfaces funcionais

  Basicamente, se for comparar com JavaScript, é só uma forma complicada de
  declarar uma função, como se você tivesse que definir o molde dos parâmetros antes
*/

@FunctionalInterface
interface Calculo {
  double executar(double a, double b);
}

public class Main {
  public static void main(String[] args) {
    // É como se estivesse declarando várias funçõeszinhas seguindo o molde
    Calculo soma = (a, b) -> a + b;
    Calculo subtracao = (a, b) -> a - b;
    Calculo multiplicacao = (a, b) -> a * b;
    Calculo divisao = (a, b) -> a / b;

    double n1 = 3.0;
    double n2 = 7.0;

    System.out.println(String.format("A soma entre %f e %f é %f", n1, n2, soma.executar(n1, n2)));
    System.out.println(String.format("A subtração entre %f e %f é %f", n1, n2, subtracao.executar(n1, n2)));
    System.out.println(String.format("A multiplicação entre %f e %f é %f", n1, n2, multiplicacao.executar(n1, n2)));
    System.out.println(String.format("A divisão entre %f e %f é %f", n1, n2, divisao.executar(n1, n2)));
  }
}

/*
  Em alguns casos, como esse, acaba que fica menor do que se você
  fosse criar uma classe contendo cada um dos métodos
*/
