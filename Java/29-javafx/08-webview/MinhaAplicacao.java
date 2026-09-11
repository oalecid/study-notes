import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.web.WebView;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    WebView webView = new WebView();

    String urlDaPagina = "https://youtu.be/vL52_D2lNoY";

    webView.getEngine().load(urlDaPagina);

    Scene cena = new Scene(webView, 800, 600);

    palcoPrincipal.setTitle("Exemplo de carregamento de página externa");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}