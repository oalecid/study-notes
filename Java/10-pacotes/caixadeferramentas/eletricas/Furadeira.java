package caixadeferramentas.eletricas;

public class Furadeira {
  String estado;

  public Furadeira(String estadoInit) {
    // Outra forma de inicializar variáveis, se os nomes não estiverem em conflito
    estado = estadoInit;
  }

  public void usar() {
    if (estado == "enferrujado") {
      System.out.println(this.getClass().getSimpleName() + " está enferrujado! Não vai dar pra usar...");
      return;
    }

    System.out.println("furando...");
  }
}