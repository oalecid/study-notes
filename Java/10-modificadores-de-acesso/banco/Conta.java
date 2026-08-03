package banco;

public class Conta {
  // Propriedades privadas só podem ser acessadas internamente
  private double saldo;
  private Pessoa pessoa;
  
  // Sobrecarga de construtores

  // O construtor privado só pode ser chamado de dentro da classe
  private Conta(String nomeInit, double saldoInit) {
    saldo = saldoInit;
    
    pessoa = new Pessoa(nomeInit);
  }

  // O construtor público pode ser acessado externamente
  public Conta(String nomeInit) {
    Conta conta1 = new Conta(nomeInit, 0);

    System.out.println("Conta criada com nome " + conta1.pessoa.nome + " e saldo " + conta1.saldo);
  }
}