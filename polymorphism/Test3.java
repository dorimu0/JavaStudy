package polymorphism;


public class Test3 {
  public static void main(String[] args) {
    Student[] stds = new Student[5];
    stds[0] = new Student("석", "2201363");
    stds[1] = new Student("진", "2201364");
    stds[2] = new Student("석", "2201365");
    stds[3] = new Student("석진", "2201366");
    stds[4] = new Student("진석", "2201367");

    Util.selectionSort(stds);

    for (Student std: stds) {
      std.toString();
    }
  }
}