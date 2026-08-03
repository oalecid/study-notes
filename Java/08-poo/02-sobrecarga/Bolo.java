public class Bolo {
  String sabor;
  double valor;

  // construtor
  Bolo(String sabor, double valor) {
    this.sabor = sabor;
    this.valor = valor;
  }

  // ao usar a sobrecarga, é possível declarar sem passar os atributos
  // e adicioná-los depois
  Bolo() {
  }

  // main é executado automaticamente se presente
  public static void main(String[] args) {
    Bolo bolo1 = new Bolo("chocolate", 10.99);

    System.out.println("Sabor do bolo 1: " + bolo1.sabor);
    System.out.println("Preço do bolo 1: " + bolo1.valor);

    Bolo bolo2 = new Bolo();
    bolo2.sabor = "milho";
    bolo2.valor = 9.99;

    System.out.println("Sabor do bolo 2: " + bolo2.sabor);
    System.out.println("Preço do bolo 2: " + bolo2.valor);
  }
}