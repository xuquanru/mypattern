package cn.xqrcloud.mypattern.调停者模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-26 00:26
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class MediatorImpl extends Mediator{

    @Override
    void coordinate(String userName, String msg, Colleague colleague) {
        System.out.println("中介者接收【"+userName+"】的协调任务：" + msg);
        System.out.println("经理转发【"+userName+"】协调任务,@【"+colleague.name+"】");
        colleague.getMsg(userName,msg);
    }
}



