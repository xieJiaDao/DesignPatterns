package com.xie.design.pattern.creational.factorymethod;

/**
 * @author: xyf
 * @date: 2019/3/30 14:47
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
