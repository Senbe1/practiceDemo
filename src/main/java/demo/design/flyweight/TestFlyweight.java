package demo.design.flyweight;

/**
 * 测试类（Client类）
 * @author liangzhijie
 * @version 1.0
 **/
public class TestFlyweight {
    public static void main(String[] args) throws InterruptedException {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.getFlyweight("黑");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("白");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("白");
        Flyweight flyweight4 = flyweightFactory.getFlyweight("白");

        flyweight1.deal(1);
        flyweight2.deal(1);
        flyweight3.deal(2);
        flyweight4.deal(3);
    }
}
