class Personagem {
  void falar() {
    System.out.println("falando...");;
  }
}

class Picapau extends Personagem {
  void falar() {
    System.out.println("ei cara, você gosta de pipoca?");
  }
}

public class Main {
  public static void main(String[] args) {
    Picapau p1 = new Picapau();

    p1.falar();
  }
}