import org.json.JSONObject;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.nio.charset.StandardCharsets;

import java.util.Scanner;

public class MinhaAplicacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome da cidade: ");

    String cidade = scanner.nextLine();

    try {
      String dadosClimaticos = getDadosClimaticos(cidade);

      // 1006 -> Localização não encontrada
      if (dadosClimaticos.contains("\"code\":1006")) {
        System.out.println("Localização não encontrada. Por favor, tente novamente.");
      } else {
        imprimirDadosClimaticos(dadosClimaticos);
      }
    } catch (Exception e) {
      System.out.println("Ocorreu um erro :" + e.getMessage());
    }
  }

  static String getDadosClimaticos(String cidade) {
    return "";
  }

  static void imprimirDadosClimaticos(String dadosClimaticos) {

  }
}