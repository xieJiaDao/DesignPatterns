package com.xie.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式 单例模式
 * 懒汉式注重延时加载，只有使用它的时候才会初始化
 * @author: xyf
 * @date: 2019/4/7 17:44
 */
public class LazySingleton {
    //设计为null的原因是，做延时加载
    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;
    //构造器必须是private，限制外部创建（new）新的实例
    private LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止调用反射");
        }
    }


    /**
     * 提供public方法，方便外部获取实例
     * 这种方式是线程不安全的；有可能会同时进入new 实例的步骤，这样就不能保证单例了。但是我们可以加synchronized 同步方法快
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = LazySingleton.class;
        Constructor constructorDeclare = clazz.getDeclaredConstructor();
        constructorDeclare.setAccessible(true);

        LazySingleton instance = LazySingleton.getInstance();

        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance,true);

        LazySingleton newInstance = (LazySingleton) constructorDeclare.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
