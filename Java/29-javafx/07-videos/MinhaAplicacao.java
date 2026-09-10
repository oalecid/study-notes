import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javafx.scene.layout.HBox;

public class MinhaAplicacao extends Application {
  public void start(Stage palcoPrincipal) {
    String urlDoVideo = "";

    Media media = new Media(urlDoVideo);

    MediaPlayer mediaPlayer = new MediaPlayer(media);

    MediaView mediaView = new MediaView(mediaPlayer);

    HBox hBox = new HBox();
    hBox.getChildren().add(mediaView);

    Scene cena = new Scene(hBox, 500, 500);

    palcoPrincipal.setTitle("Teste Vídeo");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show();

    mediaPlayer.play();
  }

  public static void main(String[] args) {
    launch(args);
  }
}