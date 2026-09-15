import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class JogoDaForca {
  private final int TENTATIVAS = 6;
  private int tentativasRestantes = TENTATIVAS;

  private String palavra;
  private char[] palavraOcultaArr;

  private boolean jogoEmAndamento = false;
  private boolean venceuOJogo = false;
  
  private final Scanner scanner = new Scanner(System.in);

  public void obterPalavra() {
    System.out.print("\nDesafiante, digite a palavra desejada: ");

    palavra = scanner.nextLine().toLowerCase(Locale.ROOT);

    while (palavra.isEmpty()) {
      System.out.println("Valor inválido, por favor, tente novamente!");

      System.out.print("\nDesafiante, digite a palavra desejada: ");

      palavra = scanner.nextLine().toLowerCase(Locale.ROOT);
    }

    palavraOcultaArr = new char[palavra.length()];

    Arrays.fill(palavraOcultaArr, '_');

    System.out.println("Muito bem, desafiado, prepare-se para começar!\n");
  }

  public void configurarJogo() {
    jogoEmAndamento = true;
    tentativasRestantes = TENTATIVAS;
    venceuOJogo = false;

    obterPalavra();
  }

  public String obterProximoChute() {
    System.out.print("Digite uma letra ou palavra: ");

    String chute = scanner.nextLine().toLowerCase(Locale.ROOT);

    System.out.println();

    return chute;
  } 

  public void verificarChute(String chute) {    
    // Não digitou nada
    if (chute.length() == 0) {
      System.out.println("Valor inválido, por favor, tente novamente!");

      return;
    }

    // Acertou ao chutar uma letra
    if (chute.length() == 1 && palavra.contains(chute)) {
      char chuteDeChar = chute.charAt(0);

      if (new String(palavraOcultaArr).indexOf(chuteDeChar) != -1) {
        System.out.println("Essa letra já foi revelada!");

        return;
      }

      System.out.println("Isso! A palavra contém a letra " + chuteDeChar);

      for (int i = 0; i < palavra.length(); i++) {
        if (chuteDeChar == palavra.charAt(i)) {
          palavraOcultaArr[i] = chuteDeChar;
        }
      }

      // Se completou a palavra
      if (new String(palavraOcultaArr).equals(palavra)) {
        jogoEmAndamento = false;
        venceuOJogo = true;
      }

      return;
    }
    
    // Acertou ao chutar uma palavra
    if (chute.equals(palavra)) {
      jogoEmAndamento = false;
      venceuOJogo = true;

      return;
    }

    // Errou ao chutar
    tentativasRestantes -= 1;

    if (tentativasRestantes == 0) {
      jogoEmAndamento = false;

      return;
    }

    System.out.println("ERROU! Você tem mais " + tentativasRestantes + " tentativas");
  }

  public void iniciarJogo() {
    configurarJogo();

    while (jogoEmAndamento) {
      System.out.println("Palavra: " + Arrays.toString(palavraOcultaArr));

      String novoChute = obterProximoChute();

      verificarChute(novoChute);

      System.out.println();
    }

    if (venceuOJogo) {
      System.out.println("Parabéns, você venceu o jogo!");
    } else {
      System.out.println("Que pena, acabaram as tentativas!");
    }

    System.out.println("A palavra era: " + palavra.toUpperCase());
  }

  public static void main(String[] args) {
    JogoDaForca jogoDaForca = new JogoDaForca();

    jogoDaForca.iniciarJogo();
  }
}