package com.xie.design.principles.openclose;

/**
 * 为什么不在JavaCourse 写获取折扣价格的方法呢？
 * 接口中有些方法，JavaCourse实现里也有些方法。当我们获取折扣这个功能需求下来的时候：
 * 我们改上述两个接口或者类的时候有可能改动已有的功能，或者影响到某些代码。
 * 于是我们就继承JavaCourse ，把获取折扣的方法写在这个子类里。不会对已有代码 功能产生影响。
 *
 *
 * 这样就是对扩展开放了。。
 * 而对于我们修改 上述接口 和 JavaCourse 就是关闭的了
 *
 * 越基础的类的改动影响越大，比如dao层  会影响 service  controller
 *
 */
public class JavaDiscountCourse extends JavaCourse {
    /**
     * 构造方法--idea 快捷键 ALt + insert 再选择constructor
     *
     * @param id
     * @param name
     * @param price
     */
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    //todo --里氏替换原则

}
