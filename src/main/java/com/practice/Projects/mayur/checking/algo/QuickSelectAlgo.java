package com.practice.Projects.mayur.checking.algo;

/**
 * Created by MAYUR on 9/14/20.
 */


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Find the kth smallest element in an unsorted array of non-negative integers.
 */
public class QuickSelectAlgo {


  public static void main(String[] args) {

    Integer[] array =
        {74, 90, 85, 58, 69, 77, 90, 85, 18, 36};
    List<Integer> list = Stream.of(array).collect(Collectors.toList());
    int val = 1;

    System.out.println(getKthSmallest(list, val));
    Collections.sort(list);
    System.out.println(list);
  }

  private static int getKthSmallest(final List<Integer> list, int val) {
    int pivot = 0;
    List<Integer> left_list = new ArrayList<>();
    List<Integer> right_list = new ArrayList<>();
    List<Integer> middle_list = new ArrayList<>();
    //get a pivot = mid element
    //divide the other halfs into 2 left n right list, left_list elements <= pivot
    //if number of element in left list > no of elements to be searched, recur in left_list
    //recur in right list with val = val - left_list.size()

    Random random = new Random();
    pivot = list.get(random.nextInt(list.size()));

    for (Integer integer : list) {
      if (integer < pivot) {
        left_list.add(integer);
      } else if (integer > pivot) {
        right_list.add(integer);
      } else {
        middle_list.add(integer);
      }
    }

    if (left_list.size() + 1 == val) {
      return pivot;
    } else if (left_list.size() + 1 > val) {
      return getKthSmallest(left_list, val);
    } else if (left_list.size() + middle_list.size() < val) {
      return getKthSmallest(right_list, val - left_list.size() - middle_list.size());
    } else {
      return pivot;
    }
  }
}
