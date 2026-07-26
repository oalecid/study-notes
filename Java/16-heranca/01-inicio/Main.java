class Personagem {
  void atacar() {
    System.out.println("atacando...");;
  }

  void defender() {
    System.out.println("defendendo...");
  }
}

class Sayajin extends Personagem {
  void kamehameha() {
    System.out.println("kame... hame... haaaaaaaaaaa");
  }
}

public class Main {
  public static void main(String[] args) {
    Sayajin s1 = new Sayajin();

    s1.atacar();
    s1.defender();

    s1.kamehameha();
  }
}