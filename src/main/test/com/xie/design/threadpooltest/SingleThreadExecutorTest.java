package com.xie.design.threadpooltest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newSingleThreadExecutor
 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。示例代码如下：
 * @author: xyf
 * @date: 2019/4/8 23:33
 */
public class SingleThreadExecutorTest {

    /**
     * 真香啊！实现Runnable 接口 和 继承 Thread 类 就能让我直接new MyThread 就能new个线程出来
     */
    static class MyThread extends Thread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "正在执行！");
        }


    }


    public static void main(String[] args) {


        Thread t1 = new MyThread();

        t1.start();

        ExecutorService singleThreadExceutor = Executors.newSingleThreadExecutor();
        ExecutorService singleThreadExceutor1 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExceutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
        singleThreadExceutor.shutdown();


    }
}
