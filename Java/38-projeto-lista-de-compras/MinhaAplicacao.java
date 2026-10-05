import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

import javafx.geometry.Insets;

import java.util.List;
import java.util.ArrayList;

public class MinhaAplicacao extends Application {
  List<HBox> itemsList = new ArrayList<>();

  @Override
  public void start(Stage stage) {
    Label formLabel = new Label("Digite o item que deseja adicionar:");
    
    TextField formTextField = new TextField();

    VBox listVBox = new VBox();
    listVBox.setSpacing(10);

    Button formSubmitButton = new Button("Adicionar");
    formSubmitButton.setStyle("-fx-max-width: Infinity;");
    formSubmitButton.setOnAction((event) -> addItem(formTextField, listVBox));

    Label listTitleLabel = new Label("Lista de Compras:");

    Button exportButton = new Button("Exportar Lista");
    exportButton.setStyle("-fx-max-width: Infinity;");

    VBox vBox = new VBox(formLabel, formTextField, formSubmitButton, listTitleLabel, listVBox, exportButton);
    vBox.setPadding(new Insets(15));
    vBox.setSpacing(15);

    Scene scene = new Scene(vBox, 500, 500);

    stage.setScene(scene);
    stage.setTitle("Lista de Compras");

    stage.show();
  }

  public void addItem(TextField textField, VBox listVBox) {
    String itemName = textField.getText();

    Label newItem = new Label(itemName);

    Button removeItemButton = new Button("Remover");

    // Region para adicionar espaço entre itens
    Region region = new Region();
    HBox.setHgrow(region, Priority.ALWAYS);

    HBox hBox = new HBox(newItem, region, removeItemButton);

    removeItemButton.setOnAction((event) -> removeItem(listVBox, hBox));

    listVBox.getChildren().add(hBox);

    itemsList.add(hBox);

    textField.clear();
  }

  public void removeItem(VBox listVBox, HBox itemNode) {
    int itemIndex = itemsList.indexOf(itemNode);

    listVBox.getChildren().remove(itemIndex);

    itemsList.remove(itemIndex);
  }

  public static void main(String[] args) {
    launch(args);
  }
}