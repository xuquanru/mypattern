package cn.xqrcloud.mypattern.模板模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-05-05 23:52
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Template {
    public static void main(String[] args) {
        F f=new A();
        f.m();
    }
}

abstract class F {
    void m() {
        opt1();
        opt2();
    }

    abstract void opt1();

    abstract void opt2();
}


class A extends F{

    @Override
    void opt1() {
        System.err.println("opt1");
    }

    @Override
    void opt2() {
        System.err.println("opt2");
    }
}
