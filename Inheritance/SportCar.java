package Inheritance;

public class SportCar extends Car {
  private boolean turbo;

  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo(Boolean turbo) {
    this.turbo = turbo;
  }

  @Override
  public String toString() {
    return "speed [" + speed + "], turbo [" + turbo + "]";
  }

  public static void main(String args[]) {
    SportCar sc = new SportCar();
    sc.SetSpeed(150);
    sc.setTurbo(true);

    System.out.println(sc.toString());
  }
}
