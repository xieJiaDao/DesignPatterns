package com.xie.design.principles.dependenceinversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomTest {

    @Test
    public void studyMoocCourse() {
        Tom tom = new Tom();
        ICourse javaCourse = new JavaCourse();
        ICourse fECourse = new FECourse();
        ICourse pythonCourse = new PythonCourse();
        tom.studyMoocCourse(javaCourse);
        tom.studyMoocCourse(fECourse);
        tom.studyMoocCourse(pythonCourse);
    }
}