public class Main {
  public static void main(String[] args) {
    // If e Else

    boolean aprovado = true;

    if (aprovado) {
      System.out.println("if else: aprovado");
    } else {
      System.out.println("if else: reprovado");
    }

    // Ternary

    System.out.println(aprovado ? "ternário: aprovado" : "ternário: reprovado");

    // Instance of

    if ("aprovado" instanceof String) {
      System.out.println("instanceof: sim, a string \"aprovado\" é String");
    }

    // Switch case

    int day = 5;

    switch (day) {
      case 1 -> System.out.println("switch case: Segunda");
      case 2 -> System.out.println("switch case: Terça");
      case 3 -> System.out.println("switch case: Quarta");
      case 4 -> System.out.println("switch case: Quinta");
      case 5 -> System.out.println("switch case: Sexta");
      case 6 -> System.out.println("switch case: Sábado");
      case 7 -> System.out.println("switch case: Domingo");
      default -> System.out.println("switch case: Desconhecido");
    }

    String comida = "chocolate";

    String tipoComida = switch (comida) {
      case "chocolate", "bombom", "bolo", "panetone" -> "doce";
      case "coxinha", "pastel", "enroladinho", "pizza" -> "salgado";
      default -> "outro";
    };

    System.out.println("switch case: a comida " + comida + " é " + tipoComida);

    // Switch case ANTIGO

    // Só inteiros ou caracteres
    // Strings só a partir do Java 7

    day = 6;

    switch (day) {
      case 1:
        System.out.println("switch case antigo: Segunda");
        break;
      case 2:
        System.out.println("switch case antigo: Terça");
        break;
      case 3:
        System.out.println("switch case antigo: Quarta");
        break;
      case 4:
        System.out.println("switch case antigo: Quinta");
        break;
      case 5:
        System.out.println("switch case antigo: Sexta");
        break;
      case 6:
        System.out.println("switch case antigo: Sábado");
        break;
      case 7:
        System.out.println("switch case antigo: Domingo");
        break;
      default:
        System.out.println("switch case antigo: Desconhecido");
        break;
    }
  }
}