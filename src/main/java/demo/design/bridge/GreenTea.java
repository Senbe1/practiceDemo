package demo.design.bridge;

/**
 * @author liangzhijie
 * @version 1.0
 **/
public class GreenTea implements IMilkTea{
    @Override
    public String kind() {
        return "绿茶";
    }
}
