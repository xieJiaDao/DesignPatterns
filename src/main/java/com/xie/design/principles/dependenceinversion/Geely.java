package com.xie.design.principles.dependenceinversion;

public class Geely {
    public void studyJavaCourse() {
        System.out.println("Geely在学习JAVA课程！");
    }
    public void studyJFeCourse() {
        System.out.println("Geely在学习Fe课程！");
    }

    /**
     * 假如我们又要学习python课程，我们就加了这个方法：这就是面向实现编程
     * 高层的test类（应用） 依赖低层的实现
     */
    public void studyPythonCourse() {
        System.out.println("Geely在学习Fe课程！");
    }
}
