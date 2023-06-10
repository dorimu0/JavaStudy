package lambda;

import java.util.ArrayList;

import javax.swing.event.SwingPropertyChangeSupport;

import java.util.*;

/**
 * LambdaTest
 */
public class LambdaTest {
  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("AAA");
    list.add("bbb");
    list.add("CCC");
    list.add("ddd");
    list.add("EEE");
    
    System.out.println("정렬전");
    printList(list);
    
    Collection.sort(lis, compareToIgnoreCase(s2));
    System.out.println("정렬 후");
    printList(list);
  }
  
}