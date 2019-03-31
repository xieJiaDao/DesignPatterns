package com.xie.design.pattern.creational.factorymethod;

/**
 * @author: xyf
 * @date: 2019/3/30 13:18
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频！");
    }
}
