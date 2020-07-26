package cn.xqrcloud.mypattern.责任链模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-07-24 21:51
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class FilterChain implements MyFilter{
    private List<MyFilter> filters=new ArrayList<>();

    public FilterChain addFilter(MyFilter filter){
        filters.add(filter);
        return  this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        
        for (MyFilter filter : filters) {
            //其中有一个为false,就返回false
            if (!filter.doFilter(msg))return false;
        }
        return true;
    }
}
