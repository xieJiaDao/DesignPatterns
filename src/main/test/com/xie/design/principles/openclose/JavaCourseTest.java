package com.xie.design.principles.openclose;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaCourseTest {

    @Test
    public void testOpenClose() {
        ICourse javaCourse = new JavaCourse(96, "designPatterns", 399d);
        System.out.println("课程id："+javaCourse.getId()+",课程名称:"+javaCourse.getName()+",课程价格:"+javaCourse.getPrice());
    }

    @Test
    public void testDiscount() {
        ICourse javaDisCourse = new JavaDiscountCourse(96, "designPatterns", 399d);
        //JavaDiscountCourse 里声明了一个获取原价的方法。但是父类声明的引用获取不到子类的特有方法

        System.out.println("课程id："+javaDisCourse.getId()+",课程名称:"+javaDisCourse.getName()+",课程价格:"+javaDisCourse.getPrice());
    }
}