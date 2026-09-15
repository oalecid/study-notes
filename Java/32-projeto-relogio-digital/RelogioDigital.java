import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.layout.StackPane;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@FunctionalInterface
interface CallbackDoRelogio {
  void mostrarHorario(String horarioEmString);
}

public class RelogioDigital extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    Label labelDoHorario = new Label();
    labelDoHorario.getStyleClass().add("clock-text");

    configurarAtualizacaoDoRelogio((horarioEmString) -> {
      labelDoHorario.setText(horarioEmString);
    });

    StackPane stackPane = new StackPane(labelDoHorario);
    stackPane.getStyleClass().add("clock-box");

    Scene cena = new Scene(stackPane, 500, 500);
    cena.getStylesheets().add("file:assets/styles.css");

    palcoPrincipal.setTitle("Relógio Digital");
    palcoPrincipal.setScene(cena);
    
    palcoPrincipal.show();
  }

  void configurarAtualizacaoDoRelogio(CallbackDoRelogio callback) {
    // Criação de Keyframe
    // Keyframes são os pontos/períodos ao longo do tempo no qual ocorrerão as animações
    // O primeiro parâmetro é quando será iniciado
    KeyFrame keyFrameDeAtualizacao = new KeyFrame(Duration.ZERO, e -> {
      String horaAtual = obterHoraAtual();

      callback.mostrarHorario(horaAtual);
    });

    // Criação de keyframe para definir a atualização a cada 1 segundo
    KeyFrame keyFrameDeIntervalo = new KeyFrame(Duration.seconds(1));

    // Criação da timeline onde serão colocados os keyframes
    Timeline timeline = new Timeline();
    timeline.getKeyFrames().addAll(keyFrameDeAtualizacao, keyFrameDeIntervalo);

    // Definindo que a animação vai durar para sempre e iniciando a animação
    timeline.setCycleCount(Animation.INDEFINITE);
    timeline.play();
  }

  String obterHoraAtual() {
    LocalTime tempoAtual = LocalTime.now();

    DateTimeFormatter formatadorDeHoras = DateTimeFormatter.ofPattern("HH:mm:ss");

    String horaFormatada = tempoAtual.format(formatadorDeHoras);

    return horaFormatada;
  }

  public static void main(String[] args) {
    launch(args);
  }
}