package class1;

public class Account {

  //클래스 내부에서만 사용가능
  //private int regNumber;
  private String name;
  private int balance;

  public String getName() {
    return name; 
  };
  public void setName(String name) {
    this.name = name;
  }
  public int getBalance() {
    return balance;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }
  
}
