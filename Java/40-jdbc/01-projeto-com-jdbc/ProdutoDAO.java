import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

// Data Access Object
public class ProdutoDAO {
  private final Connection CONEXAO_DB;
  
  public ProdutoDAO(Connection conexao) {
    CONEXAO_DB = conexao;
  }

  // Inserir novo produto
  public void inserir(Produto produto) {
    String comandoSql = "INSERT INTO produtos (nome_produto, quantidade, preco, status) VALUES (?, ?, ?, ?)";

    // O PreparedStatement facilita a definição dos campos
    // O try with resources facilita declarar sem precisar fechar com close() depois
    
    // DICA: caso precise, no try with resources é possível declarar vários itens de uma vez
    // mesmo que uns dependam dos outros,
    // mas não é o caso aqui
    try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(comandoSql)) {
      // Definindo campos da query
      stmt.setString(1, produto.getNome());
      stmt.setInt(2, produto.getQuantidade());
      stmt.setDouble(3, produto.getPreco());
      stmt.setString(4, produto.getStatus());

      // Realizando inserção
      stmt.executeUpdate();
    } catch (SQLException e) {
      System.err.println("Erro ao inserir produto: " + e.getMessage());
    }
  }

  // Excluir todos os produtos
  public void excluirTodos() {
    String comandoSql = "DELETE FROM produtos";

    try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(comandoSql)) {
      stmt.executeUpdate();
    } catch (SQLException e) {
      System.err.println("Erro ao excluir todos os produtos: " + e.getMessage());
    }
  }

  // Excluir produto pelo ID
  public void excluir(int idDoProduto) {
    String comandoSql = "DELETE FROM produtos WHERE id_produto = ?";

    try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(comandoSql)) {
      stmt.setInt(1, idDoProduto);

      stmt.executeUpdate();
    } catch (SQLException e) {
      System.err.println("Erro ao excluir produto: " + e.getMessage());
    }
  }

  // Consultar por ID
  public Produto consultarPorId(int idDoProduto) {
    String comandoSql = "SELECT * FROM produtos WHERE id_produto = ?";

    try (
      PreparedStatement stmt = CONEXAO_DB.prepareStatement(comandoSql);
    ) {
      stmt.setInt(1, idDoProduto);

      try (ResultSet rs = stmt.executeQuery()) {
        // next() verifica se há resultado
        if (rs.next()) {
          Produto produto = new Produto();

          produto.setId(rs.getInt("id_produto"));
          produto.setNome(rs.getString("nome_produto"));
          produto.setQuantidade(rs.getInt("quantidade"));
          produto.setPreco(rs.getDouble("preco"));
          produto.setStatus(rs.getString("status"));

          return produto;
        }
      }
    } catch (SQLException e) {
      System.err.println("Erro ao consultar por ID: " + e.getMessage());
    }

    return null;
  }

  // Atualizar item
  public void atualizar(Produto produto) {
    String comandoSql = "UPDATE produtos " +
      "SET nome_produto = ?, quantidade = ?, preco = ?, status = ? " +
      "WHERE id_produto = ?";

    try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(comandoSql)) {
      stmt.setString(1, produto.getNome());
      stmt.setInt(2, produto.getQuantidade());
      stmt.setDouble(3, produto.getPreco());
      stmt.setString(4, produto.getStatus());
      stmt.setInt(5, produto.getId());

      stmt.executeUpdate();
    } catch (SQLException e) {
      System.err.println("Erro ao atualizar produto: " + e.getMessage());
    }
  }

  // Listar todos
  public List<Produto> listarTodos() {
    String comandoSql = "SELECT * FROM produtos";

    List<Produto> produtos = new ArrayList<>();

    try (
      PreparedStatement stmt = CONEXAO_DB.prepareStatement(comandoSql);
      ResultSet rs = stmt.executeQuery()
    ) {
      while (rs.next()) {
        Produto produto = new Produto();

        produto.setId(rs.getInt("id_produto"));
        produto.setNome(rs.getString("nome_produto"));
        produto.setQuantidade(rs.getInt("quantidade"));
        produto.setPreco(rs.getDouble("preco"));
        produto.setStatus(rs.getString("status"));

        produtos.add(produto);
      }
    } catch (SQLException e) {
      System.err.println("Erro ao listar produtos: " + e.getMessage());
    }

    return produtos;
  }
}
