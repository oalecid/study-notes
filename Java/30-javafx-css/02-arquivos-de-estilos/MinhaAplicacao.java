import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    Button botao = new Button("Botão teste incrível");

    botao.getStyleClass().add("botao-incrivel");

    VBox vBox = new VBox(botao);

    Scene cena = new Scene(vBox, 500, 500);

    cena.getStylesheets().add("file:styles.css");

    palcoPrincipal.setTitle("Teste de CSS - Estilo via arquivo");
    palcoPrincipal.setScene(cena);
    
    palcoPrincipal.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}