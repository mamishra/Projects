package com.practice.Projects.mayur.questions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchArrayList {

  /*
  Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, List<Integer>> map = new HashMap<>();
    int testCases = scanner.nextInt();
    for (int i = 0; i < testCases; i++) {
      int size = scanner.nextInt();
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j < size; j++) {
        list.add(scanner.nextInt());
      }
      map.put(i + 1, list);
    }
    List<Integer> query = new ArrayList<>();
    int queries = scanner.nextInt();
    for (int i = 0; i < queries; i++) {
      query.add(scanner.nextInt());
      query.add(scanner.nextInt());
    }
    for (int i = 0; i < query.size(); i = i + 2) {
      if (map.get(query.get(i)).size() >= query.get(i + 1)) {
        System.out.println(map.get(query.get(i)).get(query.get(i + 1) - 1));
      } else {
        System.out.println("ERROR!");
      }
    }
  }
}
