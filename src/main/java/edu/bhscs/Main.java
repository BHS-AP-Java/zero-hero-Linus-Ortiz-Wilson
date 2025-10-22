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

    Player user = new Player("Usario P. Player");

    //String name = user.giveAnswer("What do you want to call your burger");
    //String awesomeness  = user.giveAnswer("How awesome is the burger");
    int size = user.giveAnswerInt("How big of a burger do you want (in numerical value)");

    new Burger().draw(size);   //name, age);

    //System.out.println(name);
    //System.out.println(awesomeness);
  }

}







