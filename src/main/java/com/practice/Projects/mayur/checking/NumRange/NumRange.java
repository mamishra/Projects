package com.practice.Projects.mayur.checking.NumRange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by MAYUR on 9/15/20.
 */
public class NumRange {

  public static void main(String[] args) {
    Integer[] array = {10, 5, 1, 0, 2};
    List<Integer> list = Stream.of(array).collect(Collectors.toList());
    System.out.println(numRange((ArrayList<Integer>) list, 6, 8));
  }

  public static int numRange(ArrayList<Integer> A, int B, int C) {
    int result = 0;
    List<Integer> lists = new ArrayList<>();
    for (int i = 0; i < A.size(); i++) {
      for (int j = i + 1; j <= A.size(); j++) {
        lists.add(A.subList(i, j).stream().reduce((a, b) -> a + b).get());
        //System.out.println(A.subList(i,j));
      }
    }

    for (int i = B; i <= C; i++) {
      for (int j = 0; j < lists.size(); j++) {
        if (lists.get(j) == i)
          result++;
      }
    }

    return result;
  }

}
