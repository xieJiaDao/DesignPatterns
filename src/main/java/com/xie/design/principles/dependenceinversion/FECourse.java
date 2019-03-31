package com.xie.design.principles.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Fe课程！");
    }
}
