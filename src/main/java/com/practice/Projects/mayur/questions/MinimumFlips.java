package com.practice.Projects.mayur.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumFlips {
  /**
   * Given a binary String which represents the target state. Minimum number of flips needed to
   * convert a same size Binary String (with all 0’s)  to target state. A flip also causes all the
   * right bits to be flipped.
   * <p>
   * e.g.
   * <p>
   * Input : 00101 (Represents Target)
   * <p>
   * Output : 3
   * <p>
   * Explanation :
   * <p>
   * 00000 -> 00111 -> 00100 -> 00101
   *
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String pattern = scanner.next();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < pattern.length(); i++) {
      list.add(Integer.parseInt(pattern.substring(i, i + 1)));
    }
    List<Integer> input = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      input.add(0);
    }
    flip(input, list);

  }

  private static void flip(List<Integer> input, List<Integer> list) {
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) != input.get(i)) {
        setAll(input, list.get(i), i);
        count++;
      }
    }
    System.out.println(count);
  }

  private static void setAll(List<Integer> input, Integer integer, int i) {
    for (int j = i; j < input.size(); j++) {
      input.set(j, integer);
    }
  }
}
