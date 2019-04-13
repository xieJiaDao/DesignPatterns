package com.xie.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式：优点写法简单，在类加载的时候初始化，避免了多线程同步问题
 * 有可能浪费内存
 * @author: xyf
 * @date: 2019/4/7 19:52
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();//也可以使用静态代码块
//    static{
//        hungrySingleton = new HungrySingleton();
//    }
    private HungrySingleton() {
        if (hungrySingleton != null)
            throw new RuntimeException("单例构造器禁止反射调用！");
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }

}
