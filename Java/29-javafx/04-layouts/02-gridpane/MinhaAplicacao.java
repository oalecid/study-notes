import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.geometry.Insets;

import javafx.scene.layout.GridPane;

/*
  GridPane organiza elementos em grade, com linhas e colunas

  Os Insets são usados para espaçamento ao redor de elementos
*/

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palco) {
    Label labelNome = new Label("Nome:");
    Label labelEmail = new Label("Email:");

    TextField campoNome = new TextField();
    TextField campoEmail = new TextField();

    Button botaoSubmit = new Button("Salvar");

    GridPane gridPane = new GridPane();

    // Configura o espaçamento horizontal entre células (nesse caso em pixels)
    gridPane.setHgap(8);

    // Configura o espaçamento vertical entre células (nesse caso em pixels)
    gridPane.setVgap(8);

    // Configura o espaçamento externo (nesse caso em pixels)
    // com o Insets, todos os lados vão ter o padding de 5 pixels
    gridPane.setPadding(new Insets(5));

    gridPane.addRow(0, labelNome, campoNome);
    gridPane.addRow(1, labelEmail, campoEmail);
    gridPane.addRow(2, botaoSubmit);

    Scene cena = new Scene(gridPane, 500, 500);

    palco.setScene(cena);
    
    palco.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}