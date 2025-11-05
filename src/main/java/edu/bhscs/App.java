package edu.bhscs;

public class App {

  public class Main {
    public static void main(String[] args) {
      app();
    }

    public static void app() {
      Baker bob = new Baker("Bob");
      Table t = new Table(3, 15);
      Cake bDay = bob.bakes(5, "Suzzie");
      bDay.draw(t);
    }
  }
}











