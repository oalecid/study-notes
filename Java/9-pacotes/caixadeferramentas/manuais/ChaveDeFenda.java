package caixadeferramentas.manuais;

public class ChaveDeFenda {
  String estado;

  public ChaveDeFenda(String estadoInit) {
    estado = estadoInit;
  }

  public void usar() {
    if (estado == "enferrujado") {
      System.out.println(this.getClass().getSimpleName() + " está enferrujado! Não vai dar pra usar...");
      return;
    }

    System.out.println("apertando...");
  }
}