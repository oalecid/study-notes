package operacoes;

// static permite que o item seja utilizado mesmo que a classe não esteja instanciada

public class Calculadora {
  // Membros static pertencem à classe, não ao objeto
  // Podem ser acessados diretamente pela classe também
  // As instâncias vão compartilhar o mesmo membro static (todas as instâncias terão o mesmo)
  public static int ultimoResultado;
  
  public static int soma(int a, int b) {
    ultimoResultado = a + b;

    return ultimoResultado;
  }
}


// Observação: Em uma mesma classe, é possível chamar um método static dentro de um normal
// mas não é possível chamar um método normal dentro de um static (sendo necessário instanciar antes)