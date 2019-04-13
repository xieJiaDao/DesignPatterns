package com.xie.design.pattern.creational.singleton;

/**
 * ’带引号‘的单例：他只是针对一个线程是单例的
 * ThreadLocal 隔离了多个线程对数据的访问冲突；用空间换时间的方式，synchronized 以时间来换空间
 *
 * @author: xyf
 * @date: 2019/4/11 23:07
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
