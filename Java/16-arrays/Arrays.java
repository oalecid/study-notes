public class Arrays {
  public static void printUsingFor(int[] arr) {
    // Percorrer usando for
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Percorrendo array com for: índice: " + i + " - valor: " + arr[i]);
    }
  }

  public static void printUsingForEach(int[] arr) {
    // Percorrer usando for each
    for (int item : arr) {
      System.out.println("Percorrendo array com for each: " + item);
    }
  }

  public static void main(String[] args) {
    // Declarando e preenchendo depois
    int[] arr1;

    arr1 = new int[3];
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;

    // Acessar via índice
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);

    // Também é possível declarar e preencher diretamente
    // assim como também preencher logo os valores
    int[] arr2 = new int[]{11, 22, 33};

    printUsingFor(arr2);

    printUsingFor(new int[]{7, 8, 9});
  }
}