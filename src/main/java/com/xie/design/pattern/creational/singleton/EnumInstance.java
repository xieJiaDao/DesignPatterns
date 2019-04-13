package com.xie.design.pattern.creational.singleton;

/**
 * 用枚举实现单例 --可能是最佳实现单例的方法
 * 枚举类 天然具有可序列化机制
 * @author: xyf
 * @date: 2019/4/11 22:27
 */
public enum EnumInstance {

    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }


}


