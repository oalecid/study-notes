import org.json.JSONObject;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Scanner;

public class MinhaAplicacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome da cidade: ");

    String cidade = scanner.nextLine();

    scanner.close();

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

  static String getDadosClimaticos(String cidade) throws Exception {
    String apiKey = Files.readString(Paths.get("api-key.txt")).trim();

    String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);

    String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;

    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(apiUrl))
      .build();

    HttpClient client = HttpClient.newHttpClient();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Configura para tratar a resposta como String

    return response.body();
  }

  static void imprimirDadosClimaticos(String dadosClimaticos) {
    JSONObject dadosJson = new JSONObject(dadosClimaticos);
    JSONObject informacoesMeteorologicas = dadosJson.getJSONObject("current");

    // Extrair dados da localização
    String cidade = dadosJson.getJSONObject("location").getString("name");
    String pais = dadosJson.getJSONObject("location").getString("country");

    // Extrair dados adicionar
    String condicaoTempo = informacoesMeteorologicas.getJSONObject("condition").getString("text");
    int umidade = informacoesMeteorologicas.getInt("humidity");
    float velocidadeVento = informacoesMeteorologicas.getFloat("wind_kph");
    float pressaoAtmosferica = informacoesMeteorologicas.getFloat("pressure_mb");
    float sensacaoTermica = informacoesMeteorologicas.getFloat("feelslike_c");
    float temperaturaAtual = informacoesMeteorologicas.getFloat("temp_c");

    // Extrair data e hora
    String dataHoraString = informacoesMeteorologicas.getString("last_updated");

    // Imprimir informações atuais

    System.out.println("Informações Meteorológicas para " + cidade + ", " + pais);

    System.out.println("Data e Hora: " + dataHoraString);

    System.out.println("Temperatura Atual: " + temperaturaAtual + "°C");
    System.out.println("Sensação Térmica: " + sensacaoTermica + "°C");
    System.out.println("Condição do Tempo: " + condicaoTempo);
    System.out.println("Umidade: " + umidade + "%");
    System.out.println("Velocidade do Vento: " + velocidadeVento + " km/h");
    System.out.println("Pressão Atmosférica: " + pressaoAtmosferica + " mb");
  }
}