package calculos;

public class IMC {
  public static double calcular(double peso, double altura) throws ArithmeticException {
    if (altura == 0) {
      throw new ArithmeticException("Impossível dividir por zero!");
    }

    return peso / Math.pow(altura, 2);
  }
}
