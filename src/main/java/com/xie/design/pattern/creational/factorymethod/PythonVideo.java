package com.xie.design.pattern.creational.factorymethod;

/**
 * @author: xyf
 * @date: 2019/3/30 13:19
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程！");
    }
}
