package com.practice.Projects.mayur.questions;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BigDecimalSorting {

  /**
   * Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your
   * knowledge of them!
   * <p>
   * Given an array, , of  real number strings, sort them in descending order — but wait, there's
   * more! Each number must be printed in the exact same format as it was read from stdin, meaning
   * that  is printed as , and  is printed as . If two numbers represent numerically equivalent
   * values (e.g., ), then they must be listed in the same order as they were received as input).
   * <p>
   * Complete the code in the unlocked section of the editor below. You must rearrange array 's
   * elements according to the instructions above.
   * <p>
   * Input Format
   * <p>
   * The first line consists of a single integer, , denoting the number of integer strings. Each
   * line  of the  subsequent lines contains a real number denoting the value of .
   * <p>
   * Constraints
   * <p>
   * Each  has at most  digits. Output Format
   * <p>
   * Locked stub code in the editor will print the contents of array  to stdout. You are only
   * responsible for reordering the array's elements.
   */

  public static void main(String[] args) {
    //Input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n + 2];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    sc.close();

    //Write your code here

/*    Map<String, BigDecimal> map = new HashMap<>();
    for (String value : s) {
      if (value != null) {
        map.put(value, new BigDecimal(value));
      }
    }
    Map hashMap =
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors
                .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    AtomicInteger j = new AtomicInteger();
    hashMap.forEach((key, value) -> {
      s[j.get()] = (String) key;
      j.getAndIncrement();
    });*/

    //Second Approach
    Arrays.sort(s,0,n,new Comparator<Object>(){
      public int compare(Object a1, Object a2) {
        BigDecimal bigDec1 = new BigDecimal((String)a1);
        BigDecimal bigDec2 = new BigDecimal((String)a2);
        return bigDec2.compareTo(bigDec1);
      }
    });

    //Output
    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }


}
