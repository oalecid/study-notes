/*
  Exemplos usando a API mais moderna de input & output no Java
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void exemploEscritaComNIO(Path path) {
    try {
      Files.write(path, "potatochips".getBytes());
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  public static void exemploLeituraComNIO(Path path) {
    try {
      byte[] bytes = Files.readAllBytes(path);

      String content = new String(bytes);

      System.out.println("Conteúdo lido: " + content);
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
  
  public static void main(String[] args) {
    Path path = Paths.get("potatochips.txt");

    exemploEscritaComNIO(path);
    exemploLeituraComNIO(path);
  }
}