package com.practice.Projects.mayur.questions.multithreading;

/**
 * Created by MAYUR on 8/16/20.
 */
public class OddEvenThreads {

  private static Integer counter = 0;
  static Object lock = new Object();

  public static void main(String[] args) {

    final Runnable oddPrint = () -> {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      while (true) {
        synchronized (lock) {
          while (counter % 2 == 0) {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(counter);
          counter++;
          lock.notifyAll();
        }
      }
    };

    final Runnable evenPrint = () -> {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      while (true) {
        synchronized (lock) {
          while (counter % 2 != 0) {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println(counter);
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          counter++;
          lock.notifyAll();
        }
      }
    };

    Thread oddThread = new Thread(oddPrint, "oddThread");
    Thread evenThread = new Thread(evenPrint, "evenThread");

    evenThread.start();
    oddThread.start();

  }
}
