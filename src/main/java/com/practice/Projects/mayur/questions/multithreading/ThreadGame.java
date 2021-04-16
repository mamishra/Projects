package com.practice.Projects.mayur.questions.multithreading;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by MAYUR on 8/16/20.
 */
public class ThreadGame {

  private static int count = 0;
  static boolean keepRunning = true;

  final static Runnable countPrinter = () -> {
    while (keepRunning) {
      System.out.println(count);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      count++;
    }
  };

  public static void main(String[] args) throws IOException {
    new Thread(countPrinter).start();
    //System.in.read();
    Scanner scanner = new Scanner(System.in);
    Object object = scanner.nextLine();
    if (Objects.nonNull(object)) {
      keepRunning = false;
    }
    System.out.println("Lucky number : " + count);
  }

}
