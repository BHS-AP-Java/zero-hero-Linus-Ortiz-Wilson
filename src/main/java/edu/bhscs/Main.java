// Linus Ortiz
// P2
// Zero Hero
// 9/19/2025

/*
 * DESCRIPTION: Have a cake that can be different and be purchased (very inefficiently)
 * INPUT: What frosting and cake do you want?
 * OUTPUT: Is the cake for you
 * EDGE CASE: Is the cake satisfactory
 */

package edu.bhscs;

public class Main {

  // Fields and Properties

  public static void main(String[] args) {

    Player user = new Player("Usario P. Player");

    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("How old are you?");

    new Burger().draw(12); // name, age);

    System.out.println(name);
    System.out.println(age);
  }
}
