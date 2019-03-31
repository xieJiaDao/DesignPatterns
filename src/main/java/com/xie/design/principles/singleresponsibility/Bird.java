package com.xie.design.principles.singleresponsibility;

public class Bird {
    /**
     * 还有企鹅 等。。。
     * @param birdName
     */
    public  void mainMoveMode(String birdName) {
        if ("鸵鸟" .equals(birdName)) {
            System.out.println(birdName + "用翅膀飞");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
