package cn.xqrcloud.mypattern.调停者模式;

import org.apache.catalina.Manager;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-26 00:55
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl() ;
        Colleague employeeA = new AColleagueImpl("张三",mediator) ;
        Colleague employeeB = new BColleagueImpl("李四",mediator) ;
        employeeA.sendMsg(employeeA.name,"需要产品文档",employeeB);

    }
}
