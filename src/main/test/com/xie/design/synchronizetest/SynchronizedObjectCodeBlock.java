package com.xie.design.synchronizetest;

/**
 * 对象锁
 *  同步代码块儿
 * @author: xyf
 * @date: 2019/3/30 21:30
 */
public class SynchronizedObjectCodeBlock implements Runnable{

    static SynchronizedObjectCodeBlock instance = new SynchronizedObjectCodeBlock();

    Object lock1 = new Object();
    Object lock2 = new Object();

//    @Override
//    public void run() {
//        synchronized (lock1) {
//            System.out.println("lock1:我是对象锁的代码块形式，我是：" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "lock1:运行结束！");
//        }
//        synchronized (lock2) {
//            System.out.println("lock2:我是对象锁的代码块形式，我是：" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "lock2:运行结束！");
//        }
//    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是对象锁的代码块形式，我是：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束！");
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("两个线程都已经执行完成！");
    }
}
