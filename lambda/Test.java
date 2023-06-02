package lambda;

import java.util.*;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

public class Test {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    p1.setName("홍길동");
    p1.setage(25);
    p1.setGender(Sex.MALE);
    p1.setEmailAddress("dorimu@naver.com");
    p2.setName("홍길동");
    p2.setage(15);
    p2.setGender(Sex.FEMALE);
    p2.setEmailAddress("dorimu@naver.com");
    // List는 인터페이스, 이 인터페이스를 구현하는 클래스로
    // ArrayList, LinkedList 등이 있다.
    // List<Person> list = new ArrayList<Person>();
    // person 타입의 객체를 원소로 가질 수 있는 리스트를 생성
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);


    // printPersonWithinAgeRange(list, 10, 20);
    // printPersonOlderThan(list, 23);
    // List<Person> list, int low, int high
    // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(low 이상, high 미만)를
    // 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
    // printPersonWithinAgeRange를 구현

    
    // CheckPersonMale18to25 cm = new CheckPersonMale18to25();
    // printPersons(list, new CheckPersonFemale());
    
    // 람다식을 이용해서 printPersons 메소드를 호출하고,
    // 그 결과로 나이 20에서 30살 사이의 여자만 출력되도록 구현하라.
    printPersons(list, p->{
      return  p.getGender() == Sex.MALE && p.getAge() <= 30 && p.getAge() >= 20;
    });

  }
  public static void printPersonWithinAgeRange(List<Person> list, int low, int high) {
    for (Person L : list) {
      if(L.getAge() >= low && L.getAge() < high) {
        L.printPerson();
        System.out.println();
      }
    }
    
    // 위와 똑같이 성별이 남자인 객체만 출력
    // printPersons 메서드 호출, 무명클래스 이용
    // CheckPerson 메서드를 호출하되, 무명클래스를 이용
    // 클래스 선언과(정의와) 객체 생성을 동시에 할 수 있는 방법 무명클래스
  
  
    // CheckPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
    // printPersons 메소드를 호출
    // 단, 이 메소드의 의해 출력되는 Person 객체는 성별이 남자인 객체이어야 한다.
    // printPersons(list, new CheckPerson(){
    //   public boolean test(Person p) {
    //     return p.getGender() == Sex.MALE;
    //   }
    // });
    
    // 람다식은 이름없는 메소드라 할 수 있다.
    // 람다식을 이용하는 이유는 간결하기 때문이다.
    // 람다식을 이용하는 메소드가 필요한 곳에 간단히 메소드를 보낼 수 있다.
    // 람다식은 함수형 프로그래밍을 자바에 도입
    // 람다식의 문법
    // (arg1, arg2, ...) -> { body }
    // (type1 arg1, type2 arg2, ...) -> { body}

    // printPersons(list, (p)->{ return p.getGender() == Sex.MALE;});

    // printPersons(list, (Person.p)->{ return p.getGender() == Sex.MALE;});

    // 람다식의 body가 return 문 하나만으로 구성되어 있으면 return 키워드, {}, 문장 끝의 세미콜론(;)도 생략할 수 이따
    // printPersons(list, (p)->p.getGender() == Sex.MALE);

    // 람다식의 매개변수가 오직 하나일 때는 매개변수를 둘러싸는 () 생략할 수 있다.
    // printPersons(list, p->{
    //   System.out.println(p.getName());
    //   return p.getAge() >=30;
    //   });


  }
  // collection framework : List, Set, Map, Stack, Queue
  // collection framework는 여러 개의 값을 저장하는 자바의 자료구조
  // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 ㅎ둗걏 dlfksms rlsmddmf dldydgo wlwjdgkf tn dlTek.
  // List<Person>, Set<Integer>, Map<String, Person>, ...

  
  public static void printPersonOlderThan(List<Person> persons, int age) {
    for (Person p : persons) {
      if(p.getAge() >= age){
        p.printPerson();
      }
    }
  }

  // person 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체(tester라 하자)를 전달받고, 
  // 리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 반환 값이 true이면
  // 그 Person 객체의 정보 출력

  public static void printPersons(List<Person> list, CheckPerson tester){
    for (Person p: list) {
      if(tester.test(p)) {
        p.printPerson();
        System.out.println();
      }
    }

  }


}


interface CheckPerson {
  boolean test(Person P);
}

class CheckPersonMale18to25 implements CheckPerson {
  public boolean test(Person P) {
    return P.getGender() == Sex.MALE && P.getAge() >= 18 && P.getAge() <= 25;
  }
}

class CheckPersonFemale10to20 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.FEMALE && p.getAge() >= 10 && p.getAge() <= 20;

  }
}

class CheckPersonFemale implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.FEMALE;

  }
}

  // 위와 똑같이 성별이 남자인 객체만 출력
  // printPersons 메서드 호출, 무명클래스 이용
  // CheckPerson 메서드를 호출하되, 무명클래스를 이용
  // 클래스 선언과(정의와) 객체 생성을 동시에 할 수 있는 방법 무명클래스

