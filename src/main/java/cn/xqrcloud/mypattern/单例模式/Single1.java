package cn.xqrcloud.mypattern.单例模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-21 14:55
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Single1 {
    //第一步纠正默认构造器为私有构造

    private Single1() {
    }

    //第二步骤，类加载时候直接实例化一个对象，类加载只有一次，实例也只有一次伴随

    private static final Single1 single = new Single1();


    //第三步提供外部访问这个实例的方法

    public static Single1 getInstance(){
        return  single;
    }
}
