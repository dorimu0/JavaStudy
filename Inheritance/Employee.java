package Inheritance;

class Employee {
  public String name;
  String address;
  protected int salary;
  private int rrn;

  public Employee(String name, String addreess, int salary, int rrn) {
    this.name = name;
    this.address = addreess;
    this.salary = salary;
    this.rrn = rrn;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name +", address = " + address + ", salary = " + salary + "rrn = " + rrn +"]";
  }
}