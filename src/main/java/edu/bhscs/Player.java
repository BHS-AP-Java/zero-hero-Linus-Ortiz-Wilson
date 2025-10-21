// Linus Ortiz
// P2
// Zero Hero
// 10/10/2025
package edu.bhscs;

import java.util.Scanner;

public class Player {

  // Fields and Propteries
  String name;
  Scanner s;

  public Player(String name) {

    this.name = name;
    this.s = new Scanner(System.in);
  }

  public void answerQuestions() {

    System.out.println("whats your question");

    String question = this.s.next();

    System.out.println(question);
  }

  public String giveAnswer(String question) {

    System.out.println(question);
    return s.nextLine();
  }
  ;
}
