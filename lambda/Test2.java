package lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Test2 {
  public static void main(String[] args) {
    /*
     * 1. person 객체를 5개 이상 생성해 ArrayList에 저장
     * 2. printGender apthem ghcnf
     *  1) printgender 메소드는 1번에서 생성한 ArrayList의 각 원소에 대해
     *     그 원소가 남자이면 "000은 남자"
     *     그 원소가 여자이면 "000은 여자"를 출력
     * 3. 구현
     *   1) printGender 메소드를 호출할 때, CheckPerson 객체를 인자로 넘겨줘야 하는데,
     *      그 객체가 남자인지 여자인지를 판단해 남자이면 true 여자이면 false반환
     */

    Person p1 = new Person("고길동", LocalDate.of(2000, 1, 4), "doraemong.naver.com", Sex.MALE);
    Person p2 = new Person("일지매", LocalDate.of(2010, 3, 13), "doraemong1.naver.com", Sex.FEMALE);
    Person p3 = new Person("박문수", LocalDate.of(2005, 9, 25), "doraemong2.naver.com", Sex.MALE);
    Person p4 = new Person("두울리", LocalDate.of(1990, 7, 8), "doraemong3.naver.com", Sex.FEMALE);
    Person p5 = new Person("에엘사", LocalDate.of(2001, 4, 30), "doraemong4.naver.com", Sex.MALE);

    List<Person> list= new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    /*
     * CheckPerson 인터페이스 객체 생성 방법 3가지
     * 1. 클래스를 정의하고 그 클래스의 객체 생성
     * 2. 무명클래스 생성
     * 3. 람다식으로 생성
     */

    //  printGender(list, (p)->p.getGender()==Sex.MALE);
    printPersonLambda(list, (p)->p.getGender()==Sex.FEMALE, (p)->{System.out.println(p.getName());});
  }

  /*
   * java에서는 유용하게 사용할 수 있는 Functional Interface를 제공
   * Functional Interface는 오직 하나의 추상 메소드를 가지는 제네릭 인터페이스다
   * 즉, 이 타입의 객체를 원하는 곳에는 람다식으로 전달 가능
   */

  public static void printGender(List<Person> list, Predicate<Person> pred) {
    for (Person p : list) {
      if(pred.test(p)) {
        System.out.println(p.getName() + "은 여자");
      } else {
        System.out.println(p.getName() + "은 남자");
      }
    }
  }

  public static void printPersonLambda(List<Person> list, Predicate<Person> pred, Consumer<Person> c) {
    for (Person p : list) {
      if(pred.test(p)) {
        c.accept(p);
        System.out.println();
      }
    }
  }

  interface CheckGender {
    boolean isMale(Person p);
  }

}
