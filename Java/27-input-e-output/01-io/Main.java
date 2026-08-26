/*
  Dica: O Java consegue saber quais classes precisa realmente importar
  mesmo usando asterisco para importar todas, então não se preocupe

  Só é preciso tomar cuidado em casos em que existam classes que possam
  entrar em conflito
*/
import java.io.*;

public class Main {
  public static void exemploEscrita(String fileName) {
    try {
      FileWriter writer1 = new FileWriter(fileName);

      writer1.write("potatochips");

      writer1.close();
    } catch (IOException e) {
      System.out.println("Erro ao escrever: " + e.getMessage());
    }
  }

  public static void exemploLeitura(String fileName) {
    try {
      FileReader reader1 = new FileReader(fileName);

      // Isso lê apenas o primeiro caractere, porém ele vem condificado em inteiro
      int data = reader1.read();

      System.out.println("primeiro caractere (codificado): " + data);

      char correspondingChar = (char) data;

      System.out.println("primeiro caractere: " + correspondingChar);

      // para ler todos os caracteres:

      // (-1 significa que o arquivo acabou)
      while (data != -1) {
        System.out.print((char) data);

        data = reader1.read(); // lê o próximo caractere
      }

      reader1.close();
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Erro ao ler arquivo: "+ e.getMessage());
    }
  }

  public static void main(String[] args) {
    exemploEscrita("potatochips.txt");

    exemploLeitura("potatochips.txt");
  }
}