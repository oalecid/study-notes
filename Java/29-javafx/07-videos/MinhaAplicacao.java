import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javafx.scene.layout.HBox;

public class MinhaAplicacao extends Application {
  public void start(Stage palcoPrincipal) {
    try {
      String urlDoVideo = "./assets/nature.mp4";

      File file = new File(urlDoVideo);

      Media media = new Media(file.toURI().toString());

      // Desse jeito aqui não funcionou:
      // String urlDoVideo = "file:assets/nature.mp4";
      // Media media = new Media(urlDoVideo);

      MediaPlayer mediaPlayer = new MediaPlayer(media);

      MediaView mediaView = new MediaView(mediaPlayer);

      HBox hBox = new HBox();
      hBox.getChildren().add(mediaView);

      Scene cena = new Scene(hBox, 720, 480);

      palcoPrincipal.setTitle("Teste Vídeo");
      palcoPrincipal.setScene(cena);

      palcoPrincipal.show();

      mediaPlayer.play();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}