/*
  Também vale para interfaces
*/

interface Personagem {
  void atacar();
}

class Guerreiro implements Personagem {
  @Override
  public void atacar() {
    System.out.println("esspaaaaaadaaaaaaaaa");
  }
}

class Monstro implements Personagem {
  @Override
  public void atacar() {
    System.out.println("moooorrdiiiidaaaaaaaa");
  }
}

public class Main {
  public static void main(String[] args) {
    Personagem guerreiro1 = new Guerreiro();
    guerreiro1.atacar();

    Personagem monstro1 = new Monstro();
    monstro1.atacar();
  }
}