import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;

import javafx.scene.layout.BorderPane;

import java.io.File;
import java.io.PrintWriter;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage stage) {
    TextArea textArea = new TextArea();
    textArea.setPromptText("Digite o conteúdo do arquivo");

    Button button = new Button("Salvar");
    button.setStyle("-fx-text-fill: #ffffff; -fx-background-color: #323232;");

    button.setOnAction((event) -> saveText(textArea));

    ToolBar toolBar = new ToolBar(button);

    BorderPane borderPane = new BorderPane();
    borderPane.setTop(toolBar);
    borderPane.setCenter(textArea);

    Scene scene = new Scene(borderPane, 500, 500);

    stage.setScene(scene);
    stage.setTitle("Editor de Texto Básico");

    stage.show();
  }

  private void saveText(TextArea textArea) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Salvar Arquivo de Texto");

    // Exibe o dialog pra salvar arquivo
    // null significa que o dialog não estará vinculado a nenhuma outra janela
    // file receberá o resultado
    // (segundo o moço do curso pode ser que venha como null se não selecionar nada)
    File file = fileChooser.showSaveDialog(null);

    if (file != null) {
      try {
        try (PrintWriter writer = new PrintWriter(file)) {
          writer.println(textArea.getText());
        }
      } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}