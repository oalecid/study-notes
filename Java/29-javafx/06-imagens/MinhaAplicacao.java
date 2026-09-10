import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.VBox;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palco) {
    // O caminho usado foi relativo
    // Exemplo de caminho absoluto: "file:///C:restante-do-caminho/etc/etc/etc"
    Image image = new Image("file:assets/tree.jpg");

    ImageView imageView = new ImageView(image);

    // Ajustando tamanho da imagem
    imageView.setFitWidth(320); // -> largura de 320 pixels
    imageView.setFitHeight(235); // -> altura de 235 pixels

    // Isso mantém a proporção original (porém nesse caso acho que é meio inútil pois estou usando exatamente metade das dimensões)
    // sem isso a imagem corre o risco de deformação caso as dimensões não sigam a proporção original
    imageView.setPreserveRatio(true);

    // Finalizando montagem da cena
    VBox vBox = new VBox(imageView);

    Scene cena = new Scene(vBox, 500, 500);

    palco.setScene(cena);

    palco.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}