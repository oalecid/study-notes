import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import javafx.stage.FileChooser;
import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MinhaAplicacao extends Application {
  @Override
  public void start(Stage palcoPrincipal) {
    FileChooser seletorDeArquivo = new FileChooser();

    seletorDeArquivo.setTitle("Escolha uma imagem:");

    Button botaoParaAbrirSeletor = new Button("Abrir imagem");

    // setOnAction define uma ação para o botão
    botaoParaAbrirSeletor.setOnAction(e -> {
      File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palcoPrincipal);
      
      if (arquivoSelecionado != null) {
        exibirImagem(arquivoSelecionado, palcoPrincipal);
      }
    });

    VBox vBox = new VBox(botaoParaAbrirSeletor);

    Scene cena = new Scene(vBox, 500, 500);

    palcoPrincipal.setTitle("Exemplo - Seletor de Arquivos");
    palcoPrincipal.setScene(cena);

    palcoPrincipal.show(); 
  }

  public void exibirImagem(File arquivoSelecionado, Stage palcoAtual) {
    Image imagem = new Image(arquivoSelecionado.toURI().toString());

    ImageView imageView = new ImageView(imagem);

    // Essa linha obtém o elemento raíz atual
    VBox vBoxRaiz = (VBox) palcoAtual.getScene().getRoot();

    // Essa linha adiciona a imagem aos itens do VBox
    vBoxRaiz.getChildren().add(imageView);

    // Ajustando tamanhos da imagem
    imageView.setFitWidth(500);
    imageView.setFitHeight(500);
    imageView.setPreserveRatio(true);

    palcoAtual.setTitle("Arquivo selecionado");
  }

  public static void main(String[] args) {
    launch(args);
  }
}