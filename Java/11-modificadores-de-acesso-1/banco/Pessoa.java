package banco;

// package-private é o modificador padrão -> acessível dentro do mesmo pacote ou da mesma classe
class Pessoa {
  // protected -> pode ser acessado dentro da mesma classe, dentro do mesmo pacote e em subclasses
  // mesmo que estejam em pacotes diferentes
  protected String nome;

  protected Pessoa(String nomeInit) {
    nome = nomeInit;
  }
}