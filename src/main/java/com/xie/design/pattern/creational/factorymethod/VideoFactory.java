package com.xie.design.pattern.creational.factorymethod;

/**
 * 工厂方法模式，具体创建对象交给子类去做
 * 当我们要扩展的时候不需要修改VideoFactory,只需要添加个子类就行，满足开闭原则；
 * 缺点，类个数太多
 * @author: xyf
 * @date: 2019/3/30 13:30
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
