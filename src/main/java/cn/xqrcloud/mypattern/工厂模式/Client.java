package cn.xqrcloud.mypattern.工厂模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-23 18:14
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Client {
    public static void main(String[] args) {
        //创建工厂
        FruitFactory fruitFactory = new FruitFactory();
        //工厂里面提供自己想要什么类就创建什么类
        Fruit fruit1 = fruitFactory.createApple();
        Fruit fruit2 = fruitFactory.createBanana();
        Fruit fruit3 = fruitFactory.createPear();
    }
}
