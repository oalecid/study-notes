import seguranca.ControleDeAcesso;

public class Main {
  public static void main(String args[]) {
    ControleDeAcesso controlador1 = new ControleDeAcesso();

    System.out.println("O acesso está autorizado? - " + controlador1.getAcessoAutorizado());

    controlador1.autorizarAcesso("SIM");

    System.out.println("O acesso está autorizado? - " + controlador1.getAcessoAutorizado());

    controlador1.autorizarAcesso(false);

    System.out.println("O acesso está autorizado? - " + controlador1.getAcessoAutorizado());
  }
}
