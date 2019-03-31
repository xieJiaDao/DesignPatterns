package com.xie.design.pattern.creational.simplefactory;

/**
 * 简单工厂，创建各种video
 * 缺点，如果我们要加一个课程，我们需要修改代码，所以不符合开闭原则
 * @author: xyf
 * @date: 2019/3/30 13:30
 */
public class VideoFactory {
    /**
     * 根据type创建video
     * @param type
     * @return
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("Python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 这个方法较上个方法来说，更满足开闭原则
     * @param c
     * @return
     */
    public Video getVideoByClass(Class c) {
        Video video = null;
        try {
            Class videoClass = Class.forName(c.getName());
            video = (Video) videoClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }
}
