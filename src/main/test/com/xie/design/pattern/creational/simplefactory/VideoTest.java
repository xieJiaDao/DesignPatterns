package com.xie.design.pattern.creational.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: xyf
 * @date: 2019/3/30 13:25
 */
public class VideoTest {
    @Test
    public void testJavaVideo () {
        Video javaVideo = new JavaVideo();
        javaVideo.produce();
    }

    @Test
    public void testPythonVideo () {
        Video javaVideo = new PythonVideo();
        javaVideo.produce();
    }
    @Test
    public void testVideoFactory(){
        Video video = new VideoFactory().getVideo("JAVA");
        if (video == null) {
            System.out.println("无法创建JAVA课程！");
        }
        video.produce();
    }

    @Test
    public void testVideoFactoryByClass() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideoByClass(JavaVideo.class);
        video.produce();
    }

    @Test
    public void testJDBC() {

    }
}
