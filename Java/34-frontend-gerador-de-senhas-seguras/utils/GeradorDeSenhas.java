package utils;

import java.security.SecureRandom;

public class GeradorDeSenhas {
  private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?<>";

  public static String gerarSenha(int comprimentoDesejado) {
    SecureRandom geradorDeNumerosAleatorios = new SecureRandom();

    StringBuilder stringDaSenha = new StringBuilder();

    for (int i = 0; i < comprimentoDesejado; i++) {
      int indiceAleatorio = geradorDeNumerosAleatorios.nextInt(CARACTERES.length());

      char caractereAleatorio = CARACTERES.charAt(indiceAleatorio);

      stringDaSenha.append(caractereAleatorio);
    }

    return stringDaSenha.toString();
  }
}