package cn.xqrcloud.mypattern.策略模式;

import java.util.Map;
import java.util.TreeMap;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-04-27 14:49
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class ShareMain {
    private static Map<String, DealContext> treeMap = new TreeMap<>();

    static {
        treeMap.put("sina", new DealContext("sina", new DealSina()));
        treeMap.put("wechat", new DealContext("wechat", new DealWeChat()));
    }

    public static void share(String type) {
        DealContext context = treeMap.get(type);
        DealStrategy strategy = context.getDealStrategy();
        strategy.dealMythod(type);
    }

    public static void main(String[] args) {
        share("sina");
        share("wechat");
    }
}
