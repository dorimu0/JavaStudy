package lambda;

import java.util.*;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    p1.setName("홍길동");
    p1.setage(15);
    p1.setGender(Sex.MALE);
    p1.setEmailAddress("dorimu@naver.com");
    // List는 인터페이스, 이 인터페이스를 구현하는 클래스로
    // ArrayList, LinkedList 등이 있다.
    // List<Person> list = new ArrayList<Person>();
    // person 타입의 객체를 원소로 가질 수 있는 리스트를 생성
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);


    printPersonWithinAgeRange(list, 10, 20);
    // printPersonOlderThan(list, 23);
    // List<Person> list, int low, int high
    // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(low 이상, high 미만)를
    // 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
    // printPersonWithinAgeRange를 구현

  }
  public static void printPersonWithinAgeRange(List<Person> list, int low, int high) {
    for (Person L : list) {
      if(L.getAge() >= low && L.getAge() <= high) {
        L.printPerson();
        System.out.println();
      }
    }
  }

  
  // public static void printPersonOlderThan(List<Person> persons, int age) {
  //   for (Person p : persons) {
  //     if(p.getAge() >= ){
  //       p.printPerson()
  //     }
  //   }
  // }
}
