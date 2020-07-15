package com.practice.Projects.mayur.questions;

import com.sun.tools.javac.util.Pair;

import java.util.Scanner;

public class TwoBots {
  /**
   * There are two kinds of bots A and B in a 1-D array. ‘A’ bot can only move left while ‘B’ can
   * only move right. There are also empty spaces in between represented by ‘#’. But it’s also given
   * that the bots cannot cross over each other. Given the initial state and another state, we
   * should tell if the transformation is possible.
   * <p>
   * Sample Input- 2 #B#A###BA# #B#A##A#B# Sample output- Yes No
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] arr = new String[2];
    for (int j = 0; j < n; j++) {
      arr[j] = scanner.next();
    }
    String result;
    if (arr[0].length() != arr[1].length()) {
      result = "No";
    } else {
      String temp1 = arr[0];
      String temp2 = arr[1];
      if (temp1.replaceAll("#", "") != temp2.replaceAll("#", "")) {
        result = "No";
      } else {
        result = "Yes";
      }
    }
    System.out.println(result);
  }
}
