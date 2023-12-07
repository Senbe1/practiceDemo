package demo.design.bridge;

/**
 * @author liangzhijie
 * @version 1.0
 **/
public class BubbleTea implements IMilkTea{
    @Override
    public String kind() {
        return "珍珠奶茶";
    }
}
