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
    TextField campoDePeso = new TextField();

    Label labelDaAltura = new Label("Informe a altura");
    TextField campoDaAltura = new TextField();

    Button botaoDeCalcular = new Button("Calcular");

    Label labelDoResultado = new Label("");

    botaoDeCalcular.setOnAction(e -> {
      pegarValoresECalcularIMC(campoDePeso, campoDaAltura, labelDoResultado);
    });

    VBox vBox = new VBox(labelDoPeso, campoDePeso, labelDaAltura, campoDaAltura, botaoDeCalcular, labelDoResultado);

    Scene cena = new Scene(vBox, 500, 500);

    palcoPrincipal.setTitle("Calculadora de IMC");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show();
  }

  void pegarValoresECalcularIMC(TextField campoDePeso, TextField campoDeAltura, Label labelDoResultado) {
    try {
      double peso = converterStringParaFloat(campoDePeso.getText());
      
      double altura = converterStringParaFloat(campoDeAltura.getText());

      double resultado = IMC.calcular(peso, altura);

      labelDoResultado.setText("Resultado: " + resultado);
    } catch (Exception e) {
      labelDoResultado.setText("Ocorreu um erro: " + e.getMessage());
    }
  }

  double converterStringParaFloat(String valorEmString) {
    try {
      return Double.parseDouble(valorEmString);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Valores inválidos!");
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}