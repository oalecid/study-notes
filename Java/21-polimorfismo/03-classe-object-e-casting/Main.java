/*
  A classe Object é a classe da qual descendem todas as outras

  É útil pois define um conjunto de métodos comuns para todas
*/

abstract class Animal {
  void som() {};
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
    // Como toda classe é um objeto, isso funciona e compila normalmente
    Object cachorro1 = new Cachorro();
    // cachorro1.som(); -> entretando, Object não tem os métodos customizados, então não vai permitir isso

    Object gato1 = new Gato();
    // gato1.som();

    
    // getClass() é um método comum aos Object
    System.out.println("Nome da classe: " + cachorro1.getClass().getSimpleName());
    System.out.println("Nome da classe: " + gato1.getClass().getSimpleName());


    // CASTING: é possível converter o tipo caso precise, obtendo novamente o mais específico

    Cachorro cachorro1Convertido = (Cachorro) cachorro1;
    cachorro1Convertido.som();


    // É possível usar o CASTING de forma mais rápida
    ((Gato) gato1).som();
  }
}