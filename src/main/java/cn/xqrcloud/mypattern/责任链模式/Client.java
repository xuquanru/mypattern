package cn.xqrcloud.mypattern.责任链模式;

import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-24 21:45
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Client {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setName("<abdfghj123456>");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new XFilterImpl())
                .addFilter(new YFilterImpl())
                .addFilter(new ZFilterImpl());

        FilterChain filterChain2 = new FilterChain()
        .addFilter(new AFilterImpl())
        .addFilter(new BFilterImpl())
        .addFilter(new CFilterImpl());

        filterChain.addFilter(filterChain2);
        filterChain.doFilter(msg);


        System.err.println(msg);

    }
}
