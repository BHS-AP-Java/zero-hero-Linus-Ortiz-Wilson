package edu.bhscs;

public class Baker {
  // Fields and Properties
  String name = "";
  int size;
  // Constructor
  public Baker(String name) {
    this.name = name;
  }

  public void bakes (int size, String name){
    this.size = size;
    this.name = name;
  }

}

