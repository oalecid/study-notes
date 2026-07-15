package operacoes;

// static permite que o item seja utilizado mesmo que a classe não esteja instanciada

public class Calculadora {
  public static int soma(int a, int b) {
    return a + b;
  }
}


// Observação: Em uma mesma classe, é possível chamar um método static dentro de um normal
// mas não é possível chamar um método normal dentro de um static (sendo necessário instanciar antes)