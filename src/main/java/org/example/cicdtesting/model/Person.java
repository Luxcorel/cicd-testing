package org.example.cicdtesting.model;

import lombok.Data;

@Data
public class Person {

  private String name;
  private int age;

  public void doSomething() {
    try {
      System.out.println();
    } catch (Exception e) {}
  }

}
