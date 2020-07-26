package cn.xqrcloud.mypattern.装饰模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-23 21:00
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class XOtherSourceImpl extends  MyOtherSource{

    public XOtherSourceImpl(MySource mySource) {
        super(mySource);
    }

    @Override
    void stop() {
        System.err.println("X实现方法");
    }
}
