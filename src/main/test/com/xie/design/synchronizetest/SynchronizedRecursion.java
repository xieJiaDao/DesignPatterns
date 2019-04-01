package com.xie.design.synchronizetest;

/**
 * synchronized 的可重入性
 * 可重入粒度测试：递归调用本方法
 * @author: xyf
 * @date: 2019/4/1 20:34
 */
public class SynchronizedRecursion {
    private int i = 0;

    public static void main(String[] args) {
        new SynchronizedRecursion().method1();
    }

    private synchronized void method1() {
        System.out.println("这是method1： " + i);
        if (i == 0) {
            i ++;
            method1();
        }
    }
}
