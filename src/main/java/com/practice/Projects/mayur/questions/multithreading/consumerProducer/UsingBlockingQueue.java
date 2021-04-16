package com.practice.Projects.mayur.questions.multithreading.consumerProducer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by MAYUR on 8/15/20.
 */
public class UsingBlockingQueue {

  /**
   * Implementing producer consumer problem using blocking queue
   */

  public static void main(String[] args) {

    BlockingQueue<Item> itemBlockingDeque = new ArrayBlockingQueue(10);

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


