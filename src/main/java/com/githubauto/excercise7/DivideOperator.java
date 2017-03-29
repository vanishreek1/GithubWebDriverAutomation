package com.githubauto.excercise7;

public class DivideOperator implements Operator {

  public int execute(int a, int b) {
    return (a / b);
  }

  @Override
  public String toString() {
    return "/";
  }



}
