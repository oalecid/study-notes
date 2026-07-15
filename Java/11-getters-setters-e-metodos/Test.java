import escola.Aluno;

public class Test {
  public static void main(String args[]) {
    Aluno aluno1 = new Aluno("test", 7, 8, 9);

    aluno1.setNome("updated test");

    System.out.println("O aluno " + aluno1.getNome() + " possui média " + aluno1.getMedia());
  }
}
