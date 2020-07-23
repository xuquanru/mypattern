package cn.xqrcloud.mypattern.抽象工厂模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-23 18:23
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Client {
    public static void main(String[] args) {
        MyFactory modernFactory = new ModernFactory();
        modernFactory.createFood();
        modernFactory.createWeapon();
        modernFactory.VEHICLE();
    }
}
