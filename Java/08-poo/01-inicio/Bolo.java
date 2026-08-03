public class Bolo {
  String sabor;
  double valor;

  // construtor
  Bolo(String sabor, double valor) {
    this.sabor = sabor;
    this.valor = valor;
  }

  // main é executado automaticamente se presente
  public static void main(String[] args) {
    Bolo bolo1 = new Bolo("chocolate", 10.99);

    System.out.println("Sabor do bolo: " + bolo1.sabor);
    System.out.println("Preço do bolo: " + bolo1.valor);

    bolo1.sabor = "milho";
    bolo1.valor = 9.99;

    System.out.println("Sabor do bolo: " + bolo1.sabor);
    System.out.println("Preço do bolo: " + bolo1.valor);
  }
}