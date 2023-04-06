package polymorphism;

import java.util.Random;

public class Test {
  public static void main(String[] args) {
    int[] values = new int[10];
    Random random = new Random(System.currentTimeMillis());

    for (int i = 0; i < values.length; i++) {
      values[i] = random.nextInt(100);
    }
    for(int val : values) {
      System.out.print(val + " ");
    }

    System.out.println();
    Util.selectionSort(values);
    for(int val : values) {
      System.out.print(val + " ");
    }

  }

  
}
