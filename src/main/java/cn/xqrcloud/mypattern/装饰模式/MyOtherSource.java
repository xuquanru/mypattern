package cn.xqrcloud.mypattern.装饰模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-23 20:53
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public abstract class MyOtherSource extends  MySource{
    private MySource mySource=null;

    public MyOtherSource(MySource mySource) {
        this.mySource = mySource;
    }

    @Override
    void operate() {
        mySource.operate();
    }

    //新增几个原始父类没有的方法，再具体的子类实现它
    abstract void stop();
}
