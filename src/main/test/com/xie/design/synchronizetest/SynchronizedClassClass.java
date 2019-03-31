package com.xie.design.synchronizetest;

/**
 * 类锁：*.class形式
 * @author: xyf
 * @date: 2019/3/30 22:29
 */
public class SynchronizedClassClass implements Runnable {
    static SynchronizedClassClass instance1 = new SynchronizedClassClass();
    static SynchronizedClassClass instance2 = new SynchronizedClassClass();
    @Override
    public void run() {
        method();
    }

    /**
     * 可以把 SynchronizedClassClass.class 换成 this 试试
     */
    private void method() {
        synchronized (SynchronizedClassClass.class) {
            System.out.println("我是类锁的class形式："+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "finished");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
    }
}
