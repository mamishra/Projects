package com.practice.Projects.mayur.questions;

import java.util.ArrayList;
import java.util.List;

public class ClosestSum {
  /**
   * Given a sorted array and a number X, find a pair in array whose sum is closest to X. Input: The
   * first line of input contains an integer T denoting the number of test cases. The description of
   * T test cases follows. The first line of each test case contains a single integer N and X
   * denoting the size of array and value of X. The second line contains N space-separated integers
   * A1, A2, ..., AN denoting the elements of the array.
   */

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(4);
    list.add(7);
    list.add(10);
    int x = 15;
    printClosestSum(list,x);

  }

  private static void printClosestSum(List<Integer> list, int x) {
    int l = 0;
    int r = list.size()-1;
    int res_l=0;
    int res_r=0;
    int diff = Integer.MAX_VALUE;

    while (r>l) {
      if (Math.abs(list.get(l)+list.get(r)-x) < diff) {
        diff = Math.abs(list.get(l)+list.get(r)-x);
        res_l = l;
        res_r = r;
      }

      if (Math.abs(list.get(l)+list.get(r)-x) > diff)
        r--;
      else
        l++;
    }
    System.out.println(list.get(res_l)+"+"+list.get(res_r));
  }
}
