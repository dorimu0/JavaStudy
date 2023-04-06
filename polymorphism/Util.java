package polymorphism;

public class Util{

  public static void selectionSort(int[] values) {
    for (int i = 0; i < values.length; i ++) {
      int minIdx = i;
      for (int j = i + 1; j < values.length; j++ ) {
        // values[minIdx]는 현재까지 찾은 최소값
        if(values[minIdx] > values[j]){
          minIdx = j;
        }
      }
      // minIdx의 값과 i의 값을 교환
      swap(i, minIdx, values);
    }
  }

  public static void selectionSort(Comparable[] values) {
    for (int i = 0; i < values.length; i ++) {
      int minIdx = i;
      for (int j = i + 1; j < values.length; j++ ) {
        // values[minIdx]는 현재까지 찾은 최소값
        if(values[minIdx].compareTo(values[j]) < 0) {
          minIdx = j;
        }
      }
      // minIdx의 값과 i의 값을 교환
      swap(i, minIdx, values);
    }
  }

  private static void swap(int idx1, int idx2, int[] values) {
    int tamp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tamp;
  }

  private static void swap(int idx1, int idx2, Comparable[] values) {
    Comparable tamp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tamp;
  }
}