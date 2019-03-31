package com.xie.design.pattern.creational.factorymethod;

/**
 * @author: xyf
 * @date: 2019/3/30 14:46
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
