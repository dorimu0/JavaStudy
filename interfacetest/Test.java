package interfacetest;

import java.lang.reflect.Array;

import polymorphism.Util;

public class Test {
  public static void main(String[] args) {
    String s1 = "ABC";
    String s2 = "ABD";
    System.out.println(s1.compareTo(s2));
    // Student std1 = new Student("일지매", "컴정");
    // Student std2 = new Student("홍길동", "컴정");
    // findLarger(std1, std2); // 두 번째가 더 크다.
    
    // Car c1 = new Car("gia", "s1", 1000, 80);

    // Car c2 = new Car("h", "s2", 2000, 100);


    // Car c3 = new Car();
    // System.out.println(c3);
    // findLarger(c1, c2);

    // Student stds[] = new Student[5];

    // Student std1 = new Student("일지매", "컴정");
    // stds[0] = std1;
    // Student std2 = new Student("홍길동", "컴정");
    // stds[1] = std1;
    // Student std3 = new Student("일지", "컴정");
    // stds[2] = std1;
    // Student std4 = new Student("홍길", "컴정");
    // stds[3] = std1;
    // Student std5 = new Student("홍동", "컴정");
    // stds[4] = std1;

    // Util.selectionSort(stds);

    // for(Student std : stds) {
    //   System.out.println(std.getName());
    // }
    
    Car cars[] = new Car[5];

    Car c1 = new Car("gia", "s1", 1000, 80);
    cars[0] = c1;
    Car c2 = new Car("h", "s2", 2000, 100);
    cars[1] = c2;
    Car c3 = new Car("gia", "s1", 1000, 80);
    cars[2] = c3;
    Car c4 = new Car("h", "s2", 2000, 100);
    cars[3] = c4;
    Car c5 = new Car("gia", "s1", 1000, 80);
    cars[4] = c5;
  }


  public static void findLarger(Comparable c1, Comparable c2){
    if (c1.compareTo(c2) == 0){
      System.out.println("같다");
    } else if(c1.compareTo(c2) > 0){
      System.out.println("첫번째 큼");
    } else {
      System.out.println("두번째 큼");
    }
  }
  
}
