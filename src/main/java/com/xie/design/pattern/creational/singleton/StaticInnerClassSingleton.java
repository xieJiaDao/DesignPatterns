package com.xie.design.pattern.creational.singleton;

/**
 * 使用静态内部类实现 单例
 * @author: xyf
 * @date: 2019/4/7 18:47
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
