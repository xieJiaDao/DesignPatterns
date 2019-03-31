package com.xie.design.synchronizetest;

/**
 * 对象锁：方法锁形式
 * @author: xyf
 * @date: 2019/3/30 22:02
 */
public class SynchronizedObjectMethod implements Runnable{

    static SynchronizedObjectMethod instance = new SynchronizedObjectMethod();

    @Override
    public void run() {
        method1();
        method2();
    }

    public synchronized void method1(){
        System.out.println("method1 我是对象锁的方法锁形式；我叫：" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "method1 执行完毕！");
    }
    public synchronized void method2(){
        System.out.println("method2 我是对象锁的方法锁形式；我叫：" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "method2 执行完毕！");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        Thread t3 = new Thread(instance);
        t1.start();
        t2.start();
        t3.start();
    }
}
