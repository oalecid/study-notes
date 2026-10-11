import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
  // Caminho para o arquivo do banco de dados (será criado se não existir)
  private static final String URL_JDBC_PADRAO = "jdbc:sqlite:meu_banco_de_dados.db";

  // Método de conexão padrão (SQLite)
  public static Connection conectar() {
    try {
      return DriverManager.getConnection(URL_JDBC_PADRAO);
    } catch (SQLException e) {
      // Para printar erros, esse método mostra de forma mais destacada
      // Porém pode não aparecer destacado em um terminal normal
      System.err.println("Erro ao conectar ao database: " + e.getMessage());
      
      return null;
    }
  }

  // Método de conexão genérico (URL, usuário e senha) - útil para MySQL
  public static Connection conectarGenerico(String url, String usuario, String senha) {
    try {
      return DriverManager.getConnection(url, usuario, senha);
    } catch (SQLException e) {
      // Para printar erros, esse método mostra de forma mais destacada
      // Porém pode não aparecer destacado em um terminal normal
      System.err.println("Erro ao conectar ao database (genérico): " + e.getMessage());
      
      return null;
    }
  }
}