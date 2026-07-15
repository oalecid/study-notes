package escola;

public class Aluno {
  private String nome;
  private double nota1;
  private double nota2;
  private double nota3;

  public Aluno(String nomeInit, double nota1Init, double nota2Init, double nota3Init) {
    nome = nomeInit;

    nota1 = nota1Init;
    nota2 = nota2Init;
    nota3 = nota3Init;
  }

  public void setNome(String novoNome) {
    nome = novoNome;
  }

  public String getNome() {
    return nome;
  }

  public double getMedia() {
    return (nota1 + nota2 + nota3) / 3;
  }
}