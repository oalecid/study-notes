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
import java.sql.SQLException;
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

    HBox nomeProdutoBox = new HBox();
    nomeProdutoBox.setSpacing(10);
    Label nomeLabel = new Label("Produto:");
    nomeInput = new TextField();
    nomeProdutoBox.getChildren().addAll(nomeLabel, nomeInput);

    HBox quantidadeProdutoBox = new HBox();
    quantidadeProdutoBox.setSpacing(10);
    Label quantidadeLabel = new Label("Quantidade:");
    quantidadeInput = new TextField();
    quantidadeProdutoBox.getChildren().addAll(quantidadeLabel, nomeInput);

    HBox precoProdutoBox = new HBox();
    precoProdutoBox.setSpacing(10);
    Label precoLabel = new Label("Preço:");
    precoInput = new TextField();
    precoProdutoBox.getChildren().addAll(precoLabel, nomeInput);

    HBox statusProdutoBox = new HBox();
    statusProdutoBox.setSpacing(10);
    Label statusLabel = new Label("Status:");
    statusCombobBox = new ComboBox<>();
    statusCombobBox.getItems().addAll("Estoque Normal", "Estoque Baixo");
    statusProdutoBox.getChildren().addAll(statusLabel, statusCombobBox);

    Button addButton = new Button("Adicionar");
    addButton.setOnAction(e -> {
      String precoFormatado = precoInput.getText().replace(",", ".");

      Produto produto = new Produto(
        nomeInput.getText(),
        Integer.parseInt(quantidadeInput.getText()),
        Double.parseDouble(precoFormatado),
        statusCombobBox.getValue()
      );

      produtoDAO.inserir(produto);

      produtos.setAll(produtoDAO.listarTodos());

      limparCampos();
    });

    Button updateButton = new Button("Atualizar");
    updateButton.setOnAction(e -> {
      Produto selectedProduto = tableView.getSelectionModel().getSelectedItem(); // Pega o produto selecionado na tabela

      if (selectedProduto != null) {
        String precoFormatado = precoInput.getText().replace(",", ".");

        selectedProduto.setNome(nomeInput.getText());
        selectedProduto.setQuantidade(Integer.parseInt(quantidadeInput.getText()));
        selectedProduto.setPreco(Double.parseDouble(precoFormatado));
        selectedProduto.setStatus(statusCombobBox.getValue());

        produtoDAO.atualizar(selectedProduto);

        produtos.setAll(produtoDAO.listarTodos());

        limparCampos();
      }
    });

    Button deleteButton = new Button("Excluir");
    deleteButton.setOnAction(e -> {
      Produto selectedProduto = tableView.getSelectionModel().getSelectedItem();

      if (selectedProduto != null) {
        produtoDAO.excluir(selectedProduto.getId());

        produtos.setAll(produtoDAO.listarTodos());

        limparCampos();
      }
    });

    Button clearButton = new Button("Limpar");
    clearButton.setOnAction(e -> limparCampos());

    tableView = new TableView<>();
    tableView.setItems(produtos);

    // Ajusta o tamanho das colunas
    // Com essa política específica, a largura de todas as colunas juntas deve ser igual ao tamanho da tabela
    // (acredito que elas se esticam para ocupar tudo)
    tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS);

    // Cria uma lista de colunas para a tabela
    List<TableColumn<Produto, ?>> columns = List.off(
      criarColuna("ID", "id"),
      criarColuna("Produto", "nome"),
      criarColuna("Quantidade", "quantidade"),
      criarColuna("Preço", "preco"),
      criarColuna("Status", "status")
    );

    tableView.getColumns().addAll(columns);

    // Define o que acontece quando algo muda na tabela
    // no caso, a seleção de itens
    tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
      if (newSelection != null) {
        nomeInput.setText(newSelection.getNome());
        quantidadeInput.setText(String.valueOf(newSelection.getQuantidade()));
        precoInput.setText(String.valueOf(newSelection.getPreco()));
        statusCombobBox.setValue(newSelection.getStatus());
      }
    });

    HBox buttonBox = new HBox();
    buttonBox.setSpacing(10);
    buttonBox.getChildren().addAll(addButton, updateButton, deleteButton, clearButton);

    vBox.getChildren().addAll(nomeProdutoBox, quantidadeProdutoBox, precoProdutoBox, statusProdutoBox, buttonBox, tableView);

    Scene scene = new Scene(vBox, 800, 600);
    // scene.getStylesheets().add("styles-produtos.css");

    palcoPrincipal.setScene(scene);
    palcoPrincipal.show();
  }

  // stop() é chamado quando a aplicação é encerrada
  @Override
  public void stop() {
    try {
      conexaoDB.close();
    } catch (SQLException e) {
      System.err.println("Erro ao fechar conexão: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}