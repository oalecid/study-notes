import javafx.application.Application;
import javafx.stage.Stage;

public class AplicacaoTeste extends Application {
  // start() é onde você personaliza a interface
  // e define os comportamentos da janela principal
  @Override
  public void start(Stage palco) {
    palco.setTitle("Título da Janela Teste 01");

    palco.show();
  }

  public static void main(String[] args) {
    // launch() é o gatilho que inicia a aplicação JavaFX
    launch(args);
  }
}