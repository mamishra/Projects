package com.practice.Projects.mayur.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MAYUR on 8/21/20.
 */
public class Test {

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    A c = new B();

    List<A> aList = null;

    List<Integer> list = aList.stream().map(A::getNum).collect(Collectors.toList());

    System.out.println(list);

    a.m();
    b.m();
    c.m();
    a.met();
    b.met();
    c.met();
  }
}
