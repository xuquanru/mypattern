package cn.xqrcloud.mypattern.装饰模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-23 21:04
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Client {
    public static void main(String[] args) {
        MySource mySource = new MySourceImpl();
        MyOtherSource otherSource = new XOtherSourceImpl(mySource);
        otherSource.stop();//相当于在MySourceImpl 里面加了stop 扩展一样
        otherSource.operate();
    }
}
