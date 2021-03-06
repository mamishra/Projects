package com.practice.Projects.mayur.questions.multithreading.consumerProducer;

import java.util.Random;

/**
 * Created by MAYUR on 8/16/20.
 */
public class UsingWaitAndNotify {

  /**
   * Implementing producer consumer problem Wait and Notify
   */

  public static void main(String[] args) {

    SyncBlockingQueue<Item> itemBlockingDeque = new SyncBlockingQueue<Item>(10);

    Random random = new Random();
    //producer
    final Runnable producer = () -> {
      while (true) {
        try {
          Item item = new Item(random.nextInt(100), random.toString());
          itemBlockingDeque.put(item);
          System.out.println("Added to queue : " + item);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    new Thread(producer).start();
    new Thread(producer).start();

    //Consumer
    final Runnable consumer = () -> {
      while (true) {
        Item i;
        try {
          i = itemBlockingDeque.take();
          System.out.println("Taken from queue : " + i);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    new Thread(consumer).start();
    new Thread(consumer).start();
  }
}


