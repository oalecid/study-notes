package test1;

public class Test {
  // A passagem por valor e por referência parece ser bem semelhante à do JavaScript
  // porém segundo a internet não é 100% igual, mas parece ser beeeemmm parecido na prática
  public static void escreverNoPapel(Papel papel, String novoTexto) {
    papel.texto = novoTexto;
  }

  public static void main(String args[]) {
    Papel papel1 = new Papel("texto 1");

    System.out.println("Texto agora: " + papel1.texto);

    escreverNoPapel(papel1, "texto 1 updated");

    System.out.println("Texto agora: " + papel1.texto);
  }
}