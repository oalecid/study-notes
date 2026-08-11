/*
  Com o polimorfismo, considerando que determinadas subclasses
  herdem de uma superclasse, é possível definir o comportamento de
  acordo com a forma de execução da classe.

  Na prática, um mesmo método pode ter diferentes comportamentos
  de acordo com a classe que está sendo executada, mesmo que ambas
  herdem de uma mesma superclasse.
*/

abstract class Animal {
  void som() {};

  // também é possível definir métodos comuns para as subclasses
  void dormir() {
    System.out.println("zzzzzzzzzzz.....");
  }
}

class Cachorro extends Animal {
  void som() {
    System.out.println("au au au!");
  }
}

class Gato extends Animal {
  void som() {
    System.out.println("miau miau miau!");
  }
}

public class Main {
  public static void main(String[] args) {
    // PRINCIPAAALLL: Mesmo instanciando com a classe Animal no tipo
    // o comportamento é definido pela classe instanciada
    Animal cachorro1 = new Cachorro();
    cachorro1.som();
    cachorro1.dormir();

    Animal gato1 = new Gato();
    gato1.som();
    gato1.dormir();
  }
}