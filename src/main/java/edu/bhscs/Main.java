// Linus Ortiz
// P2
// Zero Hero
// 10/22/2025

/*
 * DESCRIPTION: Have a burger that the user chooses stuff about!
 * INPUT: How big of a burger!
 * OUTPUT: ASCII art buger of desired size
 * EDGE CASE: Is the burger beautiful and satisfactory
 */

package edu.bhscs;

public class Main {

  // Fields and Properties

  public static void main(String[] args) {

    System.out.println("                 ________________________________");
    System.out.println("/////////////////   Welcome to Burger Master!!   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    System.out.println();
    System.out.println();
    System.out.println();



    Player user = new Player("Burgermaster");

    String name = user.giveAnswer("What do you want to call your burger");
    int size = user.giveAnswerInt("How big of a burger do you want (in numerical value)");
    int height = user.giveAnswerInt("How many patties do you want on your buger?");



    new Burger().draw(size,height);

    System.out.println(name);

  }

}







