import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

import javafx.geometry.Insets;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    Label label = new Label("Digite um endereço:");
    label.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

    TextField campoDeTexto = new TextField();
    campoDeTexto.setStyle("-fx-font-size: 16px;");

    Button botao = new Button("Acessar");
    botao.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 16px; -fx-max-width: Infinity;");

    WebView webView = new WebView();
    WebEngine webEngine = webView.getEngine();

    // Pesquisar ao pressionar enter
    campoDeTexto.setOnAction(e -> {
      acessarPagina(webEngine, campoDeTexto);
    });

    // Pesquisar ao apertar botao
    botao.setOnAction(e -> {
      acessarPagina(webEngine, campoDeTexto);
    });

    VBox vBox = new VBox();

    // Outra abordagem para adicionar itens no VBox
    vBox.getChildren().addAll(label, campoDeTexto, botao, webView);

    vBox.setPadding(new Insets(10));
    vBox.setSpacing(15);

    Scene cena = new Scene(vBox, 500, 700);

    palcoPrincipal.setTitle("Mini Browser");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show();
  }

  public void acessarPagina(WebEngine webEngine, TextField campoDeTexto) {
    String enderecoDigitado = campoDeTexto.getText();

    if (!enderecoDigitado.isEmpty()) {
      String enderecoFormatado = formatarUrl(enderecoDigitado);

      System.out.println("Acessando " + enderecoFormatado);

      webEngine.load(enderecoFormatado);
    }
  }

  public String formatarUrl(String url) {
    if (!url.startsWith("http://") || !url.startsWith("https://")) {
      return "http://" + url;
    }

    return url;
  }

  public static void main(String[] args) {
    launch(args);
  }
}