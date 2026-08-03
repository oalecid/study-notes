/*
  As interfaces são um contrato de estrutura
  que as classes que as implemenetam devem seguir
*/

interface Animal {
  void som();
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

public class Main {
  public static void main (String[] args) {
    new Cachorro().som();
    new Gato().som();
  }
}