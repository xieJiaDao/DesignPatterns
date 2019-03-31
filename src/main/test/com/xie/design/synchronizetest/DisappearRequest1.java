package com.xie.design.synchronizetest;

/**
 * @author: xyf
 * @date: 2019/3/30 21:13
 */
public class DisappearRequest1 implements Runnable {

    private static DisappearRequest1 instance = new DisappearRequest1();

    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }

    @Override
    public void run() {
        synchronized (instance) {
            for (int j = 0; j < 100000; j++) {
                i++;
            }
        }
    }
}
