import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import utils.GeradorDeSenhas;

public class MinhaAplicacao extends Application {
  public void start(Stage palcoPrincipal) {
    Label labelDoComprimento = new Label("Digite o comprimento da senha que deseja:");
    labelDoComprimento.getStyleClass().add("form-label");

    TextField campoDoComprimento = new TextField();
    campoDoComprimento.setText("8");

    Button botao = new Button("Gerar senha");
    botao.getStyleClass().add("form-button");

    Label labelDoResultado = new Label("Senha gerada");
    labelDoResultado.getStyleClass().add("form-label");

    TextField campoDoResultado = new TextField();
    campoDoResultado.setEditable(false);

    botao.setOnAction(e -> {
      try {
        int comprimento = Integer.parseInt(campoDoComprimento.getText());

        String novaSenha = GeradorDeSenhas.gerarSenha(comprimento);

        campoDoResultado.setText(novaSenha);
      } catch (NumberFormatException ex) {
        campoDoResultado.setText("O valor digitado é inválido!");
      }
    });

    VBox vBox = new VBox(labelDoComprimento, campoDoComprimento, botao, labelDoResultado, campoDoResultado);
    vBox.getStyleClass().add("form-box");

    Scene cena = new Scene(vBox, 500, 500);

    cena.getStylesheets().add("file:assets/styles.css");

    palcoPrincipal.setTitle("Gerador de Senhas Seguras");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}