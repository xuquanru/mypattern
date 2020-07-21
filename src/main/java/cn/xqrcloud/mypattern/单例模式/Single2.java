package cn.xqrcloud.mypattern.单例模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-21 15:06
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Single2 {
    //第一步纠正默认构造器为私有构造

    private Single2() {
    }

    //第二步骤，加载外部类的时候不会加载内部类，实现懒汉加载

    private static class Single2Hold {
        public static final Single2 single=new Single2();
    }

    //第三步提供外部访问这个实例的方法

    public static Single2 getInstance(){
        return  Single2Hold.single;
    }
}
