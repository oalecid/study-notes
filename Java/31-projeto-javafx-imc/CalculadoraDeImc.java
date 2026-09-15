import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import calculos.IMC;

public class CalculadoraDeImc extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    Label labelDoPeso = new Label("Informe o peso:");
    labelDoPeso.getStyleClass().add("form-label");

    TextField campoDePeso = new TextField();
    campoDePeso.setPromptText("Peso em kg"); // Placeholder
    campoDePeso.getStyleClass().add("form-text-field");

    Label labelDaAltura = new Label("Informe a altura:");
    labelDaAltura.getStyleClass().add("form-label");

    TextField campoDaAltura = new TextField();
    campoDaAltura.setPromptText("Altura em metros"); // Placeholder
    campoDaAltura.getStyleClass().add("form-text-field");

    Button botaoDeCalcular = new Button("Calcular IMC");
    botaoDeCalcular.getStyleClass().add("form-button");

    Label labelDoResultado = new Label();
    labelDoResultado.getStyleClass().add("form-result");

    botaoDeCalcular.setOnAction(e -> {
      pegarValoresECalcularIMC(campoDePeso, campoDaAltura, labelDoResultado);
    });

    VBox vBox = new VBox(labelDoPeso, campoDePeso, labelDaAltura, campoDaAltura, botaoDeCalcular, labelDoResultado);
    vBox.getStyleClass().add("form-box");

    Scene cena = new Scene(vBox, 500, 500);

    cena.getStylesheets().add("file:assets/styles.css");

    palcoPrincipal.setTitle("Calculadora de IMC");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show();
  }

  void pegarValoresECalcularIMC(TextField campoDePeso, TextField campoDeAltura, Label labelDoResultado) {
    try {
      String pesoEmString = campoDePeso.getText();
      String alturaEmString = campoDeAltura.getText();

      if (pesoEmString.isEmpty() || alturaEmString.isEmpty()) {
        throw new IllegalArgumentException("Preencha todos os campos antes de continuar!");
      }

      double peso = converterStringParaFloat(campoDePeso.getText());
      
      double altura = converterStringParaFloat(campoDeAltura.getText());

      double resultado = IMC.calcular(peso, altura);

      labelDoResultado.setText(String.format("O IMC para %.2f kg e %.2f metros é %.2f", peso, altura, resultado));
    } catch (Exception e) {
      labelDoResultado.setText("Ocorreu um erro: " + e.getMessage());
    }
  }

  double converterStringParaFloat(String valorEmString) {
    try {
      String valorFormatado = valorEmString;

      if (valorEmString.contains(",")) {
        valorFormatado = valorEmString.replace(",", ".");
      }

      return Double.parseDouble(valorFormatado);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Valores inválidos!");
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}