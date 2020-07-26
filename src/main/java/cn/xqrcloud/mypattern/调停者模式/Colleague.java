package cn.xqrcloud.mypattern.调停者模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-26 00:19
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public  abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void getMsg (String userName, String msg){
        System.out.println("【"+this.name+"】收到"+"【"+userName+"】协调任务：["+msg+"]");
    }
    public void sendMsg (String name,String msg,Colleague colleague){
        System.out.println("【"+name+"】发起协调任务："+ msg);
        mediator.coordinate(name,msg,colleague);
    }

}
