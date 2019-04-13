package com.xie.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式  适合程序初始化的时候把多个单例放进map里统一管理。
 * 和spring容器是没关系的，但是可以类比
 * @author: xyf
 * @date: 2019/4/11 22:51
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    //线程不安全
    public static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object object) {
        if (key != null && !key.equals("") && object != null) {
            if (!singletonMap.containsKey(key))
                singletonMap.put(key, object);
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
