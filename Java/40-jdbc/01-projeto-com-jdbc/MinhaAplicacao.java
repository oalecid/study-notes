import javafx.application.Application;
import javafx.stage.Stage;

import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

// A FXCollections ajuda a criar e gerenciar listas com itens observáveis
import javafx.collections.FXCollections;

// A ObservableList avisa quando os itens mudam
import javafx.collections.ObservableList;

// A PropertyValueFactory é usada para ligar os dados de um objeto a colunas de uma tabela
// facilitando a exibição de tabelas
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;

import java.util.List;

public class MinhaAplicacao extends Application {
  private Connection conexaoDB;

  private ProdutoDAO produtoDAO;
  
  private ObservableList<Produto> produtos;
  private TableView<Produto> tableView;
  
  private TextField nomeInput, quantidadeInput, precoInput;
  private ComboBox<String> statusCombobBox;

  @Override 
  public void start(Stage palcoPrincipal) {
    conexaoDB = ConexaoDB.conectar();

    produtoDAO = new ProdutoDAO(conexaoDB);

    // Carrega os produtos e insere eles em uma lista observável
    produtos = FXCollections.observableArrayList(produtoDAO.listarTodos());

    palcoPrincipal.setTitle("Gerenciamento de Estoque de Produtos");

    VBox vBox = new VBox();
    vBox.setPadding(new Insets(10, 10, 10, 10));
    vBox.setSpacing(10);
  }

  public static void main(String[] args) {
    launch(args);
  }
}