package com.xie.design.principles.dependenceinversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeelyTest {

    @Test
    public void studyJavaCourse() {
        Geely geely = new Geely();
        geely.studyJavaCourse();
    }

    @Test
    public void studyJFeCourse() {
        Geely geely = new Geely();
        geely.studyJFeCourse();
    }
}