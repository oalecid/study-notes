import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Button;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palco) {
    /*
      Cria um bloco de alinhamento horizontal com dois botões
      que estão alinhados ao centro e à esquerda
    */
    Button botao1 = new Button("botao1");
    Button botao2 = new Button("botao2");

    HBox hBox1 = new HBox(botao1, botao2);
    hBox1.setAlignment(Pos.CENTER_LEFT);

    /*
      Cria um bloco de alinhamento vertical com dois botões
      que estão alinhados ao centro e à direita
    */
    Button botao3 = new Button("botao3");
    Button botao4 = new Button("botao4");

    VBox vBox1 = new VBox(botao3, botao4);
    vBox1.setAlignment(Pos.CENTER_RIGHT);

    /*
      Cria um border pane, que possui cinco posições disponíveis
      e coloca os itens que criamos anteriormente em algumas
      dessas posições
    */
    BorderPane borderPane1 = new BorderPane();

    borderPane1.setTop(hBox1);
    borderPane1.setBottom(vBox1);

    Scene cena1 = new Scene(borderPane1, 500, 500);

    palco.setScene(cena1);
    palco.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}