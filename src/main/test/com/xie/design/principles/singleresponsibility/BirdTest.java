package com.xie.design.principles.singleresponsibility;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void mainMoveMode() {
        Bird bird = new Bird();
        bird.mainMoveMode("笨鸟");
        bird.mainMoveMode("鸵鸟");
    }

    /**
     * 类的单一原则
     */
    @Test
    public void testWalkAndFly(){
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("企鹅");
    }
}