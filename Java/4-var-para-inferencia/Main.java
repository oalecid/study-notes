public class Main {
  public static String getValueType(Object value) {
    return ((Object)value).getClass().getSimpleName();
  }

  // var somente pode ser usado para variáveis locais
  // e deve sempre possuir inicializador
  public static void main(String[] args) {
    var test1 = "ABCD";
    var test2 = 17.8478248624;
    var test3 = true;

    System.out.println(getValueType(test1));
    System.out.println(getValueType(test2));
    System.out.println(getValueType(test3));
  }
}