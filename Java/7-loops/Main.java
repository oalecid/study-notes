public class Main {
  public static void main(String[] args) {
    // for
    for (int n1 = 0; n1 <= 3; n1++) {
      System.out.println("loop for " + n1);
    }

    System.out.println("\n");

    // while
    int n2 = 0;

    while (n2 <= 3) {
      System.out.println("loop while " + n2);

      n2++;
    }

    System.out.println("\n");

    // do while (executa pelo menos uma vez)
    int n3 = 0;

    do {
      System.out.println("loop do while " + n3);

      n3++;
    } while (n3 <= 3);

    System.out.println("\n");

    // break
    for (int n4 = 0; n4 <= 3; n4++) {
      if (n4 == 1) {
        break;
      }

      System.out.println("loop for com break " + n4);
    }

    System.out.println("\n");
    
    // continue
    for (int n5 = 0; n5 <= 3; n5++) {
      if (n5 == 1) {
        continue;
      }

      System.out.println("loop for com continue " + n5);
    }
  }
}