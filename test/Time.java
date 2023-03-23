package test;

public class Time {
  private int hour;
  private int minute;
  private int second;
  
  // first constructor
  public Time() {
    this(0, 0, 0);
  }

  // second constructor
  public Time(int h, int m, int s){
    // 조건 ? 참 : 거짓
    hour = (( h >= 0 && h < 24) ? h : 0);
    minute = (( m >= 0 && m < 60) ? m : 0);
    second = (( s >= 0 && s < 60) ? s : 0);
  }

  public String toString(){
    return String.format("%0ed:%02d:%02d", hour, minute, second);
  }
}
