package com.practice.Projects.mayur.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringTokens {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    String[] tokens = s.split("[\\s@.!_,'?\t]+");
    List<String> list = Arrays.stream(tokens).filter(tok -> !tok.isEmpty()).collect(Collectors.toList());
    System.out.println(list.size());
    list.forEach(tok -> System.out.println(tok));
    scan.close();
  }
}
