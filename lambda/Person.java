package lambda;

import java.time.LocalDate;

public class Person {
  private String name;
  private int age;
  private LocalDate birDate;
  private String emailAddress;
  private Sex gender;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return this.age;
  }

  public void setage(int age) {
    this.age = age;
  }

  public LocalDate getBirDate() {
    return this.birDate;
  }

  public void setBirDate(LocalDate birDate) {
    this.birDate = birDate;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Sex getGender() {
    return this.gender;
  }

  public void setGender(Sex gender) {
    this.gender = gender;
  }

  public void printPerson() {
    System.out.println("Name : "  + this.name + ", Email: " + this.emailAddress + ", Gender: " + this.gender + ", BirthDate: " + this.birDate + ", Age: " + this.age);
  }

}