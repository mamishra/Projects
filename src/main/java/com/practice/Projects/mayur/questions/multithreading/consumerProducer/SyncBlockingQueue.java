package com.practice.Projects.mayur.questions.multithreading.consumerProducer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by MAYUR on 8/16/20.
 */
public class SyncBlockingQueue<E> {

  private final Queue<E> queue;
  private final int size;

  public SyncBlockingQueue(int size) {
    this.queue = new LinkedList<>();
    this.size = size;
  }

  public void put(E item) {

    synchronized (queue){
      try {
        while (queue.size() == size) {
          queue.wait();
        }
        queue.add(item);
        queue.notifyAll();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public E take() {
    synchronized (queue){
      E item = null;
      try {
        while (queue.size() == 0) {
          queue.wait();
        }
        item = queue.remove();
        queue.notifyAll();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return item;
    }
  }
}

