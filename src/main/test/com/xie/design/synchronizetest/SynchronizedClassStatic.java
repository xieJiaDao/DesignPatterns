package com.xie.design.synchronizetest;

/**
 * 类锁：static形式即加在一个静态方法上
 * @author: xyf
 * @date: 2019/3/30 22:21
 */
public class SynchronizedClassStatic implements Runnable{

    static SynchronizedClassStatic instance1 = new SynchronizedClassStatic();
    static SynchronizedClassStatic instance2 = new SynchronizedClassStatic();

    @Override
    public void run() {
        method();
    }

    /**
     * 测试的时候可以不加static看看！
     */
    public static synchronized void method(){
        System.out.println("我是类锁的static方法锁形式；我叫：" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "执行完毕！");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
    }
}
