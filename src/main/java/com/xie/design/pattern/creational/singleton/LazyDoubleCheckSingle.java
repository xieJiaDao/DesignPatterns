package com.xie.design.pattern.creational.singleton;

/**
 * volatile 和 doublecheck 的懒汉
 * @author: xyf
 * @date: 2019/4/7 18:22
 */
public class LazyDoubleCheckSingle {
    //volatile 所有线程都可以看到共享内存的最新状态，保证了内存的可见性；缓存一致性协议
    private volatile static LazyDoubleCheckSingle lazyDoubleCheckSingle = null;

    private LazyDoubleCheckSingle() {

    }

    public synchronized static LazyDoubleCheckSingle getInstance() {
        if (lazyDoubleCheckSingle == null) {//来了个新的线程，当2 3 重排序的时候，正好运行了3，所以这个判断就会false 返回一个还没初始化的对象
            synchronized (LazyDoubleCheckSingle.class) {
                if (lazyDoubleCheckSingle == null) {
                    lazyDoubleCheckSingle = new LazyDoubleCheckSingle();//new 的时候有可能指令重排序。lazyDoubleCheckSingle已经不为null，但是
                    //new 做了哪些步骤:
                    //1. 分配内存给对象
                    //2. 初始化实例对象
                    //3. 设置lazyDoubleCheckSingle 指向刚分配的内存地址
                    //intra-thread semantics  - 保证指令重排不会改变单线程内的程序执行结果
                    //but，2，3两步可能会指令重排序，lazyDoubleCheckSingle已经指向内存地址了，但是对象还没初始化。这个时候调用对象的方法就会
                    //
                }
            }
        }
        return lazyDoubleCheckSingle;
    }

}
