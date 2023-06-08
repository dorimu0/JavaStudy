package generic;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest2 {
  public static void main(String[] args) {
    HashMap<String, Integer> nameAge = new HashMap<>();
    nameAge.put("고길동", 20);  // 키와 값의 쌍으로 데이터 저장
    int age = nameAge.get("고길동"); // 키의 값으로 그에 대응되는 값 인출
    System.out.println(age);

    nameAge.put("일지매", 30);
    nameAge.put("박문수", 40);

    age = nameAge.get("박문수");
    System.out.println("박문수의 나이 : " + age);
    // 우리반의 조 6개
    // 각 조의 조원들 이름 HashMap 이용해서 저장
    // 즉, "1조" : {"name1", "name2", "name3", ...}"
    // "2조" 
    HashMap<String, ArrayList<String>> teams = new HashMap<>();
    ArrayList<String> team1 = new ArrayList<>();
    team1.add("name1");
    team1.add("name2");
    team1.add("name3");
    team1.add("name4");
    team1.add("name5");
    team1.add("name6");

    ArrayList<String> team2 = new ArrayList<>();
    team1.add("name12");
    team1.add("name22");
    team1.add("name32");
    team1.add("name42");

    ArrayList<String> team3 = new ArrayList<>();
    team1.add("name13");
    team1.add("name23");
    team1.add("name33");
    team1.add("name43");
    team1.add("name53");

    teams.put("1조", team1);
    teams.put("2조", team2);
    teams.put("3조", team3);

    printTeamMember("1조", teams);

  }

  public static void printTeamMember(String teamName, HashMap<String, ArrayList<String>> teams) {
    ArrayList<String> members = teams.get(teamName);
    System.out.println(teamName + "의 멤버들");
    for (String member : members) {
      System.out.println(member);
    }
    System.out.println();
  }
}
