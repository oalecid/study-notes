class TestClass {
  // Annotation para dizer que um método está depreciado
  @Deprecated
  void metodoAntigo() {
    System.out.println("método antigoooooo");
  }

  void metodoNovo() {
    System.out.println("método noooovoooooo");
  }
}

public class Main {
  public static void main(String[] args) {
    TestClass testClass = new TestClass();

    testClass.metodoAntigo();
    testClass.metodoNovo();
  }
}