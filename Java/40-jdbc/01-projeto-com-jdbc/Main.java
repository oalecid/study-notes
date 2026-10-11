import java.sql.Connection;
import java.util.List;

/*
  IMPORTANTEEE: Executar CriadorTabela.java antes
  para criar a tabela de produtos
*/

public class Main {
  public static void main(String[] args) {
    try (Connection conexao = ConexaoDB.conectar()) {
      ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

      System.out.println("Resetando tabela...");
      produtoDAO.excluirTodos();

      mostrarProdutos(produtoDAO);

      System.out.println("\nInserindo produtos...");

      Produto produto1 = new Produto("produto1", 2, 10, "DISPONÍVEL");
      Produto produto2 = new Produto("produto2", 999, 99.90, "DISPONÍVEL");

      produtoDAO.inserir(produto1);
      produtoDAO.inserir(produto2);

      mostrarProdutos(produtoDAO);

      System.out.println("\nConsultando produto...");

      Produto produtoConsultado = produtoDAO.consultarPorId(1);

      if (produtoConsultado == null) {
        System.out.println("Produto 1 não encontrado");
      } else {
        System.out.println("Produto encontrado: " + produtoConsultado.getNome());
      }

      System.out.println("\nAtualizando produto...");

      produtoConsultado.setNome("produto1 updated");
      produtoConsultado.setQuantidade(1);
      produtoConsultado.setPreco(20);
      produtoConsultado.setStatus("POUCAS UNIDADES");

      produtoDAO.atualizar(produtoConsultado);

      mostrarProdutos(produtoDAO);

      System.out.println("\nExcluindo produto...");

      produtoDAO.excluir(1);

      mostrarProdutos(produtoDAO);
    } catch (Exception e) {
      System.err.println("Erro geral: " + e.getMessage());
    }
  }

  private static void mostrarProdutos(ProdutoDAO produtoDAO) {
    List<Produto> todosOsProdutos = produtoDAO.listarTodos();

    System.out.println("\nMostrando produtos:");

    if (todosOsProdutos.isEmpty()) {
      System.out.println("Nenhum produto encontrado");
    } else {
      for (Produto dadosDoProduto : todosOsProdutos) {
        System.out.println(
          "Produto " + dadosDoProduto.getId() +
          ": " + dadosDoProduto.getNome() +
          " - Quantidade: " + dadosDoProduto.getQuantidade() +
          " - R$" + dadosDoProduto.getPreco() +
          " - " + dadosDoProduto.getStatus()
        );
      }
    }
  }
}