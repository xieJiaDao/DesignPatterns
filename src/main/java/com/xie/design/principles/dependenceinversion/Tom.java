package com.xie.design.principles.dependenceinversion;

/**
 * 用依赖倒置原则
 */
public class Tom {
    /**
     * 核心思想：面向接口编程
     *
     * 具体学什么 是由应用Test 传来的参数决定
     * @param iCourse 课程接口-具体实现看参数
     */
    public void studyMoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
