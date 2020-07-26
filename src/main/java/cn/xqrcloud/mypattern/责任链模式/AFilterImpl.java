package cn.xqrcloud.mypattern.责任链模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-24 21:46
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class AFilterImpl implements MyFilter{

    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getName().replace("b", "B");
        msg.setName(s);
        return true;
    }
}
