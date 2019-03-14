package com.xie.design.principles.openclose;

/**
 * Java课程 实现课程接口
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    /**
     * 构造方法--idea 快捷键 ALt + insert 再选择constructor
     */
    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

}
