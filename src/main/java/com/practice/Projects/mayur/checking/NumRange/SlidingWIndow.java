package com.practice.Projects.mayur.checking.NumRange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by MAYUR on 9/15/20.
 */
public class SlidingWIndow {

  public static void main(String[] args) {
    Integer[] array = {10, 5, 1, 0, 2};
    List<Integer> list = Stream.of(array).collect(Collectors.toList());
    System.out.println(numRange((ArrayList<Integer>) list, 6, 8));
  }

  private static int numRange(ArrayList<Integer> A, int B, int C) {
    int result = 0;
    for (int i = B; i <= C; i++) {
      result += getFeasibleSubSets(A, i);
    }
    return result;
  }

  private static int getFeasibleSubSets(ArrayList<Integer> list, int sum) {
    int count = 0;
    for (int window = 1; window <= list.size(); window++) {
      int windorSum = 0;
      for (int i = 0; i < window; i++) {
        windorSum += list.get(i);
      }
      if (windorSum == sum)
        count++;
      for (int i = window; i < list.size(); i++) {
        windorSum = windorSum + list.get(i) - list.get(i - window);
        if (windorSum == sum)
          count++;
      }
    }
    return count;
  }

}
