public class Main {
  public static String getValueType(Object value) {
    return ((Object)value).getClass().getSimpleName();
  }

  public static void showValueDescription(Object value) {
    System.out.println("Valor: " + value + " Tipo: " + getValueType(value) + "\n");
  }

  public static void main(String[] args) {
    byte n1 = 10;
    int n2 = n1 + 5;

    // byte n2 = n1 + 5 => not allowed

    showValueDescription(n2);

    int n3 = 4;
    long n4 = 10L;
    long n5 = n3 + n4;

    showValueDescription(n5);

    int n6 = 30;
    float n7 = 5.7777f;
    float n8 = n6 + n7;

    showValueDescription(n8);

    int n9 = 10;
    double n10 = 7.7;
    double n11 = n10 + n9;

    showValueDescription(n11);
  }
}