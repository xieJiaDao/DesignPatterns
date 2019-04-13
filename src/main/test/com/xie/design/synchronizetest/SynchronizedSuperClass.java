package com.xie.design.synchronizetest;

/**
 * 可重入测试：调用其他类的方法
 * @author: xyf
 * @date: 2019/4/1 21:00
 */
public class SynchronizedSuperClass {
    public synchronized void doSomething() {
        System.out.println("我是super，我在搞点事情");
    }
}



class  Son extends SynchronizedSuperClass{
    public synchronized void doSomething() {
        System.out.println("我是子类,我在搞事情！");
        super.doSomething();
    }

    public static void main(String[] args) {
        new Son().doSomething();
    }
}
