package generic;

import java.util.*;

public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
  
    names.add("홍길동");
    names.add("길동홍");
  
    for (String name : names) {
      System.out.println(name);
    }
  
    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(10);
    ages.add(15);
    ages.add(20);
    ages.add(25);
  
    for (int age : ages) {
      System.out.println(age);
    }
    
  }
}
