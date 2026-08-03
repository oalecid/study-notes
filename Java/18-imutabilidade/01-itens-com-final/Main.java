class TestClass1 {
  // 1 - Métodos com final não podem ser sobrescritos
  final void meuMetodo() {
    System.out.println("Esse método nunca pode ser sobrescrito");
  }
}

// Tentar sobrescrever método com final causa erro
// class TestClass2 extends TestClass1 {
//   void meuMetodo() {
//     // ...
//   }
// }

// 2 - Classes com final não podem ser extendidas
final class TestClass3 {
  // ...
}

// class TestClass4 extends TestClass3 {}

public class Main {
  public static void main(String[] args) {
    // 3 - Nesse caso final transforma a variável em uma constante
    // que nunca pode mudar
    final int CONSTANTE_1 = 123;

    // Tentar mudar o valor causa erro
    // constante1 = 456;

    System.out.println("A constante com valor " + CONSTANTE_1 + " nunca muda");
  }
}