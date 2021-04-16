package com.practice.Projects.mayur.questions.multithreading.consumerProducer;

import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by MAYUR on 8/16/20.
 */
public class MyBlockingQueue<E> {

  private Queue<E> queue;
  private int size;
  private ReentrantLock lock = new ReentrantLock();
  private Condition notEmpty = lock.newCondition();
  private Condition notFull = lock.newCondition();

  public MyBlockingQueue(int size) {
    this.queue = new LinkedList<>();
    this.size = size;
  }

  public void put(E item) {
    lock.lock();
    try {
      while (queue.size() == size) {
        notFull.await();
      }
      queue.add(item);
      notEmpty.signalAll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public E take() {
    lock.lock();
    E item = null;
    try {
      while (queue.size() == 0) {
        notEmpty.await();
      }
      item = queue.remove();
      notFull.signalAll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
      return item;
    }
  }
}
