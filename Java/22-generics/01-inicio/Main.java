/*
  Generics permitem que você passe um tipo quase como um "parâmetro"

  - O tipo passado por generic será utilizado como referência,
  como se fosse um "tipo dinâmico"

  - É bem parecido com a forma de uso no Typescript

  - Entretanto, os generics do Java não aceitam tipos primitivos. Se quiser passar
  um tipo primitivo vai precisar fazer algum tipo de conversão

  - Erros de polimorfismo geralmente só são pegos na execução. Com os Generics é possível evitar isso e detectar esses erros
  durante a compilação
*/

class GuardaValores<T> {
  private T valorGuardado;

  public void guardarValor(T valorComTipoIndefinido) {
    this.valorGuardado = valorComTipoIndefinido;
  }

  public T obterValor() {
    return valorGuardado;
  }
}

public class Main {
  public static void main(String[] args) {
    GuardaValores<String> guardaStrings = new GuardaValores<>();

    guardaStrings.guardarValor("teste123");
    // guardaStrings.guardarValor(123); <- integer não vai ser aceito pois o T foi definido como String neste guarda valores

    System.out.println("string guardada: " + guardaStrings.obterValor());

    GuardaValores<Integer> guardaInteiros = new GuardaValores<>();

    // Não aceita int, é preciso converter para Integer
    guardaInteiros.guardarValor(Integer.valueOf(7));

    System.out.println("inteiro guardado: " + guardaInteiros.obterValor());
  }
}