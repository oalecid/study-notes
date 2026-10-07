import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import javafx.geometry.Insets;

import java.util.List;
import java.io.File;
import java.io.PrintWriter;
// import java.util.ArrayList;


public class MinhaAplicacao extends Application {
  // private List<String> itemsList = new ArrayList<>();
  private ListView<String> listView = new ListView<>();


  @Override
  public void start(Stage stage) {
    Label formLabel = new Label("Digite o item que deseja adicionar:");
    
    TextField formTextField = new TextField();

    Button formSubmitButton = new Button("Adicionar");
    formSubmitButton.setStyle("-fx-max-width: Infinity;");

    Label listTitleLabel = new Label("Lista de Compras:");

    Button exportButton = new Button("Exportar Lista");
    exportButton.setStyle("-fx-max-width: Infinity;");

    // O professor usou um alista auxiliar, mas eu acho que não vai ser necessário
    // ObservableList<String> observableList = FXCollections.observableArrayList(itemsList);

    ObservableList<String> observableList = FXCollections.observableArrayList();
    listView.setItems(observableList);

    VBox vBox = new VBox(formLabel, formTextField, formSubmitButton, listTitleLabel, listView, exportButton);
    vBox.setPadding(new Insets(15));
    vBox.setSpacing(15);

    formSubmitButton.setOnAction((event) -> {
      String newItemName = formTextField.getText();

      if (!newItemName.isEmpty()) {
        // O professor escreveu assim,
        // mas eu acho que dá só pra usar o ObservableList mesmo 

        // Acho que ele já deixa tudo sincronizado sem precisar adicionar em
        // duas listas

        // itemsList.add(newItemName);
        // listView.getItems().add(newItemName);

        observableList.add(newItemName);

        formTextField.clear();
      }
    });

    exportButton.setOnAction((event) -> exportList(observableList));

    Scene scene = new Scene(vBox, 500, 500);

    stage.setScene(scene);
    stage.setTitle("Lista de Compras");

    stage.show();
  }

  public void exportList(List<String> exportedList) {
    try {
      File newFile = new File("listaDeCompras.txt");

      PrintWriter writer = new PrintWriter(newFile);

      for (String exportedItemName : exportedList) {
        writer.println(exportedItemName);
      }

      writer.close();
    } catch (Exception e) {
      System.out.println("Erro ao exportar lista: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}