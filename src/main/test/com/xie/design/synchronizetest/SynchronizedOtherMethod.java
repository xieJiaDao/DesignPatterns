package com.xie.design.synchronizetest;

/**
 * 可重入性验证：可以调用同一个类的别的被synchronized修饰的方法
 * @author: xyf
 * @date: 2019/4/1 20:55
 */
public class SynchronizedOtherMethod {

    public static void main(String[] args) {
        new SynchronizedOtherMethod().method1();
    }

    private synchronized void method1() {
        System.out.println("这是method1： " );
        method2();
    }

    private synchronized void method2() {
        System.out.println("这是method2: " );
    }
}
