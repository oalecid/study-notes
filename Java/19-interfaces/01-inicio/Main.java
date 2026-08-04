/*
  As interfaces são um contrato de estrutura
  que as classes que as implemenetam devem seguir

  - Elas não podem ser instanciadas diretamente

  - Todos os atributos de uma interface são public, final e static
  (mesmo que não esteja explicitamente escrito)

  - Todos os métodos de uma interface devem ser o mais acessível possível (public)

  - A palavra abstract é opcional

  - Uma interface pode estender outras interfaces
  (uma ou mais, ao contrário das classes, que só podem estender um item)
*/

interface Animal {
  void som(); // método abstrato
}

class Cachorro implements Animal {
  public void som() {
    System.out.println("au au!");
  }
}

class Gato implements Animal {
  public void som() {
    System.out.println("miau miau miau");
  }
}


interface Personagem {
  abstract void falar(); // "abstract" é opcional
}

// dá pra extender interfaces
interface PersonagemDaVila extends Personagem {
  void cantar();
}

class Chaves implements PersonagemDaVila {
  public void falar() {
    System.out.println("Ninguém tem paciência comigo!");
  }

  public void cantar() {
    System.out.println("Que bonita a sua rooooouupaaaaa");
  }
}


public class Main {
  public static void main (String[] args) {
    new Cachorro().som();
    new Gato().som();

    new Chaves().falar();
    new Chaves().cantar();
  }
}