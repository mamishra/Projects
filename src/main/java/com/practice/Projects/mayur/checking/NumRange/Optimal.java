package com.practice.Projects.mayur.checking.NumRange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by MAYUR on 9/15/20.
 */
public class Optimal {

  /**
   *
   * Here is an o(n) solution, the trick is to reduce this problem to finding sums less than a
   * single number and then use it twice to find the answer:
   *
   */

  public static void main(String[] args) {
    Integer[] array = {10, 5, 1, 0, 2};
    List<Integer> list = Stream.of(array).collect(Collectors.toList());
    System.out.println(numRange((ArrayList<Integer>) list, 6, 8));
  }

  public static int count(ArrayList<Integer> A, int n, int k) {
    int start = 0, end = 0;
    int count = 0;
    int sum = A.get(0);
    while (start < n && end < n) {
      if (sum < k) {
        end++;
        if (start <= end) {
          count += end - start;
        }
        if (end < n) {
          sum += A.get(end);
        }
      } else {
        sum -= A.get(start);
        start++;
      }
    }
    return count;
  }

  public static int numRange(ArrayList<Integer> A, int B, int C) {

    return count(A, A.size(), C + 1) - count(A, A.size(), B);

  }
}
