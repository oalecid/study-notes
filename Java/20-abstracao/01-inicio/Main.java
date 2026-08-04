/*
  Classes abstratas são classes criadas principalmente
  para facilitar sua reutilização para definir classes mais
  específicas

  - Nelas é possível definir métodos abstratos ou não

  - Ao estender a classe abstrata, é obrigatório implementar os
  métodos que estavam abstratos.

  - Não podem ser instanciadas

  - Podem ter construtores

  - Podem conter campos

  - Podem implementar interfaces
*/

abstract class Carro {
  abstract void acelerar();

  void frear() {
    System.out.println("freeeaaaaaaaannnnndooooo");
  }
}

class CarroDeCorrida extends Carro {
  void acelerar() {
    System.out.println("zzuuuuuuuuuuuummmmmmmmmmmm");
  }
}

public class Main {
  public static void main(String[] args) {
    CarroDeCorrida c1 = new CarroDeCorrida();

    c1.acelerar();
    c1.frear();
  }
}