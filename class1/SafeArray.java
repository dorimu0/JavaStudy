package class1;

public class SafeArray {
  private int[] a;

  public void createArray(int size){
    a = new int[size];
  }
  public int get(int index) {
    if (index >= 0 && index < a.length)
    return a[index];
    System.out.println("잘못된 인덱스 : " + index);
    return -1;
  }
  
}
