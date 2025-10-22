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

    System.out.println("                 _______________________________");
    System.out.println("/////////////////  Welcome to Burger Master!!   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    System.out.println();
    System.out.println();
    System.out.println();



    Player user = new Player("Burgermaster");

    String name = user.giveAnswer("What do you want to call your burger");
    int size = user.giveAnswerInt("How big of a burger do you want (in numerical value)");

    new Burger().draw(size);   //name, age);

    System.out.println(name);

  }

}







