import java.security.SecureRandom;

import java.util.Scanner;

public class GeradorDeSenhasSeguras {
  private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?<>";

  public static String gerarSenha(int comprimentoDesejado) {
    SecureRandom geradorDeNumeroAleatorios = new SecureRandom();

    StringBuilder stringDaSenha = new StringBuilder();

    for (int i = 0; i < comprimentoDesejado; i++) {
      // Gera um índice aleatório que esteja dentro do comprimento da String
      int indiceAleatorio = geradorDeNumeroAleatorios.nextInt(CARACTERES.length());

      // Pega um caractere aleatório da String de caracteres e adiciona à senha
      stringDaSenha.append(CARACTERES.charAt(indiceAleatorio));
    }

    return stringDaSenha.toString();
  }

  public static void main(String[] args) {
    // Cria um Scanner pra receber respostas do terminal
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o comprimento desejado da senha: ");

    // Aguarda que o usuário digite um inteiro
    int comprimentoDesejado = scanner.nextInt();

    String novaSenha = gerarSenha(comprimentoDesejado);

    System.out.println("A senha gerada foi " + novaSenha);

    scanner.close();
  }
}