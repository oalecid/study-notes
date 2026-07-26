public class Main {
  public static void main(String[] args) {
    int a = 77;
    int b = 7;

    System.out.println("\nAritméticosss \n");

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    System.out.println("\nComparação \n");

    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);

    boolean c = true;
    boolean d = false;

    System.out.println("\nLógicos \n");

    System.out.println(c && d);
    System.out.println(c || d);
    System.out.println(!c);

    System.out.println("\nAtribuição \n");

    int n1 = 1;

    n1 += 7;
    System.out.println(n1);

    n1 -= 7;
    System.out.println(n1);

    n1 *= 7;
    System.out.println(n1);
    
    n1 /= 7;
    System.out.println(n1);

    n1 %= 7;
    System.out.println(n1);

    System.out.println("\nOperadores unários \n");

    int n2 = 2;
    System.out.println(n2++);

    n2 = 2;
    System.out.println(n2--);

    n2 = 2;
    System.out.println(++n2);

    n2 = 2;
    System.out.println(--n2);

    n2 = 2;
    System.out.println(+n2);
    System.out.println(-n2);

    System.out.println(!true);
  }
}