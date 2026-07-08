import caixadeferramentas.eletricas.Furadeira;
import caixadeferramentas.manuais.ChaveDeFenda;

public class ImportandoTudo {
  public static void main(String args[]) {
    Furadeira furadeira1 = new Furadeira("novo");

    furadeira1.usar();

    ChaveDeFenda chaveDeFenda1 = new ChaveDeFenda("enferrujado");

    chaveDeFenda1.usar();

    ChaveDeFenda chaveDeFenda2 = new ChaveDeFenda("seminovo");

    chaveDeFenda2.usar();
  }
}
