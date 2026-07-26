package seguranca;

// A sobrecarga de métodos considera apenas o NOME e os PARÂMETROS
// O restante se mudar não influencia

public class ControleDeAcesso {
  boolean acessoAutorizado = false;

  public String getAcessoAutorizado() {
    return acessoAutorizado == true ? "SIM" : "NÃO";
  }

  public void autorizarAcesso(String decisao) {
    acessoAutorizado = decisao == "SIM";
  }

  public void autorizarAcesso(boolean decisao) {
    acessoAutorizado = decisao;
  }
}