package com.practice.Projects.mayur.oops.polymorphism;

/**
 * Created by MAYUR on 8/21/20.
 */
public class Overloading {

  public void test(Integer a) {
    System.out.println("integer wala : "+a);
  }

  public void test(Object a) {
    System.out.println("object waala : "+a);
  }

  public void test2(int a) {
    System.out.println("int waala : "+a);
  }

  public void test2(double a) {
    System.out.println("double waala : "+a);
  }
}
