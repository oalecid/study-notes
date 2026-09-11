import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    Button botao1 = new Button("Botão 1");
    botao1.getStyleClass().addAll("button", "button--red");

    Button botao2 = new Button("Botão 2");
    botao2.getStyleClass().addAll("button", "button--green");

    Button botao3 = new Button("Botão 3");
    botao3.getStyleClass().addAll("button", "button--blue");

    Button botao4 = new Button("Botão 4");
    botao4.getStyleClass().addAll("button", "button--blue-with-transparency");

    VBox vBox = new VBox(botao1, botao2, botao3, botao4);

    Scene cena = new Scene(vBox, 500, 500);

    cena.getStylesheets().add("file:styles.css");

    palcoPrincipal.setTitle("Teste - CSS - Cores");
    palcoPrincipal.setScene(cena);
    
    palcoPrincipal.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}