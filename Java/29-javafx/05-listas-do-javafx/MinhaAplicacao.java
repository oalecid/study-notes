import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import javafx.scene.layout.VBox;

public class MinhaAplicacao extends Application {
  public void start(Stage palco) {
    ObservableList<String> lista;

    lista = FXCollections.observableArrayList("item 1", "item 2", "item 3", "item 4", "item 5");

    ListView<String> listView = new ListView<>(lista);

    VBox vBox = new VBox(listView);

    Scene cena = new Scene(vBox, 500, 500);

    palco.setScene(cena);

    palco.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}