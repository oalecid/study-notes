class Comida {
  double preco;
  String nome;

  Comida(String nomeInit, double precoInit) {
    nome = nomeInit;
    preco = precoInit;
  }

  void exibirPreco() {
    System.out.println("O preço da comida " + nome + " é " + preco);
  }
}

class Sanduiche extends Comida {
  String sabor;

  Sanduiche(String saborInit) {
    super("sanduíche", 15.99);

    sabor = saborInit;
  }

  void exibirSabor() {
    System.out.println("O sanduíche é de " + sabor);
  }
}

public class Main {
  public static void main(String[] args) {
    Sanduiche s1 = new Sanduiche("frango");

    s1.exibirSabor();
    s1.exibirPreco();
  }
}