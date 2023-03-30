package class1;

public class GameCharacter{
  String name;
  int i;
  int j;

  public void add(String name, int i, int j){
    this.name = name;
    this.i = i;
    this.j = j;
  }
  public void print(){
    System.out.println(name + i + j);
  }
}