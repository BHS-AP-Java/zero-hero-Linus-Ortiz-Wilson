package edu.bhscs;

import java.util.Scanner;

public class player {


  String name;
  Scanner s;

  public player(String name){

    this.name = name;
    this.s = new Scanner(System.in);
  }


    public void answerQuestions(){

      System.out.println("whats your question");

      String question = this.s.next();

      System.out.println(question);




  }
}