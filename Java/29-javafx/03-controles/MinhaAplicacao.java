import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// Layouts são para colocar e organizar elementos dentro
// VBox faz um alinhamento vertical de itens
import javafx.scene.layout.VBox;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palco) {
    Label label = new Label("Label incrível");

    Button botao = new Button("Botão incrível");

    TextField campoDeTexto = new TextField();

    // A ordem dos itens definirá a posição de cada um
    VBox layout = new VBox(label, botao, campoDeTexto);

    // Você passa o VBox e o tamanho da cena
    Scene cena = new Scene(layout, 300, 200);

    palco.setScene(cena);
    palco.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}