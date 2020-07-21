package cn.xqrcloud.mypattern.策略模式;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mypattern
 * 🍁 Description
 * 🍁 Author: Stephen
 * 🍁 Create: 2020-04-27 13:57
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class DealContext {
    private String type;
    private DealStrategy dealStrategy;

    public DealContext(String type, DealStrategy dealStrategy) {
        this.type = type;
        this.dealStrategy = dealStrategy;
    }

    public DealStrategy getDealStrategy() {
        return dealStrategy;
    }
}
