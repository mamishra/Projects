package com.practice.Projects.mayur.checking;

import java.util.HashSet;

/**
 * Created by MAYUR on 7/22/20.
 */
public class temp {

  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 5, 7, 4, 3, 2, 3, 4, 6, 73, 2, 1, 3, 45, 1};
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    for (int a : set) {
      System.out.println(a);
    }
  }
}
