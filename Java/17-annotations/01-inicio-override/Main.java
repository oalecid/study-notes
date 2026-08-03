class Animal {
  public void som() {
    System.out.println("fazendo som...");
  }
}

class Gato extends Animal {
  /*
    Anotações mandam informações específicas para o compilador e ferramenras
    que podem ser úteis

    Nesse caso, ao escrever override, o compilador ficará atendo a
    qualquer erro que impossibilite o override, como, por exemplo
    a ausência do método na classe pai
  */
  @Override
  public void som() {
    System.out.println("miau miau miau");
  }
}

public class Main {
  public static void main(String[] args) {
    Gato gato1 = new Gato();

    gato1.som();
  }
}