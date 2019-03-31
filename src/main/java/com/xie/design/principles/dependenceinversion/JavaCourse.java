package com.xie.design.principles.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习JAVA课程！");
    }
}
