package com.xie.design.synchronizetest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: xyf
 * @date: 2019/4/1 21:16
 */
public class SynchronizedToLock {
    Lock lock = new ReentrantLock();

    public synchronized void method1 () {
        System.out.println("我是synchronized 修饰的锁头！");
    }
    public synchronized void method2 () {
        lock.lock();
        System.out.println("我是Lock形式的锁");
        lock.unlock();
    }

    public static void main(String[] args) {
        SynchronizedToLock synchronizedToLock = new SynchronizedToLock();
        synchronizedToLock.method1();
        synchronizedToLock.method2();
    }
}
