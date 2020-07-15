package com.practice.Projects.mayur.questions;

import java.util.Arrays;

public class LongestSubarray {

  /**
   * Find the longest subarray in an array where the first element of the subarray is greater than
   * the last element. The entire array shouldnt be taken as a subarray.
   * <p>
   * Sample Input-
   * <p>
   * 1
   * <p>
   * 5 4 3 2 1
   * <p>
   * Sample output –
   * <p>
   * 5 4 3 2
   *
   * @param args
   */
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    int i = getMaxSubarray(arr);
    System.out.println(i);
  }

  private static int getMaxSubarray(int[] arr) {
    int max = 0;
    int count = 0;
    for (int j = 0; j < arr.length; j++) {
      if (max < arr.length - j + 1) {
        for (int i = j; i < arr.length; i++) {
          if (i + 1 < arr.length) {
            if (arr[i] > arr[i + 1]) {
              count++;
              if (max < count)
                max = count;
            } else {
              break;
            }
          }
        }
        count = 0;
      } else
        break;

    }
    return max + 1 == arr.length ? max : max + 1;
  }
}
