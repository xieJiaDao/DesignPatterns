package com.xie.design.pattern.creational.singleton;

/**
 * 测试多线程使用懒汉式单例模式
 * @author: xyf
 * @date: 2019/4/7 17:58
 */
public class ThreadLazySingleton implements Runnable {

    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" 获取到的实例:" + lazySingleton);
    }
}
