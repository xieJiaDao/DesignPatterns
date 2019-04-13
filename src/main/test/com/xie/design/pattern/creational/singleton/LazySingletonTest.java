package com.xie.design.pattern.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * @author: xyf
 * @date: 2019/4/7 17:51
 */
public class LazySingletonTest {
    @Test
    public void testGetInstance() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("program end!");
    }
    @Test
    public void testGetInstanceMoreThread() {
        Thread t1 = new Thread(new ThreadLazySingleton());
        Thread t2 = new Thread(new ThreadLazySingleton());
        t1.start();
        t2.start();
        System.out.println("program end!");
    }

    @Test
    public void testHungry() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    @Test
    public void testReflect() {
        Class clazz = HungrySingleton.class;
        try {
//            Constructor constructor = clazz.getConstructor();
            Constructor constructorDeclare = clazz.getDeclaredConstructor();
            constructorDeclare.setAccessible(true);
            HungrySingleton instance = HungrySingleton.getInstance();
            HungrySingleton newInstance = (HungrySingleton) constructorDeclare.newInstance();
            System.out.println(instance);
            System.out.println(newInstance);
            System.out.println(instance == newInstance);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}