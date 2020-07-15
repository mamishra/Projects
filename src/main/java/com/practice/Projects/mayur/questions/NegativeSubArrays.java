package com.practice.Projects.mayur.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NegativeSubArrays {

  /**
   *
   * Find number of negative sub arrays, from the given array
   *
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    int[] array = new int[numbers];
    for (int i = 0; i < numbers; i++) {
      array[i] = scanner.nextInt();
    }
    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    List<List<Integer>> subArrays = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j <= list.size(); j++) {
        if (i < j) {
          subArrays.add(list.subList(i, j));
        }
      }
    }
    int count = 0;
    for (List<Integer> integerList : subArrays) {
      if (integerList.stream().reduce(Integer::sum).get() < 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
